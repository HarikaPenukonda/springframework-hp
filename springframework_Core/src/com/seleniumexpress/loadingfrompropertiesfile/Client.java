package com.seleniumexpress.loadingfrompropertiesfile;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans7.xml");
		Student bean = context.getBean("student",Student.class);
		bean.getDetails();
	}

}
