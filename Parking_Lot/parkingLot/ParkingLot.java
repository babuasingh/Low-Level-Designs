package Parking_Lot.parkingLot;

import Parking_Lot.vehicles.Vehicle;

import java.util.List;

public class ParkingLot {
    private List<parkingspot> parkingspotList;
    public ParkingLot(List<parkingspot> parkingspotList){
        this.parkingspotList=parkingspotList;
    }

    public parkingspot findParkingSpot(Vehicle vehicle){
        for(parkingspot spot : parkingspotList){
            if(spot.getisAvailable() && spot.canPark(vehicle)){
                spot.setVehicle(vehicle);
                return spot;
            }
        }
        return null;
    }

    public void VacateSpot(parkingspot spot){
        spot.setVehicle(null);
        spot.setIsAvailable(true);
    }

}
