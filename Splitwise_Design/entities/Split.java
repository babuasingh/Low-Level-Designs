package Splitwise_Design.entities;

import Splitwise_Design.strategy.SplitStrategy;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Split {
    private Users paidByUser;
    private double amount;
    private List<Users> participants;
    private SplitStrategy splitStrategy;
    private Map<String, Double> splits = new ConcurrentHashMap<>();

    public Split(Users paidByUser, double amount, List<Users> participants, SplitStrategy splitStrategy) {
        this.paidByUser = paidByUser;
        this.amount = amount;
        this.participants = participants;
        this.splitStrategy = splitStrategy;
    }

    public void calculateSplits() {
        this.splits = splitStrategy.calculateSplits(amount, participants);
    }

    public Users getPaidByUser() {
        return paidByUser;
    }

    public double getAmount() {
        return amount;
    }

    public List<Users> getParticipants() {
        return participants;
    }

    public SplitStrategy getSplitStrategy() {
        return splitStrategy;
    }

    public double getAmountOwedByUserToUserWhoPaid(String userId) {
        return splits.getOrDefault(userId, 0.0);
    }

}
