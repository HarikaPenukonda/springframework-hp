package com.practice.autowire;

import org.springframework.beans.factory.annotation.Autowired;

public class NotificationManager {
	
	private NotificationService notificationService;

	@Autowired
	public void setNotificationService(NotificationService notificationService) {
		this.notificationService = notificationService;
	}
	
	public void notifications(String message, String recipient) {
		notificationService.sendNotification(message, recipient);
	}

}
