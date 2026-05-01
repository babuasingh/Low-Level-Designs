package Parking_Lot.parkingLot;

import Parking_Lot.vehicles.Vehicle;

public class BikeParkingSpot extends parkingspot{
    public BikeParkingSpot(int spotNo){
        super(spotNo,"bike");
    }

    @Override
    public boolean canPark(Vehicle vehicle) {
        return vehicle.getTYpe().equalsIgnoreCase("bike");
    }
}
