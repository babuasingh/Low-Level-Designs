package Movie_Booking_System.Entities;

import Movie_Booking_System.enums.SeatStatus;
import Movie_Booking_System.enums.SeatType;

public class Seats {
    private int seatNo;
    private SeatType seatType;
    private SeatStatus seatStatus;
    private double price;

    public double getPrice(){
        return price;
    }

    public int getSeatNo(){
        return seatNo;
    }

    public void setSeatNo(int seatNo){
        this.seatNo = seatNo;
    }

    public SeatType getSeatType() {
        return seatType;
    }

    public void setSeatType(SeatType seatType) {
        this.seatType = seatType;
    }

    public SeatStatus getSeatStatus() {
        return seatStatus;
    }

    public void setSeatStatus(SeatStatus seatStatus) {
        this.seatStatus = seatStatus;
    }
}
