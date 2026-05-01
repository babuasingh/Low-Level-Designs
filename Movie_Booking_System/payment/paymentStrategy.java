package Movie_Booking_System.payment;

// strategy design pattern for payment processing

public class paymentStrategy {

    private payment payment;

    public paymentStrategy(payment payment){
        this.payment=payment;
    }

    public void processFee(double amount){
        payment.processPayment(amount);
    }


}
