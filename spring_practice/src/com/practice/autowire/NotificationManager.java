package com.practice.autowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class NotificationManager {
	
	@Autowired
	@Qualifier("email")
	private NotificationService notificationService;
	
	public void notifications(String message, String recipient) {
		notificationService.sendNotification(message, recipient);
	}

}
