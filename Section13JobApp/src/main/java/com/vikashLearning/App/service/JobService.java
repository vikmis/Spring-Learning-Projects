package com.vikashLearning.App.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vikashLearning.App.model.JobPost;
import com.vikashLearning.App.repo.JobRepo;

@Service
public class JobService {
	
	@Autowired
	public JobRepo repo;
	
	
	
	//method to return all JobPosts
	public List<JobPost> returnAllJobPosts() {
		return repo.getAllJobs();

	}
	
	public void addJobPost(JobPost jobPost) {
		 repo.addJob(jobPost);
	
	}

}
