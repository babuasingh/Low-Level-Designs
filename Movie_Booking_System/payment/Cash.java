package Movie_Booking_System.payment;

public class Cash implements payment {

    @Override
    public boolean processPayment(double amount) {
        System.out.println("Payment of rupees "+amount+" being done by Cash");
        return Math.random() > 0.5;
    }
}
