package com.rk.ass;

import com.rk.exceptions.test.NumberisPositiveException;

public class VehicleTest {
	public static void main(String[] args) throws NumberisPositiveException {
		
		Vehicle Obj1 = new Vehicle("Hyundai");
		
		Obj1.gears(2);
		Obj1.engine_power();
		Obj1.speed_limit();
		
	}
}
