package CreatingInterface;

public class SMSNotificationService  implements NotificationService  {

	@Override
	public void sendNotification(String message, String recipient) {
		System.out.println("SMSNotificationService method called ------    "+message+"   and -----   "+recipient);
	}

}
