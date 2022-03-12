package com.edu.OnlineFoodService.servicesimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.edu.OnlineFoodService.entity.Menu;
import com.edu.OnlineFoodService.exception.ResourceNotFound;
import com.edu.OnlineFoodService.repository.MenuRepository;
import com.edu.OnlineFoodService.services.MenuService;


@Service
public class MenuServiceimpl implements MenuService {
	
	private MenuRepository menuRepository;
	 public MenuServiceimpl(MenuRepository menuRepository) {
	 super();
	 this.menuRepository=menuRepository;
}
	@Override
	public Menu saveMenu(Menu menu) {
		return menuRepository.save(menu);
	}

	@Override
	public List<Menu> getAllMenu() {
		return menuRepository.findAll();
	}

	@Override
	public Menu getMenuById(long id) {
		Optional<Menu> menu=menuRepository.findById(id);
		if(menu.isPresent()) {
			return menu.get();
		}
		else {
			throw new ResourceNotFound("Menu","Id",id);
		}
	}
	

	@Override
	public Menu updateMenu(Menu menu  , long id) {
			Menu menu1 = new Menu();
		 try {
			   menu1 = menuRepository.findById(id).orElseThrow(
					 ()-> 		 new ResourceNotFound("Menu","Id",id));
		} catch (ResourceNotFound e) {
			
			e.printStackTrace();
		}
	
		
		 menu1.setCategory(menu1.getCategory());
		 
		 menuRepository.save(menu1);
		return menu1;
		}      

}