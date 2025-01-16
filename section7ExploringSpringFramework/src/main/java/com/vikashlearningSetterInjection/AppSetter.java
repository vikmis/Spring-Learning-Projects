package com.vikashlearningSetterInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppSetter {
	
	 public static void main( String[] args )
	    {
	        
	    	ApplicationContext context = new ClassPathXmlApplicationContext("contextSetterInjection.xml");  // create a container
//	    
	    	AlienSetter obj = (AlienSetter) context.getBean("alien");
	    	
	    	obj.code();
	    
	    	
	    	
	    	
	    }

}
