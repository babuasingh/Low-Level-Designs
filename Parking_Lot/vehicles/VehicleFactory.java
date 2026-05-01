package Parking_Lot.vehicles;

//Factory Design Pattern for Vehicle Creation

public class VehicleFactory {
    private static Vehicle vehicle;
    public static Vehicle getVehicle(String type,String license,double hourlyCharge){
        if(type.equalsIgnoreCase("car"))
            vehicle = new Car(license,hourlyCharge);
        else if(type.equalsIgnoreCase("bike"))
            vehicle = new Bike(license,hourlyCharge);
        else vehicle = null;
        return vehicle;
    }
}
