package Parking_Lot.payment;

// strategy design pattern for payment processing

public class paymentStrategy {

    private final payment payment;
    public paymentStrategy(payment payment){
        this.payment=payment;
    }

    public void processParkingFee(double amount){
        payment.processPayment(amount);
    }

}
