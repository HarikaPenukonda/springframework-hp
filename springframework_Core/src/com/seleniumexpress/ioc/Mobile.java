package com.seleniumexpress.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {

	public static void main(String[] args) {
		
	ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
	System.out.println("config file... beans.xml...loaded");

	// class reference
	//	Airtel air = (Airtel)context.getBean("airtel");
	//	air.calling();
	//	air.data();
	
	// Here if we change the id from airtel to vodafone, it will call vofone methods
	// But out requirement is no change in the main source code so we use inteface reference here
	// so we can make changes in beans.xml but not in main class
	Sim sim = context.getBean("sim",Sim.class);
	sim.calling();
	sim.data(); 
	
	
/*	When we are using class reference we are changing our source
 *  code as show below.
 * */		
		
//		Airtel airtel = new Airtel();
//		airtel.calling();
//		airtel.data();
		
//		Vodafone vodafone = new Vodafone();
//		vodafone.calling();
//		vodafone.data();
		
/*	Instead we can use interface reference 
 * 
		
		//Sim sim = new Airtel();
		Sim sim = new Vodafone();
		sim.calling();
		sim.data();
*/	
	}
/*	What if my requirement is to achieve the same goal but without making 
 any changes or make add any new features without changes?
  we use spring framework for this scenario	
 1. It can create objects for us
 2. It can manage our objects
 
 Spring container called IOC container will create and manage objects for us
 so that the developer concentrates on business logic only.
 
 Spring container 2 types 
 1. BeanFactory(I) - Legacy
 2. Application Context(I) implemented by ClassPathXmlApplication(class)
 3. config file - beans.xml
 
 * */ 
}
