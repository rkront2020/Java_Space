package com.singleton;

public class TestLogger {

	public static void main(String[] args) {
		
		Logger obj1 = Logger.getInstance();
		Logger obj2 = Logger.getInstance();
		
		System.out.println("----Singleton---");
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
		
		System.out.println("---non Singleton---");
		
		TestLogger obj3  = new TestLogger();
		TestLogger obj4 = new TestLogger();
		System.out.println(obj3.hashCode());
		System.out.println(obj4.hashCode());

	}

}
