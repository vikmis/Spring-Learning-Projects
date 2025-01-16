package com.vikashLearning.App.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.vikashLearning.App.model.User;
import com.vikashLearning.App.model.UserPrincipal;
import com.vikashLearning.App.repo.UserRepo;





@Service
public class MyUserDetailsService implements UserDetailsService {
	
	
	@Autowired
	private UserRepo repo;
	
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

		User user= repo.findByUsername(username);
		
		if (user==null) {
			System.out.println("User 404");
			throw new UsernameNotFoundException("User 404");
		}
		System.out.println("User fetched: " + user.getUsername());
		 return new UserPrincipal(user);
	}

}
