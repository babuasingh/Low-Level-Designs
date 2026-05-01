package Parking_Lot.FeeCalculation;

import Parking_Lot.payment.payment;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class CalculateFeeAmount {

    private ParkingTicket parkingTicket;

    public CalculateFeeAmount(ParkingTicket parkingTicket){
        this.parkingTicket=parkingTicket;
    }

    public double Calculate(){
        double amount=0;
        LocalDateTime current = LocalDateTime.now();
        LocalDateTime entry = parkingTicket.getEntryTime();

        long durationInMinutes = Duration.between(entry,current).toMinutes();
        long hours = durationInMinutes/60;
        if(durationInMinutes%60!=0)
            hours++;
        amount = hours*parkingTicket.getVehicle().HourlyCharge;
        return amount;
    }

}
