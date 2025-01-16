package com.vikashLearning.RestApp.repo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.vikashLearning.RestApp.model.JobPost;



@Repository
public class JobRepo {
	
	private List<JobPost> jobs = new ArrayList<>();
	
	public JobRepo() {
        jobs.add(new JobPost(1, "Java Developer", "Must have good experience in core Java", 3, List.of("Java", "Spring Boot")));
        jobs.add(new JobPost(2, "Frontend Developer", "Experience in building responsive UIs", 3, List.of("HTML", "CSS", "JavaScript", "React")));
        jobs.add(new JobPost(3, "Data Scientist", "Strong background in Machine Learning and Data Analysis", 4, List.of("Python", "Machine Learning", "Data Analysis")));
        jobs.add(new JobPost(4, "Network Engineer", "Design and implement computer networks", 2, List.of("Networking", "Linux", "Cisco")));
        jobs.add(new JobPost(5, "Mobile App Developer", "Experience in building mobile applications", 3, List.of("Android", "Kotlin", "iOS")));
    }

	 public List<JobPost> getAllJobs() {
	        return jobs;
	    }

	    

	    public  JobPost getJob(int postId) {
	    	
	    	for(JobPost job : jobs) {
	    		if(job.getPostId()==postId) {
	    			return job;
	    		}
	    	}
	    	
	    	return null;
	    }
	    
	    public void addJob(JobPost job) {
	        jobs.add(job);
	        System.out.println(jobs);
	    }
	    
	    public void updateJob(JobPost jobPost) {
	    	System.out.println("we are here at update job method");
	        for (JobPost job1 : jobs) {
	            if (job1.getPostId() == jobPost.getPostId()) {
	                // Update the fields of the job post
	                job1.setPostProfile(jobPost.getPostProfile());
	                job1.setPostDesc(jobPost.getPostDesc());
	                job1.setReqExperience(jobPost.getReqExperience());
	                job1.setPostTechStack(jobPost.getPostTechStack());
	            }
	        }
	    }
	    
	    public void deleteJob(int postId) {
	    	System.out.println("we are here at delete job method");
			for (JobPost jobPost : jobs) {
				if (jobPost.getPostId() == postId) {
					jobs.remove(jobPost);
					
				}
			}

			
			
		}
}
