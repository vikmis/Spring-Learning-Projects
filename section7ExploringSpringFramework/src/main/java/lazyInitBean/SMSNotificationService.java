package lazyInitBean;

public class SMSNotificationService implements NotificationService {
	
	
	
	
	public SMSNotificationService() {
		System.out.println("SMSNotificationService object created");
	}

	@Override
	public void sendNotification(String message, String recipient) {
		
		System.out.println("SMSNotificationService method called ");
	}

}
