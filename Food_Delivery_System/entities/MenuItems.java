package Food_Delivery_System.entities;

import java.util.UUID;

public class MenuItems {
    private String id;
    private String name;
    private double price;
    private boolean available;

    public MenuItems(String name,double price) {
        this.name = name;
        id = UUID.randomUUID().toString();
        this.price=price;
        available = true;
    }

    public String getName() {
        return name;
    }

}
