package com.seleniumexpress.di;

public class Student {
	
	
	//MathCheat mathCheat = new MathCheat(); -> tight coupling using new keyword
	MathCheat mathCheat;
	// how can i inject the value of `mathCheat` reference from a 
	// different class? - setter or constructor injection
	
	// injecting the `mathCheat` object using setter injection
	public void setMathCheat(MathCheat mathCheat) {
		this.mathCheat = mathCheat;
	}
	
	public void cheat() {
		mathCheat.cheating();
	}

	

}
