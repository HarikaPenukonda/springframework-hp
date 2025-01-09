package com.seleniumexpress.autowire;

import org.springframework.beans.factory.annotation.Autowired;

public class Human {
	
	private Heart heart;
	
	public Human() {
		
	}
	
	
	public Human(Heart heart) {
		super();
		this.heart = heart;
	}
	
	@Autowired
	public void setHeart(Heart heart) {
		this.heart = heart;
		System.out.println("setter method called...");
	}
	
	public void pump() {
		if(heart != null) {
			heart.startPumping();
		}else {
			System.out.println("you are dead");
		}
	}

}
