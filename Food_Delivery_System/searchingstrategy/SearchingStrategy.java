package Food_Delivery_System.searchingstrategy;

import Food_Delivery_System.entities.Restaurant;

import java.util.List;

public interface SearchingStrategy {
     List<Restaurant> filteredRestaurant(List<Restaurant> allRestaurants);
}
