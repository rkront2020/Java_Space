package com.rk.inheritance.examples;

public class InheritanceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Parents pr = new Parents();
		pr.money();
		pr.house();
		
		
		
		System.out.println("-----------");
		Children ch = new Children();
		ch.money();
		ch.house();
		ch.car();
		
		System.out.println("-----------");
		GrandChildren gc = new GrandChildren();
		gc.money();
		gc.house();
		gc.car();
		
		
	}

}
