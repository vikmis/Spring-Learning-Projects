package CreatingInterface;

public class EmailNotificationService implements NotificationService  {
	
	

	@Override
	public void sendNotification(String message, String recipient) {
		
		System.out.println("EmailNotificationService method called ");
	}

	

}
