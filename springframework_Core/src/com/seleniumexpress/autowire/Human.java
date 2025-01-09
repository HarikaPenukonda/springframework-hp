package com.seleniumexpress.autowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human {
	
	@Autowired // automatic wiring of dependencies
	@Qualifier("octopusHeart") // letting spring know which particular object it needs to perform dependency injection
	private Heart heart;

	/*	If match found for `octopusHeart` in beans.xml then directly
	 *  creates `octopusHeart` object and inject that to the dependency called heart
	 *  first it checks byType and then byName
	 * */
	public void pump() {
		if(heart != null) {
			heart.startPumping();
			System.out.println("name of the animal : " + heart.getNameOfAnimal() + " number of heart " + heart.getNoOfHeart());
		}else {
			System.out.println("you are dead");
		}
	}

}
