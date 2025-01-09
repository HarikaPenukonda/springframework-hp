package com.practice.di;

public class SMSNotificationService implements NotificationService{

	@Override
	public void sendNotification() {
		System.out.println("Sending SMS notification");
		
	}

}
