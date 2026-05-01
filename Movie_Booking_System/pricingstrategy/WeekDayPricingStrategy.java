package Movie_Booking_System.pricingstrategy;

import Movie_Booking_System.Entities.Seats;

import java.util.List;

public class WeekDayPricingStrategy implements PricingStrategy{

    @Override
    public double calculateAmount(List<Seats> seatsList) {
        return seatsList.stream().mapToDouble(Seats::getPrice).sum();
    }
}
