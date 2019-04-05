package com.rk.practice;

public class Singleton {
	
	private Singleton() {
		
	}
	
	private static Singleton myobj;
	
	public static Singleton createObjects() throws CloneNotSupportedException{
		if(myobj== null) {
			myobj = new Singleton();
		}
		return myobj;
	}

}
