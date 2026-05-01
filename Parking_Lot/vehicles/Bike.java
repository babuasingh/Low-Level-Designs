package Parking_Lot.vehicles;

public class Bike extends Vehicle{
    Bike(String license,double hourlycharge){
        super(license,hourlycharge);
    }

    @Override
    public String getTYpe() {
        return "bike";
    }
}
