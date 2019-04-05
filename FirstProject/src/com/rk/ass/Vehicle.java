package com.rk.ass;

import com.rk.exceptions.test.NumberisPositiveException;

public class Vehicle {
	String name;
	
	public Vehicle(String name) {
		this.name = name;
		System.out.println(name);
		
	} 
	public void gears(int gear) throws NumberisPositiveException {
		gear = gear + 1;
		Vehicle.display(gear);
		throw new NumberisPositiveException("");
		
	}
	public void engine_power(){
		name = name + "Rahul";
		Vehicle.display(name);
		//gears(3);
	}
	public void speed_limit() {
		int income = 100000;
		float given_perct = 30;
		float result = (given_perct/100)*income;
		Vehicle.display(result);
			
		
	}
	public static void display(Object something) {
		System.out.println(something);
		
	}
 
}
