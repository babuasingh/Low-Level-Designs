package Food_Delivery_System.StateDesign;

import Food_Delivery_System.entities.Order;
import Food_Delivery_System.enums.OrderStatus;

public class CancelledState implements OrderStatusState{
    @Override
    public void next(Order order) {
        // no state to go next ;
    }

    @Override
    public void cancelOrder(Order order) {
        // already cancelled state ;
    }

    @Override
    public OrderStatus getOrderStatus() {
        return OrderStatus.CANCELLED;
    }
}
