package Movie_Booking_System.pricingstrategy;

import Movie_Booking_System.Entities.Seats;

import java.util.List;

public interface PricingStrategy {
    public double calculateAmount(List<Seats> seatsList);
}
