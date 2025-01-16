package com.vikashLearning.App.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloController {
	
	@GetMapping("/hello")
	public String greet() {
		return "Welcome to the vikash first project";
	}

}
