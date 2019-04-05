package com.rk;

/*
 * class level - public , default, abstrcat. final
 * 
 */

public class HelloWorld {
	
	/*
	 * Inner classes - Last concept - public, pricate, protected, deafult
	 */
	
	protected class Inner{
		
	}
	
	
	/*
	 * publc - access to all classes in all packages with in whole application
	 */

	public static void main(String[] args) {
		
		System.out.println("Hello World");
		
	}
	
	/*
	 * deafault - visible with in package only
	 */
	void add() {
		
	}
	
	/*
	 * private - visible within the class only / only for that class
	 */
	private void sub() {
		
	}
	
	/*
	 * protected - visible with in package  and for inherited classes
	 */
	protected void mul() {
		
	}

}

