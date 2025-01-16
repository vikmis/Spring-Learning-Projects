package Autowire.AutoWireWithInterface;

import org.springframework.beans.factory.annotation.Autowired;

public class NotificationSender {
    
    private final NotificationService notificationService;
    
    @Autowired
    public NotificationSender(NotificationService notificationService) {
        this.notificationService = notificationService;
    }
    
    public void sendNotification(String message, String recipient) {
    	notificationService.sendNotification(message, recipient);
    }
}

