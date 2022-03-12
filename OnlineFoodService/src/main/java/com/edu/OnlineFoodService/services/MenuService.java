package com.edu.OnlineFoodService.services;
import java.util.List;

import com.edu.OnlineFoodService.entity.Menu;
public interface MenuService {
		
		Menu saveMenu(Menu menu);
		List<Menu> getAllMenu();
		Menu getMenuById(long id);
		Menu updateMenu(Menu menu,long id);

	}


