package com.seleniumexpress.autowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human {
	
	@Autowired // automatic wiring of dependencies
	@Qualifier("octopusHeart") // letting spring know which particular object it needs to perform dependency injection
	private Heart heart;
	
//	public Human() {
//		
//	}
//	
//	public Human(Heart heart) {
//		super();
//		this.heart = heart;
//	}
//	
//	
//	public void setHeart(Heart heart) {
//		this.heart = heart;
//		System.out.println("setter method called...");
//	}
	
	public void pump() {
		if(heart != null) {
			heart.startPumping();
			System.out.println("name of the animal : " + heart.getNameOfAnimal() + " number of heart " + heart.getNoOfHeart());
		}else {
			System.out.println("you are dead");
		}
	}

}
