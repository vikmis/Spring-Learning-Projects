package StereoTypeAnnotation;

import org.springframework.stereotype.Component;

@Component
public class NotificationSender {
    
    private final SMSNotificationService smsNotificationService;
    
    
    public NotificationSender(SMSNotificationService smsNotificationService) {
        this.smsNotificationService = smsNotificationService;
    }
    
    public void sendNotification(String message, String recipient) {
        smsNotificationService.sendNotification(message, recipient);
    }
}
