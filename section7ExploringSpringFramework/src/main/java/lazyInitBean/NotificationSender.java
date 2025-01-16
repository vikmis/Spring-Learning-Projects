package lazyInitBean;

public class NotificationSender {

	
	private final NotificationService notificationService;
	
	public NotificationSender(NotificationService notificationService) {
		this.notificationService = notificationService;
	}
	
public void sendNotification(String message, String recipient) {
		
	notificationService.sendNotification(message, recipient);
	}
	

}
