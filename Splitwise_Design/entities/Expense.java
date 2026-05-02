package Splitwise_Design.entities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Expense {
    private String id;
    private String description;
    private double amount;
    private String groupId;
    private List<Split> splits = Collections.synchronizedList(new ArrayList<>());

    public Expense(String description, double amount, String group) {
        this.id = java.util.UUID.randomUUID().toString();
        this.description = description;
        this.amount = amount;
        this.groupId = group;
    }

    public String getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public double getAmount() {
        return amount;
    }

    public String getGroupId() {
        return groupId;
    }

    public List<Split> getAllSplits() {
        return splits;
    }

    public void addSplit(Split split) {
        splits.add(split);
    }
}
