package CreatingInterface;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	
	 public static void main(String[] args) {
	        // Load Spring context
		 ApplicationContext context = new ClassPathXmlApplicationContext("ContextCreatingInterface.xml");

	        // Retrieve NotificationSender bean
	        NotificationSender notificationSender = (NotificationSender) context.getBean("notificationSender");

	        // Use NotificationSender to send a notification
	        notificationSender.sendNotification("Hello, World!", "123-456-7890");
	    }

}
