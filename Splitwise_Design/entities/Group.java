package Splitwise_Design.entities;

import java.util.List;

public class Group {
    private String id;
    private String name;
    private String description;
    private List<Users> members;
    private Expense expense;

    public Group(String name, String description, List<Users> members) {
        this.id = java.util.UUID.randomUUID().toString();
        this.name = name;
        this.description = description;
        this.members = members;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public List<Users> getMembers() {
        return members;
    }
}
