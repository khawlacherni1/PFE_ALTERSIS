package com.khawla.pfe.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.khawla.pfe.Repositories.UserRepo;

@Service
public class UserService {
	
	@Autowired
	UserRepo userRepo;
	
	

}
