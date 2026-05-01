package Movie_Booking_System.Entities;

import java.util.List;

public class Screen {
    private int screenNo;
    private List<Seats> seats;
    private Threatre threatre;

    public Screen(int screenNo, List<Seats> seats, Threatre threatre) {
        this.screenNo = screenNo;
        this.seats = seats;
        this.threatre = threatre;
    }

    public int getScreenNo() {
        return screenNo;
    }

    public List<Seats> getSeats() {
        return seats;
    }

    public Threatre getThreatre() {
        return threatre;
    }
}
