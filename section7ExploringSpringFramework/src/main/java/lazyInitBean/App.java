package lazyInitBean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import CreatingInterface.NotificationSender;

public class App {
	
	 public static void main(String[] args) {
	        // Load Spring context
		 ApplicationContext context = new ClassPathXmlApplicationContext("ContextLazyinitBeans.xml");

	        // Retrieve NotificationSender bean
	        NotificationSender notificationSender = (NotificationSender) context.getBean("notificationSender");

	        // Use NotificationSender to send a notification
	        notificationSender.sendNotification("Hello, World!", "123-456-7890");
	    }

}
