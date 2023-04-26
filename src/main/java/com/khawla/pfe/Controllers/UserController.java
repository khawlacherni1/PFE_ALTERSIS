package com.khawla.pfe.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.khawla.pfe.Services.UserService;
import com.khawla.pfe.entities.User;



@Controller
public class UserController {
	

    @Autowired
    private UserService userService ;
	
	@PostMapping("/addUser")
	@ResponseBody
	public User addUser ( @RequestBody User User) {
		return userService.addUser(User);
	}
    
    @PutMapping("/deleteUser/{userId}")
	@ResponseBody
	public void deleteUser (@PathVariable Long userId) {
    	userService.deleteUser(userId);
		
	}
    
    @GetMapping("/FindUser/{userId}")
	@ResponseBody
	public User FindUser ( @PathVariable Long userId) {
		return userService.FindUser(userId);
	}
    
    @PutMapping("/UpdateUser")
	@ResponseBody
	public void UpdateUser(@RequestBody User User) {
    	userService.UpdateOffre(User);
		
	}

}
