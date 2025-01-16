package com.VikashLearning.Section8WorkingWithJavaBeansConfig;

public class SMSNotificationService {
	
	public SMSNotificationService() {
		System.out.println("SMSNotificationService class Object Created");
	}
	
	 public void sendNotification(String message, String recipient) {
	        System.out.println("Sending SMS to " + recipient + ": " + message);
	    }
	}
