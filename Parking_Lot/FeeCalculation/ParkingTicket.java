package Parking_Lot.FeeCalculation;

import Parking_Lot.parkingLot.parkingspot;
import Parking_Lot.vehicles.Vehicle;

import java.time.LocalDateTime;

public class ParkingTicket {

    private Vehicle vehicle;
    private LocalDateTime entryTime;
    private parkingspot spot;

    public ParkingTicket(Vehicle vehicle,LocalDateTime entryTime,parkingspot spot){
        this.vehicle=vehicle;
        this.entryTime=entryTime;
        this.spot=spot;
    }
    public LocalDateTime getEntryTime(){
        return entryTime;
    }
    public Vehicle getVehicle(){
        return vehicle;
    }

}
