package com.rk.abstractexamples;


/*
 * public - class, var, methods  , inner classes
 * private - var, methods , inner classes
 * protected - var, methods , inner classes
 * default - classes, var, methiods, inner classes
 * 
 * abstract - class, methods
 * static - var, methods , inner classes
 * Final - class, var, method
 */
public abstract class Section {
	
	
	
	
	//Constructior is hidden & not available - so cannot create a object
	
	
	//if one methos is abstract then class should also be abstract
	public abstract void sectionName();
	
	public void benches() {
		System.out.println("10 benches");
	}
	
	public void doors() {
		System.out.println("2 doors ");
	}

}
