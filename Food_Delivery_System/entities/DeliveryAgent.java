package Food_Delivery_System.entities;

import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;

public class DeliveryAgent extends User{
    private String phoneNumber;
    private AtomicBoolean isAvailable = new AtomicBoolean(true);
    private Address address;

    public DeliveryAgent(String id,String name, String phoneNumber,Address address) {
        super(id,name);
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public boolean isAvailable() {
        return isAvailable.get();
    }

    public void setAvailable(boolean available) {
        isAvailable.set(available);
    }

    public Address getAddress(){
        return this.address;
    }

    @Override
    public void OnUpdate(Order order) {
        System.out.printf("order %s status changes to %s", order.getId(), order.getOrderStatusState().getOrderStatus());
    }
}
