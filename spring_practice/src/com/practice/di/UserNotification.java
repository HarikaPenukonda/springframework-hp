package com.practice.di;

public class UserNotification {
	
	private NotificationService notifications;

	public void setNotifications(NotificationService notifications) {
		this.notifications = notifications;
	}

	public void notifyMe() {
		notifications.sendNotification();
	}

}
