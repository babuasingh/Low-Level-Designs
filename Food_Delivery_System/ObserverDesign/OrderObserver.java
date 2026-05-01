package Food_Delivery_System.ObserverDesign;

import Food_Delivery_System.entities.Order;

public interface OrderObserver {
    void OnUpdate(Order order);
}