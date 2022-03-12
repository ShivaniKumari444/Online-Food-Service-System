package com.edu.OnlineFoodService.controller;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

import com.edu.OnlineFoodService.services.MenuItemService;
import com.edu.OnlineFoodService.entity.MenuItem;
@RestController
@RequestMapping("/api/menuitem")
public class MenuItemController {
private MenuItemService menuitemService;
public MenuItemController(MenuItemService menuitemService) {
super();
this.menuitemService= menuitemService;
}
  @PostMapping
  public ResponseEntity<MenuItem> saveMenuItem(@RequestBody MenuItem menuitem){
  return new ResponseEntity<MenuItem>(menuitemService.saveMenuItem(menuitem),HttpStatus.CREATED);
  }
@GetMapping
public List<MenuItem> getAllMenuItem()
		{
			return menuitemService.getAllMenuItem();
		}
@GetMapping("{id}")
		public ResponseEntity<MenuItem>getMenuItemById(@PathVariable("id") long id){
			return new ResponseEntity(menuitemService.getMenuItemById(id),HttpStatus.OK);
		}
@PutMapping("{id}")
		public ResponseEntity<MenuItem>updateMenuItem(@PathVariable("id") long id,@RequestBody MenuItem menuitem){
			return new ResponseEntity<MenuItem>(menuitemService.updateMenuItem(menuitem,id),HttpStatus.OK);
		}
	}


