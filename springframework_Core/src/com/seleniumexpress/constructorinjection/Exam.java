package com.seleniumexpress.constructorinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans3.xml");
		Student stu = context.getBean("student",Student.class);
		stu.getStudentDetails();
		
	
	}

}
