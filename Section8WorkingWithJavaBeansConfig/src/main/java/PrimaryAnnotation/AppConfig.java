package PrimaryAnnotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

public class AppConfig {
	 	@Bean
	    @Primary // This will be used as the default NotificationService
	    public NotificationService smsNotificationService() {
	        return new SMSNotificationService();
	    }

	    @Bean
	    
	    public NotificationService emailNotificationService() {
	        return new EmailNotificationService();
	    }

	   @Bean
	   
	    public NotificationSender notificationSender(NotificationService notificationService) {
	        return new NotificationSender(notificationService);
	    }

}
