package Movie_Booking_System;

import Movie_Booking_System.Entities.Seats;
import Movie_Booking_System.Entities.Show;
import Movie_Booking_System.Entities.User;
import Movie_Booking_System.enums.SeatStatus;

import java.util.List;
import java.util.Map;
import java.util.concurrent.*;

public class SeatLockingManager {

    private final static long TIMEOUT = 10000;

    private Map<Show , Map<Seats , String>> lockedSeats = new ConcurrentHashMap<>();
    private ScheduledExecutorService service = Executors.newScheduledThreadPool(1);

    public void lockSeats(User user, Show show, List<Seats> seats) {
        synchronized (show){
            for(Seats s:seats){
                if(s.getSeatStatus() != SeatStatus.AVAILABLE){
                    System.out.println("Seats not available for booking");
                    return;
                }
            }

            for(Seats s:seats){
                s.setSeatStatus(SeatStatus.LOCKED);
            }

            lockedSeats.computeIfAbsent(show,k-> new ConcurrentHashMap<>());

            for(Seats s:seats){
                lockedSeats.get(show).put(s, user.getId());
            }

            service.schedule(()->unlockSeats(user,show,seats) ,TIMEOUT, TimeUnit.SECONDS);
        }
    }

    public void unlockSeats(User user, Show show, List<Seats> seats) {
        synchronized (show){
            Map<Seats,String> currShowLockedSeats = lockedSeats.get(show);
            for(Seats s:seats){
                // if the seat is locked by the same user , then you can change the status
                if(currShowLockedSeats.containsKey(s) && currShowLockedSeats.get(s).equalsIgnoreCase(user.getId())){
                    currShowLockedSeats.remove(s);
                    if(s.getSeatStatus()==SeatStatus.LOCKED){
                        System.out.println("Unlocked the seats due to timeout");
                        s.setSeatStatus(SeatStatus.AVAILABLE);
                    }else{
                        System.out.println("Seats have been booked");
                    }

                }
            }
            if(currShowLockedSeats.isEmpty()){
                lockedSeats.remove(show);
            }
        }
    }
}
