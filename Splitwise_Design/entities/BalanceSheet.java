package Splitwise_Design.entities;

import java.util.Map;

public class BalanceSheet {
    private final Users user;
    private Map<String, Double> owedTo; // Map of userId to amount owed to that user
    private Map<String, Double> owedBy; // Map of userId to amount owed by that user

    public BalanceSheet(Users user) {
        this.user = user;
    }

    public Users getUser() {
        return user;
    }

    // Method to get total amount owed to this user by others
    public double getTotalAmountOwedToThisUser() {
        return owedBy.values().stream().mapToDouble(Double::doubleValue).sum();
    }

    public double getTotalAmountOwedByThisUser() {
        return owedTo.values().stream().mapToDouble(Double::doubleValue).sum();
    }

}
