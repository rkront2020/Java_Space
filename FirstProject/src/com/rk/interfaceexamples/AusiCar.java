package com.rk.interfaceexamples;

public class AusiCar implements Car1, Car2{

	@Override
	public void gears() {
		// TODO Auto-generated method stub
		System.out.println("Automatic");
		System.out.println(Car1.chasis);
	}

	@Override
	public void tyres() {
		// TODO Auto-generated method stub
		System.out.println("4+1");
	}

	@Override
	public void trunk() {
		// TODO Auto-generated method stub
		System.out.println("Yes");
	}

	@Override
	public void hatchback() {
		// TODO Auto-generated method stub
		System.out.println("No");
	}

	@Override
	public void sunroof() {
		// TODO Auto-generated method stub
		System.out.println("Yes");
	}

}
