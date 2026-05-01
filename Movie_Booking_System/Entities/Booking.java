package Movie_Booking_System.Entities;

import Movie_Booking_System.enums.BookingStatus;

import java.util.List;

public class Booking {
    private String bookingId;
    private User user;
    private Show show;
    private List<Seats> seatsList;
    private BookingStatus bookingStatus;

    private Booking(User user, Show show, List<Seats> seatsList) {
        this.bookingId = bookingId;
        this.user = user;
        this.show = show;
        this.seatsList = seatsList;
    }

    public String getBookingId() {
        return bookingId;
    }

    public User getUser() {
        return user;
    }

    public Show getShow() {
        return show;
    }

    public List<Seats> getSeatsList() {
        return seatsList;
    }

    public BookingStatus getBookingStatus() {
        return bookingStatus;
    }

    public void setBookingStatus(BookingStatus bookingStatus){
        this.bookingStatus = bookingStatus;
    }

    public static class BookingBuilder{
        private User user;
        private Show show;
        private List<Seats> seats;
        private BookingStatus status;

        public BookingBuilder setUser(User user){
            this.user = user;
            return this;
        }

        public BookingBuilder setShow(Show show){
            this.show=show;
            return this;
        }

        public BookingBuilder setSeats(List<Seats> seats){
            this.seats = seats;
            return this;
        }

        public BookingBuilder setStatus(BookingStatus status){
            this.status = status;
            return this;
        }

        public Booking build(){
            return new Booking(user,show,seats);
        }

    }

}
