package Parking_Lot.payment;

public class Cash implements payment{

    @Override
    public void processPayment(double amount) {
        System.out.println("Payment of rupees "+amount+" done by Cash");
    }
}
