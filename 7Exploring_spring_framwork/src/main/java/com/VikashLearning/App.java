package com.VikashLearning;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    
    {
    	
    	//cREATE CONTAINER FOR US 
    	ApplicationContext context = new ClassPathXmlApplicationContext("classpath:/context.xml");

       Alien  obj=(Alien) context.getBean("alien");
       obj.code();
    }
}
