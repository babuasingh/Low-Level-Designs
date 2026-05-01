package Food_Delivery_System.StateDesign;

import Food_Delivery_System.entities.Order;
import Food_Delivery_System.enums.OrderStatus;

public class PreparingState implements OrderStatusState{
    @Override
    public void next(Order order) {
        order.setOrderStatusState(new ReadyForPickUp());
    }

    @Override
    public void cancelOrder(Order order) {
        order.setOrderStatusState(new CancelledState());
    }

    @Override
    public OrderStatus getOrderStatus() {
        return OrderStatus.PREPARING;
    }
}
