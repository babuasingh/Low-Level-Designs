package Movie_Booking_System.payment;

public class Card implements payment {
    @Override
    public boolean processPayment(double amount) {
        System.out.println("Payment of rupees "+amount+" being done by Card");
        return Math.random() > 0.5;
    }
}
