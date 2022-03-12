package com.edu.OnlineFoodService.services;

import java.util.List;

import com.edu.OnlineFoodService.entity.Admin;

public interface AdminService {
	
	Admin saveAdmin(Admin admin);
	List<Admin> getAllAdmin();
	Admin getAdminById(long id );
	Admin updateAdmin(Admin admin,long id);
	

}
