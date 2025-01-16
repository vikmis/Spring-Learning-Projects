package com.VikashLearning.section7ExploringSpringFramework;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    
    {
    	
    	//cREATE CONTAINER FOR US 
    	ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

       Alien  obj=(Alien) context.getBean("alien");
       obj.code();
    }
}
