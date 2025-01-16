package lazyInitBean;

public interface NotificationService {
	 default void sendNotification(String message, String recipient ) {
		
	}
		
}
