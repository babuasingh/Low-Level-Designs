package Movie_Booking_System.Entities;

import Movie_Booking_System.enums.PaymentStatus;

public class Payment {
    private String transactionId;
    private PaymentStatus paymentStatus;
    private double amount;

    public Payment(String transactionId, PaymentStatus paymentStatus, double amount) {
        this.transactionId = transactionId;
        this.paymentStatus = paymentStatus;
        this.amount = amount;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public PaymentStatus getPaymentStatus() {
        return paymentStatus;
    }

    public double getAmount() {
        return amount;
    }
}
