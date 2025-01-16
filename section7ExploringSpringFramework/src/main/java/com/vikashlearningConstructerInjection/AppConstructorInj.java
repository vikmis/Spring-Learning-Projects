package com.vikashlearningConstructerInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppConstructorInj {
	
	 public static void main( String[] args )
	    {
	        
	    	ApplicationContext context = new ClassPathXmlApplicationContext("contextConstructorInjection.xml");  // create a container
//	    
	    	AlienConstructorInj obj = (AlienConstructorInj) context.getBean("alien");
	    	
	    	obj.code();
	    
	    	
	    	
	    	
	    }

}
