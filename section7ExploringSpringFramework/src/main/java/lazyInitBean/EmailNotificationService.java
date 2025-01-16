package lazyInitBean;

public class EmailNotificationService implements NotificationService {
	
	public EmailNotificationService() {
		System.out.println("EmailNotificationService object created");
	}
	
	public void sendNotification(String message, String recipient) {
		System.out.println("Email NotificationService method called  "+message+"   and "+recipient);
	}

}
