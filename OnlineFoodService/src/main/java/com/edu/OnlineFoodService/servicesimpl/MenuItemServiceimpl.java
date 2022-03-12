package com.edu.OnlineFoodService.servicesimpl;


import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.edu.OnlineFoodService.entity.MenuItem;
import com.edu.OnlineFoodService.exception.ResourceNotFound;
import com.edu.OnlineFoodService.repository.MenuItemRepository;
import com.edu.OnlineFoodService.services.MenuItemService;
@Service
public class MenuItemServiceimpl implements MenuItemService {
private MenuItemRepository menuitemRepository;
	 public MenuItemServiceimpl(MenuItemRepository menuitemRepository) {
		 super();
		 this.menuitemRepository=menuitemRepository;
	}
		@Override
		public MenuItem saveMenuItem(MenuItem menuitem) {
			return menuitemRepository.save(menuitem);
		}

		@Override
		public List<MenuItem> getAllMenuItem() {
			return menuitemRepository.findAll();
		}

@Override
public MenuItem getMenuItemById(long id) {
			Optional<MenuItem> menuitem=menuitemRepository.findById(id);
			if(menuitem.isPresent()) {
				return menuitem.get();
			}
			else {
				throw new ResourceNotFound("MenuItem","Id",id);
			}
		}
		

		@Override
		public MenuItem updateMenuItem(MenuItem menuitem  , long id) {
				MenuItem menui = new MenuItem();
			 try {
				   menui = menuitemRepository.findById(id).orElseThrow(
						 ()-> 		 new ResourceNotFound("MenuItem","Id",id));
			} catch (ResourceNotFound e) {
				
				e.printStackTrace();
			}
		     menui.setName(menui.getName());
			 menui.setQuantity(menui.getQuantity());
			 menui.setPrice(menui.getPrice());
			 
			 
			 menuitemRepository.save(menui);
			return menui;
}      

}


