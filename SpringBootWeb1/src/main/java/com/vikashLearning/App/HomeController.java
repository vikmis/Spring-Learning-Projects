package com.vikashLearning.App;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class HomeController {
	
	 @ModelAttribute("course")
	    public String courseName() {
	        return "Java";
	    }
	
	@RequestMapping("/")
	public ModelAndView home(ModelAndView mv) { 
	    mv.setViewName("index");  // Set the view to index.jsp
	    return mv;
	}
	@RequestMapping("add")
	public ModelAndView add(@RequestParam("num1") int num1, 
	                        @RequestParam("num2") int num2, 
	                        ModelAndView mv) {

	    int result = num1 + num2;
	    mv.addObject("result", result);  // Adds the result to the view
	    mv.setViewName("result");  // Sets the view to result.jsp

	    return mv;
}
	
	@RequestMapping("addAlien")
	public String addAlien(Alien alien) {
	    
	    return "result";
	}
}
