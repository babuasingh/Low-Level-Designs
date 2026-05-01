package Food_Delivery_System.searchingstrategy;

import Food_Delivery_System.entities.Restaurant;

import java.util.List;
import java.util.stream.Collectors;

public class SearchByMenuKeyWord implements SearchingStrategy {

    private String keyword;

    SearchByMenuKeyWord(String keyword) {
        this.keyword = keyword;
    }

    @Override
    public List<Restaurant> filteredRestaurant(List<Restaurant> allRestaurants) {
        return allRestaurants.stream()
                .filter(restaurant ->
                        restaurant.getMenu().getMenuItems()
                                .stream().anyMatch(menu -> menu.getName().equalsIgnoreCase(keyword)))
                .collect(Collectors.toList());
    }
}
