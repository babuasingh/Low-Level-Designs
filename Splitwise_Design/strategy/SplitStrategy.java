package Splitwise_Design.strategy;

import Splitwise_Design.entities.Users;
import Splitwise_Design.enums.SplitType;

import java.util.List;
import java.util.Map;

public interface SplitStrategy {
    public Map<String,Double> calculateSplits(double totalAmount, List<Users> participants);

    public SplitType getSplitType();
}
