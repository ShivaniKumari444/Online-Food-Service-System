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

import com.edu.OnlineFoodService.services.MenuService;
import com.edu.OnlineFoodService.entity.Menu;
@RestController
@RequestMapping("/api/menu")
public class MenuController {
private MenuService menuService;
public MenuController(MenuService menuService) {
super();
this.menuService= menuService;
}
  @PostMapping
  public ResponseEntity<Menu> saveMenu(@RequestBody Menu menu){
  return new ResponseEntity<Menu>(menuService.saveMenu(menu),HttpStatus.CREATED);
  }
@GetMapping
public List<Menu> getAllMenu()
		{
			return menuService.getAllMenu();
		}
@GetMapping("{id}")
		public ResponseEntity<Menu>getMenuById(@PathVariable("id") long id){
			return new ResponseEntity(menuService.getMenuById(id),HttpStatus.OK);
		}
@PutMapping("{id}")
		public ResponseEntity<Menu>updateMenu(@PathVariable("id") long id,@RequestBody Menu menu){
			return new ResponseEntity<Menu>(menuService.updateMenu(menu,id),HttpStatus.OK);
		}
	}



