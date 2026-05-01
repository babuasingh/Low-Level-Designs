package Food_Delivery_System.deliverystrategy;

import Food_Delivery_System.entities.Address;
import Food_Delivery_System.entities.DeliveryAgent;
import Food_Delivery_System.entities.Order;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class NearestDeliveryAgent implements DeliveryStrategy{

    @Override
    public Optional<DeliveryAgent> getDeliveryAgent(Order order, List<DeliveryAgent> agents) {
        return agents.stream()
                .filter(DeliveryAgent::isAvailable)
                .min(Comparator.comparingDouble(curragent -> calculateTotalDistance(curragent,order.getRestaurant().getAddress() , order.getCustomer().getAddress())));
    }

    private double calculateTotalDistance(DeliveryAgent agent, Address restaurantAddress, Address customerAddress) {
        double agentToRestaurantDist = agent.getAddress().compareAbsoluteDistance(restaurantAddress);
        double restaurantToCustomerDist = restaurantAddress.compareAbsoluteDistance(customerAddress);
        return agentToRestaurantDist + restaurantToCustomerDist;
    }
}
