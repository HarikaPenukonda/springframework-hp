package com.seleniumexpress.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans4.xml");
		System.out.println("config file loaded...");
		Student stu = context.getBean("student",Student.class);
		stu.cheat();
		
		AnotherStudent ans = context.getBean("anotherstudent",AnotherStudent.class);
		ans.cheat();
		/*
		 * Student student = new Student(); 
		 * MathCheat cheat = new MathCheat();
		 * student.setMathCheat(cheat);
		 */
		
	}

}
