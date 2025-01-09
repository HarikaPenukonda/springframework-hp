package com.seleniumexpress.college;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("config file... loaded...");
		College bean = context.getBean("college",College.class);
		System.out.println("The bean is created by spring " + bean);
	}

}
