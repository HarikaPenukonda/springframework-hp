package com.practice.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans2.xml");
		NotificationManager bean = context.getBean("nm",NotificationManager.class);
		bean.notifications("Admin", "Hello World");
	}

}
