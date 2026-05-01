package Food_Delivery_System.searchingstrategy;

import Food_Delivery_System.entities.Restaurant;

import java.util.List;
import java.util.stream.Collectors;

public class SearchingByCity implements SearchingStrategy{
    private String city;

    SearchingByCity(String city){
        this.city=city;
    }

    @Override
    public List<Restaurant> filteredRestaurant(List<Restaurant> allRestaurants) {
        return allRestaurants.stream()
                .filter(restaurant -> restaurant.getAddress().getCity().equalsIgnoreCase(city))
                .collect(Collectors.toList());
    }
}
