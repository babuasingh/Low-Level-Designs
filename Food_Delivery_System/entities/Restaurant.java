package Food_Delivery_System.entities;

import Food_Delivery_System.ObserverDesign.OrderObserver;

import java.util.UUID;

public class Restaurant implements OrderObserver {
    private String id;
    private String name;
    private Menu menu;
    private Address address;

    public Restaurant(String name, Menu menu, Address address) {
        id = UUID.randomUUID().toString();
        this.name = name;
        this.menu = menu;
        this.address = address;
    }
    public Address getAddress() {
        return this.address;
    }

    public Menu getMenu() {
        return menu;
    }

    @Override
    public void OnUpdate(Order order) {
        System.out.printf("order %s status changes to %s", order.getId(), order.getOrderStatusState().getOrderStatus());
    }

}