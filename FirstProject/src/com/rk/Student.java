package com.rk;

public class Student {
	
	
	//this keyword - is used to refer current class , class level variables
	String name;
	int age;
	float height;
	
	/*
	 * Argument constructors - REquired when we want to assign/induce some default properties
	 */
	public Student(String in_name, int in_age, float in_height) {
		this.name = in_name;
		System.out.println(in_name);
		System.out.println(name + "chandra");
		this.age = in_age;
		System.out.println(in_age);
		System.out.println(age);
	}
	
	/*
	 * Overloading -can have multiple constructiors / methoids with same name but argunnets should be different
	 */
	 
	//2 arg const
	public Student(String name, int age) {
		
	}
	
	//2 arg cocn
	public Student(int age, String name) {
		
	}

}
