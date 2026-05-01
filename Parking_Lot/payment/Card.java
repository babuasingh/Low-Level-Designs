package Parking_Lot.payment;

public class Card implements payment{
    @Override
    public void processPayment(double amount) {
        System.out.println("Payment of rupees "+amount+" done by Card");
    }
}
