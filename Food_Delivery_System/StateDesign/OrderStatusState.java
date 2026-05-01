package Food_Delivery_System.StateDesign;

import Food_Delivery_System.entities.Order;
import Food_Delivery_System.enums.OrderStatus;

public interface OrderStatusState {
    void next(Order order);
    void cancelOrder(Order order);
    OrderStatus getOrderStatus();
}
