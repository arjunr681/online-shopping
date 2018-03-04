package com.arjun.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.arjun.shoppingbackend.dao.CategoryDAO;
import com.arjun.shoppingbackend.dto.Category;

@Controller
public class PageController {
	
	@Autowired 
	private CategoryDAO categorydao;
	
	
@RequestMapping(value= {"/","/home","/index"}) 
	public ModelAndView index() {
	
	       List<Category> categories = categorydao.list();
	
		ModelAndView mav = new ModelAndView("page");	
		mav.addObject("title", "Home");
		mav.addObject("categories", categories);
		mav.addObject("userClickHome", true);
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
    
    @RequestMapping(value= "/about") 
	public ModelAndView about() {
	
		ModelAndView mav = new ModelAndView("page");	
		mav.addObject("title", "About Us");
		mav.addObject("userClickAbout", true);
		return mav;
	}
    
    @RequestMapping(value= "/contact") 
   	public ModelAndView contact() {
   	
   		ModelAndView mav = new ModelAndView("page");	
   		mav.addObject("title", "Contact Us");
   		mav.addObject("userClickContact", true);
   		return mav;
   	}
    
    @RequestMapping(value= "/show/all/products") 
   	public ModelAndView showAllProducts() {
   		ModelAndView mav = new ModelAndView("page");	
   		mav.addObject("title", "All Products");
   		mav.addObject("categories", categorydao.list());
   		mav.addObject("userClickProducts", true);
   		return mav;
   	}
    
    
    @RequestMapping(value= "/show/{categoryId}/products") 
   	public ModelAndView showCatProducts(@PathVariable("categoryId") int id) {
    	 Category category = categorydao.get(id);
   		ModelAndView mav = new ModelAndView("page");	
   		mav.addObject("title", "Category Products");
   		mav.addObject("categories", categorydao.list());
   		mav.addObject("category", category);
   		mav.addObject("userClickCategoryProducts", true);
   		return mav;
   	}
    
     

   

}
