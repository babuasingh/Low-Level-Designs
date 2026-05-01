package Movie_Booking_System.pricingstrategy;

import Movie_Booking_System.Entities.Seats;

import java.util.List;

public class WeekEndPricingStrategy implements PricingStrategy{
    private static final double hike = 1.1 ; //10% hike
    @Override
    public double calculateAmount(List<Seats> seatsList) {
        return seatsList.stream().mapToDouble(Seats::getPrice).sum()*hike;
    }
}
