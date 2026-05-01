package Movie_Booking_System.payment;

public class UPI implements payment {

    @Override
    public boolean processPayment(double amount) {
        System.out.println("Payment of rupees "+amount+" done by UPI");
        return Math.random() > 0.5;
    }
}
