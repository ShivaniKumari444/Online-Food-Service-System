package com.edu.OnlineFoodService.servicesimpl;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.edu.OnlineFoodService.entity.Admin;
import com.edu.OnlineFoodService.exception.ResourceNotFound;
import com.edu.OnlineFoodService.repository.AdminRepository;
import com.edu.OnlineFoodService.services.AdminService;
@Service
public class AdminServiceimpl implements AdminService {
private AdminRepository adminRepository;
public AdminServiceimpl(AdminRepository adminRepository) {
			 super();
			 this.adminRepository=adminRepository;
		}
		 @Override
	      public Admin saveAdmin(Admin admin) {
	      return adminRepository.save(admin);
			}

	@Override
	public List<Admin> getAllAdmin() {
			return adminRepository.findAll();
	}

	@Override
	public Admin getAdminById(long id) {
				Optional<Admin> admin=adminRepository.findById(id);
				if(admin.isPresent()) {
					return admin.get();
				}
				else {
					throw new ResourceNotFound("Admin","Id",id);
				}
			}
			

	@Override
	public Admin updateAdmin(Admin admin  , long id) {
					Admin ad= new Admin();
				 try {
					   ad = adminRepository.findById(id).orElseThrow(
							 ()-> 		 new ResourceNotFound("Customer","Id",id));
				} catch (ResourceNotFound e) {
					
					e.printStackTrace();
				}
			
				 ad.setName(ad.getName());
				 ad.setContact_Number(ad.getContact_Number());
				 ad.setEmail(ad.getEmail());
				 
				 
				 adminRepository.save(ad);
				return ad;
	}      

	}


