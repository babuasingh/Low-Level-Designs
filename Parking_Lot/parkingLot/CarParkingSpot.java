package Parking_Lot.parkingLot;

import Parking_Lot.vehicles.Vehicle;

public class CarParkingSpot extends parkingspot{
    public CarParkingSpot(int spotNo){
        super(spotNo,"car");
    }

    @Override
    public boolean canPark(Vehicle vehicle) {
        return vehicle.getTYpe().equalsIgnoreCase("car");
    }
}
