package com.seleniumexpress.di;

public class Student {
	
	
	//MathCheat mathCheat = new MathCheat(); -> tight coupling using new keyword
	MathCheat mathCheat;
	
	public void cheat() {
		mathCheat.cheating();
	}

}
