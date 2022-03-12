package com.edu.OnlineFoodService.services;
import java.util.List;

import com.edu.OnlineFoodService.entity.Restaurant;


public interface RestaurantService {
	Restaurant saveRestaurant(Restaurant rest);
	List<Restaurant> getAllRestaurant();
	Restaurant getRestaurantById(long id);
	Restaurant updateRestaurant(Restaurant rest,long id);

}
