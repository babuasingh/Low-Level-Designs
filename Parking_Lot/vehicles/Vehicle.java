package Parking_Lot.vehicles;

public abstract class Vehicle {
    public String license;
    public double HourlyCharge;
    Vehicle(String license,double charge){
        this.license=license;
        this.HourlyCharge=charge;
    }

    public abstract String getTYpe();
}