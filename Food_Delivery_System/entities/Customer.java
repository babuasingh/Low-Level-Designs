package Food_Delivery_System.entities;

import java.util.UUID;

public class Customer extends User {
    private String phone;
    private Address address;

    public Customer(String id, String name, String phone, Address address) {
        super(id, name);
        this.phone = phone;
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public Address getAddress() {
        return address;
    }

    @Override
    public void OnUpdate(Order order) {
        System.out.printf("order %s status changes to %s", order.getId(), order.getOrderStatusState().getOrderStatus());
    }
}