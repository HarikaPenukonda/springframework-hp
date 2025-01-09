package com.seleniumexpress.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans6.xml");
		Human bean = context.getBean("human",Human.class);
		bean.pump();
	}

}
