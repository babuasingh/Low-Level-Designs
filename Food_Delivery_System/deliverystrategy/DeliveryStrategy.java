package Food_Delivery_System.deliverystrategy;

import Food_Delivery_System.entities.DeliveryAgent;
import Food_Delivery_System.entities.Order;

import java.util.List;
import java.util.Optional;


// strategy design for selecting nearest delivery partner
public interface DeliveryStrategy {
    Optional<DeliveryAgent> getDeliveryAgent(Order order, List<DeliveryAgent> agents);
}
