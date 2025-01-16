package com.vikashLearning.App.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.vikashLearning.App.model.JobPost;
import com.vikashLearning.App.service.JobService;

@Controller
public class JobController {
	
	@Autowired
	private JobService service;
	
	@GetMapping({"/","home"})
	public String home() {
		
		return "home";
	}
	
	@GetMapping("/addjob")
	public String addJob() {
		return "addjob";
	}
	
	 @PostMapping("/handleForm")
	    public String handleAddJobForm(JobPost jobPost) {
	        // Add JobPost to the model
		 service.addJobPost(jobPost);
	      //  model.addAttribute("jobPost", jobPost);
	        return "success";
	    }
	 
	 @GetMapping("viewalljobs")
	 public String viewJobs(Model m) {
		 List<JobPost> jobs = service.returnAllJobPosts();
		 m.addAttribute("jobPosts" , jobs);
		 return "viewalljob";
	 }
}
