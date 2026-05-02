package Splitwise_Design.strategy;

import Splitwise_Design.entities.Users;
import Splitwise_Design.enums.SplitType;

import java.util.List;
import java.util.Map;

public class PercentageSplitStrategy implements SplitStrategy{
    @Override
    public Map<String, Double> calculateSplits(double totalAmount, List<Users> participants) {
        return List.of();
    }

    @Override
    public SplitType getSplitType() {
        return SplitType.PERCENTAGE;
    }
}
