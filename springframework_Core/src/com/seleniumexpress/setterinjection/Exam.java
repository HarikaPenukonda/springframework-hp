package com.seleniumexpress.setterinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans2.xml");
		Student stu = context.getBean("student",Student.class);
		stu.studentDetails();
		
//		Student student = new Student();
//		student.setStudentName("Admin");
//		
//		student.studentDetails();
	}

}
