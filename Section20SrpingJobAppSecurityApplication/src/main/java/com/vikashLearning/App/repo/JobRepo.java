package com.vikashLearning.App.repo;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vikashLearning.App.model.JobPost;



@Repository
public interface JobRepo extends JpaRepository<JobPost, Integer> {
	
	List<JobPost> findByPostProfileContainsOrPostDescContains(String postprofile ,String postdesc);
	
	
	
	
}
