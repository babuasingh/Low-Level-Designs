package Movie_Booking_System;

import Movie_Booking_System.Entities.Booking;
import Movie_Booking_System.Entities.Seats;
import Movie_Booking_System.Entities.Show;
import Movie_Booking_System.Entities.User;
import Movie_Booking_System.enums.BookingStatus;
import Movie_Booking_System.enums.SeatStatus;
import Movie_Booking_System.payment.payment;
import Movie_Booking_System.pricingstrategy.PricingStrategy;

import java.util.List;

public class BookingService {

    private SeatLockingManager seatLockingManager;
    BookingService(SeatLockingManager seatLockingManager){
        this.seatLockingManager = seatLockingManager;
    }

    public Booking bookShow(User user, Show show, List<Seats> seats, payment payment, PricingStrategy strategy){
        Booking booking = null;
        try {
            seatLockingManager.lockSeats(user,show,seats);

            double price = strategy.calculateAmount(seats);
            boolean result = payment.processPayment(price);

            if(result){
                for(Seats s:seats){
                    s.setSeatStatus(SeatStatus.BOOKED);
                }
                booking = new Booking.BookingBuilder()
                        .setUser(user)
                        .setShow(show)
                        .setSeats(seats)
                        .setStatus(BookingStatus.SUCCESS)
                        .build();
            }
            seatLockingManager.unlockSeats(user,show,seats);
        } catch (Exception e) {
            System.out.println("Seats you selected currently not available");
        }
        return booking;
    }

}
