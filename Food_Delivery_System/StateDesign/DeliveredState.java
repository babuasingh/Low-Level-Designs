package Food_Delivery_System.StateDesign;

import Food_Delivery_System.entities.Order;
import Food_Delivery_System.enums.OrderStatus;

public class DeliveredState implements OrderStatusState {

    @Override
    public void next(Order order) {

    }

    @Override
    public void cancelOrder(Order order) {

    }

    @Override
    public OrderStatus getOrderStatus() {
        return OrderStatus.DELIVERED;
    }
}
