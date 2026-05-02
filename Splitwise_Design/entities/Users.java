package Splitwise_Design.entities;

public class Users {
    private String id;
    private String name;
    private String email;
    private BalanceSheet balanceSheet;

    public Users(String name, String email) {
        this.id = java.util.UUID.randomUUID().toString();
        this.name = name;
        this.email = email;
        this.balanceSheet = new BalanceSheet(this);
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}
