package com.vikashLearning.RestApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vikashLearning.RestApp.model.JobPost;
import com.vikashLearning.RestApp.repo.JobRepo;



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
	
	public JobPost getJob(int postId) {
		
		return repo.getJob(postId);
	}
	public void updateJob(JobPost jobPost) {
		repo.updateJob(jobPost);
			
		}

		public void deleteJob(int postId) {
			repo.deleteJob(postId);
			
		}

}
