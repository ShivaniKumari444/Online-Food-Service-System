package com.edu.OnlineFoodService.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edu.OnlineFoodService.entity.Restaurant;
import com.edu.OnlineFoodService.services.RestaurantService;

@RestController
@RequestMapping("/api/restaurant")

public class RestaurantController {
private RestaurantService restService;
public RestaurantController(RestaurantService restService) {
super();
this.restService= restService;
}
@PostMapping
public ResponseEntity<Restaurant> saveRestaurant(@RequestBody Restaurant rest){
return new ResponseEntity<Restaurant>(restService.saveRestaurant(rest),HttpStatus.CREATED);
}

@GetMapping
public List<Restaurant> getAllRestaurant()
{
return restService.getAllRestaurant();
}
@GetMapping("{id}")
public ResponseEntity<Restaurant>getRestaurantById(@PathVariable("id") long id){
return new ResponseEntity(restService.getRestaurantById(id),HttpStatus.OK);
}
@PutMapping("{id}")
public ResponseEntity<Restaurant>updateRestaurant(@PathVariable("id") long id,@RequestBody Restaurant rest){
return new ResponseEntity<Restaurant>(restService.updateRestaurant(rest,id),HttpStatus.OK);
}

}


