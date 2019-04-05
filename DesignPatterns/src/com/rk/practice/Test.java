package com.rk.practice;

public class Test {

	public static void main(String[] args) throws CloneNotSupportedException {
		Singleton obj1 = Singleton.createObjects();
		Singleton obj2 = Singleton.createObjects();
		System.out.println(obj1);
		System.out.println(obj2);

	}

}
