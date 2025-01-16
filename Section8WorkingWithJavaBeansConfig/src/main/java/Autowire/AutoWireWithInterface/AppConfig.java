package Autowire.AutoWireWithInterface;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration

public class AppConfig {
    
    @Bean
    public SMSNotificationService smsNotificationService() {
        return new SMSNotificationService();
    }
   
    
    @Bean
    public NotificationSender notificationSender() {
        return new NotificationSender(smsNotificationService());
    }
    
    
}
