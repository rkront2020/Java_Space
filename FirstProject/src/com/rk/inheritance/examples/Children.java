package com.rk.inheritance.examples;

public class Children extends Parents{
	
	public Children() {
		super();
		System.out.println("Children Cinstructor");
	}
	
	@Override
	public void money() {
		System.out.println("Children bekar : 1000$ all money gone");
	}
	
	public void car() {
		System.out.println("Skoda");
	}
	
}
