package PrimaryAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	
	public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        // Get the NotificationSender bean
        NotificationSender notificationSender = context.getBean(NotificationSender.class);

        // Send a notification, Spring will use the @Primary bean (SMSNotificationService)
        notificationSender.sendNotification("Hello, World!", "123-456-7890");
    }

}
