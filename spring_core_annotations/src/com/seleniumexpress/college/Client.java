package com.seleniumexpress.college;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(CollegeConfig.class);
		System.out.println("config file... loaded... in java");
		College bean = context.getBean("collegeBean",College.class);
		System.out.println("The bean is created by spring " + bean);
		bean.test();
	}

}
