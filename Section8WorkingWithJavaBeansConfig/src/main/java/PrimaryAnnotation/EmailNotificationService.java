package PrimaryAnnotation;

public class EmailNotificationService implements NotificationService {

	 public EmailNotificationService() {
	        System.out.println("EmailNotificationService object created");
	    }
	 @Override
	    public void sendNotification(String message, String recipient) {
	        System.out.println("Sending Email to " + recipient + " with message: " + message);
	    }
}
