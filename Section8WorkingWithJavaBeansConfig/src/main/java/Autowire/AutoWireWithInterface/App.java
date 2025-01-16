package Autowire.AutoWireWithInterface;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        NotificationSender notificationService = context.getBean(NotificationSender.class);
        notificationService.sendNotification("Hello, World!", "123-456-7890");
    }
}

