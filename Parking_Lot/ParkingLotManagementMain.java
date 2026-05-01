package Parking_Lot;

import Parking_Lot.FeeCalculation.CalculateFeeAmount;
import Parking_Lot.FeeCalculation.ParkingTicket;
import Parking_Lot.parkingLot.BikeParkingSpot;
import Parking_Lot.parkingLot.CarParkingSpot;
import Parking_Lot.parkingLot.ParkingLot;
import Parking_Lot.parkingLot.parkingspot;
import Parking_Lot.payment.Card;
import Parking_Lot.payment.paymentStrategy;
import Parking_Lot.vehicles.Vehicle;
import Parking_Lot.vehicles.VehicleFactory;

import java.time.LocalDateTime;
import java.util.List;

public class ParkingLotManagementMain {
    public static void main(String[] args) throws InterruptedException {

        List<parkingspot> parkingspots = List.of(
                new CarParkingSpot(1),
                new BikeParkingSpot(2),
                new CarParkingSpot(3),
                new BikeParkingSpot(4)
        );

        ParkingLot parkingLot=new ParkingLot(parkingspots);

        Vehicle car1= VehicleFactory.getVehicle("car","abcd",100);
        Vehicle bike1 = VehicleFactory.getVehicle("bike","efgh",50);

//        Vehicle car2 = VehicleFactory.getVehicle("car","xyza",100);
//        Vehicle car3 = VehicleFactory.getVehicle("car","bcda",100);

        parkingspot spot1 = parkingLot.findParkingSpot(car1);
        System.out.println(spot1);

//        parkingspot spot2 = parkingLot.findParkingSpot(bike1);
//        System.out.println(spot2);

        ParkingTicket ticket1 = new ParkingTicket(car1, LocalDateTime.now().minusHours(5),spot1);


        double amount = new CalculateFeeAmount(ticket1).Calculate();
        System.out.println("Parking Fee "+amount);


        paymentStrategy strategy = new paymentStrategy(new Card());
        strategy.processParkingFee(amount);

        parkingLot.VacateSpot(spot1);
        System.out.println(spot1);
    }
}
