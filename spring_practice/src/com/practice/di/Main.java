package com.practice.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans1.xml");
		UserNotification bean = context.getBean("user",UserNotification.class);
		bean.notifyMe();
	}

}
