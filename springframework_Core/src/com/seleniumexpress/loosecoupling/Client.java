package com.seleniumexpress.loosecoupling;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans5.xml");
		System.out.println("config file loaded...");
		Student stu = context.getBean("student",Student.class);
		stu.cheating();

		
		/* Here, if we add another student who is using the same mathCheat 
		 * reference, our current code leads to create mathCheat object two 
		 * times, so if we create 100 students it creates 100 mathCheat object
		 * which is a very bad coding practice.
		 * */		
		
		/*
		 * Student student = new Student(); 
		 * MathCheat cheat = new MathCheat();
		 * student.setMathCheat(cheat);
		 */
		
	}

}
