package com.rk.inheritance.examples;

public class GrandChildren extends Children{
	
	public GrandChildren() {
		System.out.println("GrandChildren Constr");
	}
	
	@Override
	public void money() {
		System.out.println("Grand Children bekar : 0$ all money gone");
	}

}
