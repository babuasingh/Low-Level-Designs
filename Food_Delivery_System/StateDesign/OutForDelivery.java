package Food_Delivery_System.StateDesign;

import Food_Delivery_System.entities.Order;
import Food_Delivery_System.enums.OrderStatus;

public class OutForDelivery implements OrderStatusState{
    @Override
    public void next(Order order) {
        order.setOrderStatusState(new DeliveredState());
    }

    @Override
    public void cancelOrder(Order order) {
        throw new RuntimeException("Not allowed now");
    }

    @Override
    public OrderStatus getOrderStatus() {
        return OrderStatus.OUT_FOR_DELIVERY;
    }
}
