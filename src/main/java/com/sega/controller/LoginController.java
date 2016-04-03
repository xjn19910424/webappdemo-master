package com.sega.controller;

import com.sega.models.User;
import com.sega.service.LoginService;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by sega on 2016/3/26.
 */
@Controller
@RequestMapping(path = "/login")
public class LoginController {

    @RequestMapping(method = RequestMethod.POST)
    public String login(@ModelAttribute User user){
    	LoginService service = new LoginService();
    	
    	if (service.validateUser(user))
    		return "talk";
    	else
    		return "false";
    }
}
