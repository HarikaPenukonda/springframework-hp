package com.seleniumexpress.di;

public class Student {
	
	
	//MathCheat mathCheat = new MathCheat(); -> tight coupling using new 		keyword
	private int id;
	private MathCheat mathCheat;
	// how can i inject the value of `mathCheat` reference from a 
	// different class? - setter or constructor injection
	
	public void setId(int id) {
		this.id = id;
	}
	// injecting the `mathCheat` object using setter injection
	public void setMathCheat(MathCheat mathCheat) {
		this.mathCheat = mathCheat;
	}
	
	


	public void cheat() {
		mathCheat.cheating();
		System.out.println("My id is " + id);
	}

	

}
