package com.arjun.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {
@RequestMapping(value= {"/","/home","/index"})
	public ModelAndView index() {
	
		ModelAndView mav = new ModelAndView("page");	
		mav.addObject("greeting", "Welcome to spring application");
		return mav;
	}
	
    @RequestMapping(value="/test")
    public ModelAndView test(@RequestParam(value="greeting",required=false) String greeting) {
    	
    	if(greeting == null) {
    		greeting = "Provide greeting msg to get it back on the screen from spring";
    	}
    	
    	ModelAndView mav = new ModelAndView("page");
    	mav.addObject("greeting", greeting);
		return mav;
		
    	
    }

   

}
