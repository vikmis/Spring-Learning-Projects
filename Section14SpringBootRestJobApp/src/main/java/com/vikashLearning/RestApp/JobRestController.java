package com.vikashLearning.RestApp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.vikashLearning.RestApp.model.JobPost;
import com.vikashLearning.RestApp.service.JobService;

@RestController
@CrossOrigin(origins = "http://localhost:5500")
public class JobRestController {
	
	@Autowired
	private JobService service;
	
	@GetMapping("jobPosts")
	public List<JobPost> getAllJobs() {
		return service.returnAllJobPosts();
	}
	
	@GetMapping("jobPosts/{postId}")
	 
	public JobPost getJob(@PathVariable int postId) {
		return service.getJob(postId);
		
	}
	@PostMapping("jobPosts")
    public JobPost addJob(@RequestBody JobPost jobPost) {
        service.addJobPost(jobPost);
        return service.getJob(jobPost.getPostId());
    }
	
	@PutMapping("jobPosts")
	public JobPost updateJob(@RequestBody JobPost jobPost) {
		System.out.println("we are here at controller class of update");
	    service.updateJob(jobPost);
	    return service.getJob(jobPost.getPostId());
	}
	
	@DeleteMapping("jobPosts/{postId}")
	public String deleteJob(@PathVariable int postId) {
	    service.deleteJob(postId);
	    return "Deleted";
	}
	
}
