package StereoTypeAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration  
@ComponentScan(basePackages = "StereoTypeAnnotation")
public class App {
    
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(App.class);
        NotificationSender notificationService = context.getBean(NotificationSender.class);
        notificationService.sendNotification("Hello, World!", "123-456-7890");
    }
}
