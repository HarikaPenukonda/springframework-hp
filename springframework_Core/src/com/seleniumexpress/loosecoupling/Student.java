package com.seleniumexpress.loosecoupling;

public class Student {
	
	private Cheat cheat;

	public void setCheat(Cheat cheat) {
		this.cheat = cheat;
	}
	
	public void cheating() {
		cheat.cheat();
	}
	
	/*
	 * private ScienceCheat scienceCheat;
	 * 
	 * public void setScienceCheat(ScienceCheat scienceCheat) { this.scienceCheat =
	 * scienceCheat; }
	 * 
	 * public void cheat() { scienceCheat.cheating(); }
	 */
	
	/*	so instead of changing the source eg. from mathCheat to scienceCheat
	 *  which is tight coupling, we can use interface reference for loose coupling
	 * */    
	
	
	/*
	 * //MathCheat mathCheat = new MathCheat(); -> tight coupling using new keyword
	 * private int id; private MathCheat mathCheat; // how can i inject the value of
	 * `mathCheat` reference from a // different class? - setter or constructor
	 * injection
	 * 
	 * public void setId(int id) { this.id = id; } // injecting the `mathCheat`
	 * object using setter injection public void setMathCheat(MathCheat mathCheat) {
	 * this.mathCheat = mathCheat; }
	 * 
	 * public void cheat() { mathCheat.cheating(); System.out.println("My id is " +
	 * id); }
	 */

	

}
