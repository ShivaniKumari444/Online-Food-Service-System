package com.edu.OnlineFoodService.services;

import java.util.List;

import com.edu.OnlineFoodService.entity.MenuItem;

public interface MenuItemService {

		
		MenuItem saveMenuItem(MenuItem menuitem);
		List<MenuItem> getAllMenuItem();
		MenuItem getMenuItemById(long id);
		MenuItem updateMenuItem(MenuItem menuitem,long id);

	}



