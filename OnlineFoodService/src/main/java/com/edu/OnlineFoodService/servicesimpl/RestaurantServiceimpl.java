package com.edu.OnlineFoodService.servicesimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.edu.OnlineFoodService.entity.Restaurant;
import com.edu.OnlineFoodService.exception.ResourceNotFound;
import com.edu.OnlineFoodService.repository.RestaurantRepository;
import com.edu.OnlineFoodService.services.RestaurantService;
@Service
public class RestaurantServiceimpl implements RestaurantService {
private RestaurantRepository restRepository;
		 public RestaurantServiceimpl(RestaurantRepository restRepository) {
		 super();
		 this.restRepository=restRepository;
	}
		@Override
		public Restaurant saveRestaurant(Restaurant rest) {
			return restRepository.save(rest);
		}

		@Override
		public List<Restaurant> getAllRestaurant() {
			return restRepository.findAll();
		}

		@Override
		public Restaurant getRestaurantById(long id) {
			Optional<Restaurant> rest=restRepository.findById(id);
			if(rest.isPresent()) {
				return rest.get();
			}
			else {
				throw new ResourceNotFound("Restaurant","Id",id);
			}
		}
		

		@Override
		public Restaurant updateRestaurant(Restaurant rest , long id) {
			Restaurant res = new Restaurant();
			 try {
				   res = restRepository.findById(id).orElseThrow(          
						 ()-> 		 new ResourceNotFound("Restaurant","Id",id));
			} catch (ResourceNotFound e) {
				
				e.printStackTrace();
			}
			 res.setName(res.getName());
			 res.setLocation(res.getLocation());
			
			 
			 
			 restRepository.save(res);
			return res;
			}      

	}


