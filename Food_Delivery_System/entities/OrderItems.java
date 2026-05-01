package Food_Delivery_System.entities;

import java.util.List;

public class OrderItems {
    private List<MenuItems> menuItemsList;
    private double quantity;

    public OrderItems(List<MenuItems> menuItemsList, double quantity) {
        this.menuItemsList = menuItemsList;
        this.quantity = quantity;
    }

}
