package com.practice.autowire;

public class NotificationManager {
	
	private NotificationService notificationService;

	public void setNotificationService(NotificationService notificationService) {
		this.notificationService = notificationService;
	}
	
	public void notifications(String message, String recipient) {
		notificationService.sendNotification(message, recipient);
	}

}
