package com.sega.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by sega on 2016/3/26.
 */
@Controller
@RequestMapping(path = "/")
public class HomeController {

    @RequestMapping(method = RequestMethod.GET)
    public String welcome(){
        return "login";
    }
}
