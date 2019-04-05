package com.rk;

import java.io.Serializable;
import java.util.Scanner;

public class RandomConcepts implements Serializable{
	
	static int i=add();
	
	int j = sub();
	
	final int z = 100;
	
	Integer i1 = new Integer(10);
	
	public static void main(String[] args) {
		//add();
		
		Scanner sc = null;
		try {
			sc = new Scanner(System.in);
		}catch (Exception e) {
			// TODO: handle exception
		}
		finally {
			sc.close();
		}
		
		//try with resources
		try(Scanner sc1 = new Scanner(System.in)){
			
		}catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
	//static block
	static {
		System.out.println("Static block");
		//add();
	}
	
	//instance block
	{
		System.out.println("instance block");
	}
	
	public static int add() {
		System.out.println("Add method");
		return 0;
	}
	
	public int sub() {
		System.out.println("sub");
		return 0;
	}
	
	
	
}
