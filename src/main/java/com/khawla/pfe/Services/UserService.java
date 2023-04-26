package com.khawla.pfe.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.khawla.pfe.Repositories.UserRepo;
import com.khawla.pfe.entities.User;

@Service
public class UserService {
	
	@Autowired
	UserRepo userRepo;
	
	public User addUser(User User) {
        return userRepo.save(User);
    }

    
    public void deleteUser(Long userId) {
    	userRepo.deleteById(userId);
        System.out.println("User supprimé");
    }

    
    public User FindUser(Long userId) {
    	User u = userRepo.findById(userId).orElse(null);
		System.out.println(u);
		return (u);
	}
    
    public void UpdateOffre(User User) {
    	userRepo.saveAndFlush(User);
	}
	
	

}
