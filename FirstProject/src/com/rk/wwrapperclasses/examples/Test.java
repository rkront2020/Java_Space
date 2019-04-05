package com.rk.wwrapperclasses.examples;



public class Test {
	
	
	public static void main(String[] args) {
		
		int i = 0;
		long l = 100;
		float f = 10.0f;
		double d = 20.20;
		boolean b = true;
		short s = 2;
		byte by = 2;
		
		String str = "eee";
		
		//Wrapper Classes
		Integer ii = 100;
		Integer iii = new Integer(100);
		Long lll = (long) 10000000;
		Float ffff = 10.10f;
		Double dddd = 202.02;
		Boolean bbbb = true;
		Short ssss = 2;
		Byte bbbbbbb = 2;
		
		
		//Primitive - Addition 
		int x = 10;
		int y = 20;
		int z = x + y;
		System.out.println("Prim : "+z);
		
		//Warpper Classes - Adition 
		Integer x1 = new Integer(100);
		Integer y1 = new Integer(200);
		Integer z1 = x1 + y1;
		System.out.println("Wrapper : "+ z1);
		
		//1.5 JAva Version - Autoboxing & Auto Unboxing 
		/*
		 * Integer x1 unboxed to int x1 
		 * Intgeer y1 unboxed to int y1
		 * int & int can be added - so they are added and the resukt is also int
		 * now this result int is auto boxed to Integer z1
		 */
		Integer z2 = x1 + y1; 
		
		//Wrapper classes can also be used to perform conversions moslty from String 
		
		String str1 = "10000";
		String str2 = "20000";
		
		//Integer.parseXXX() - xxx can be int, long, float.....
		int result = Integer.parseInt(str1) + Integer.parseInt(str2);
		System.out.println(result);
		
		
		
	}

}
