package Parking_Lot.vehicles;

public class Car extends Vehicle{
    Car(String license,double hourlycharge){
        super(license,hourlycharge);
    }

    @Override
    public String getTYpe() {
        return "car";
    }
}
