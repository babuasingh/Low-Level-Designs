package Splitwise_Design.entities;

public class Transaction {
    private Users from;
    private Users to;
    private double amount;

    public Transaction(Users from, Users to, double amount) {
        this.from = from;
        this.to = to;
        this.amount = amount;
    }

    public Users getFrom() {
        return from;
    }

    public Users getTo() {
        return to;
    }

    public double getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return from.getName() + " paid " + to.getName() + " amount $" + String.format("%.2f", amount);
    }
}
