package com.controller;


import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.business.LoginBO;
 
@Controller
@RequestMapping("/Login")
public class LoginController {
	
	//Dependency Injection using annotation
		@Autowired
		private LoginBO loginBO;
 
    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView login(ModelMap model) {
    	ModelAndView mav= new ModelAndView();
    	
    	HashMap<String, Integer> myHashMap = new HashMap<String, Integer>();
    	loginBO.getSchoolNames();
		/*myHashMap = loginBO.getFileName(keyCountsModel.getFileName());
		
		mav.addObject("myHashMap",myHashMap);*/
		mav.setViewName("login");
		return mav;
    }
 
   /* @RequestMapping(value="/", method = RequestMethod.GET)
    public String sayHelloAgain(ModelMap model) {
        model.addAttribute("greeting", "Hello World Again, from Spring 4 MVC");
        return "welcome";
    }*/
}

