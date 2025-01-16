package Autowire.AutoWireWithInterface;

public class SMSNotificationService implements NotificationService {
    
    public SMSNotificationService() {
        System.out.println("SMSNotificationService object created");
    }
    
    public void sendNotification(String message, String recipient) {
        System.out.println("Sending SMS to " + recipient + " with message: " + message);
    }
}
