package com.sega.service;

import com.sega.models.User;
import com.sega.models.UserDao;

public class LoginService {
	
	public boolean validateUser(User user){
		User user1 = UserDao.findByUsername(user.getUsername());
		if (user1 != null)
			return true;
		else
			return false;
	}

}