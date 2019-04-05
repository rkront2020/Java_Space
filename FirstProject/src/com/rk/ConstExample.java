package com.rk;

public class ConstExample {
	
	//class variables - static varb, non-static
	//static variables 
	static int xaxis = 0;
	int yaxis = 0;
	
	
	//Constructor - Used for constructing the Object for a class 
	/*
	 * Always public
	 * Default Constructor - Comiler will takecare of creaing this, its a zero Argument constructor
	 * Dafult Const - is not visibkle with in class but still exists
	 * when we create a constructor, compiler will not create a deafult const
	 */
	public ConstExample() {
		System.out.println("ConstExample Constructor");
	}
	
	
	public void ex() {
		//Local Variables
		int x = 0;
		xaxis = 20;
	}
	
	public static void exy() {
		xaxis = 20;
	}

}
