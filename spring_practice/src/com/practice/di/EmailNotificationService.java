package com.practice.di;

public class EmailNotificationService implements NotificationService{

	@Override
	public void sendNotification() {
		System.out.println("sending email notification");
		
	}

}
