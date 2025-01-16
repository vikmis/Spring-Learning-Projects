package Autowire;

import org.springframework.beans.factory.annotation.Autowired;

public class NotificationSender {
    
    private final SMSNotificationService smsNotificationService;
    
    @Autowired
    public NotificationSender(SMSNotificationService smsNotificationService) {
        this.smsNotificationService = smsNotificationService;
    }
    
    public void sendNotification(String message, String recipient) {
        smsNotificationService.sendNotification(message, recipient);
    }
}
