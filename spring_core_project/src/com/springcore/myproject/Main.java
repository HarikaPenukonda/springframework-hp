package com.springcore.myproject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(GreetingConfiguration.class);
		System.out.println("config file loaded...");
		GreetingController bean = context.getBean("greetingController",GreetingController.class);
		bean.greetings("Harry");
	}

}
