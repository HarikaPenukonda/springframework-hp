package com.seleniumexpress.autowire;

public class Human {
	
	private Heart heart;

	public void setHeart(Heart heart) {
		this.heart = heart;
	}
	
	public void pump() {
		if(heart != null) {
			heart.startPumping();
		}else {
			System.out.println("you are dead");
		}
	}

}
