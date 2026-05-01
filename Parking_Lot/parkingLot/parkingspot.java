package Parking_Lot.parkingLot;

import Parking_Lot.vehicles.Vehicle;

public abstract class parkingspot {
    private int spotNo;
    private Vehicle vehicle;
    private boolean isAvailable;
    private String spotType;

    public parkingspot(int spotNo,String spotType){
        this.spotType = spotType;
        this.spotNo=spotNo;
        isAvailable=true;
    }


    public int getSpotNo(){
        return spotNo;
    }

    public String getSpotType(){
        return spotType;
    }

    public void setVehicle(Vehicle vehicle){
        this.vehicle=vehicle;
        isAvailable=false;
    }

    public Vehicle getVehicle(){
        return vehicle;
    }

    public boolean getisAvailable(){
        return isAvailable;
    }

    public void setIsAvailable(boolean val){
        this.isAvailable=val;
    }

    public abstract boolean canPark(Vehicle vehicle);

    @Override
    public String toString() {
        return "parkingspot{" +
                "spotNo=" + spotNo +
                ", vehicle=" + vehicle +
                ", isAvailable=" + isAvailable +
                ", spotType='" + spotType + '\'' +
                '}';
    }
}
