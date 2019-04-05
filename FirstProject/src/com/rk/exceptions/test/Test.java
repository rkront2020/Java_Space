package com.rk.exceptions.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) throws IOException{
		
		/*
		 * Exceptions - Checked Exceptions & Unchecked Exceptions
		 * Exception (C) - ArthimeticException (SC), NullPointerException(SC)
		 */
		/*
		 * Way 1 : 
		 * try-catch block
		 * try - write the code 
		 * catch - what if something exception occurs 
		 * Java 1.7 - Multi Catch block is available, multi line catch block
		 * 
		 * try-catch-finally block 
		 */
		/*Scanner sc = null;
		try {
			sc = new Scanner(System.in);
			//
			//
			String str = null;
			//System.out.println(str.length());
		}catch (ArrayIndexOutOfBoundsException | ArithmeticException | NullPointerException e) {
			//System.out.println("AINOUBE");
			e.printStackTrace();
		}catch (Exception e) {
			// TODO: handle exception
		}finally {
			//System.out.println("OOPS Sorry about that");
			sc.close();
		}
		
		
		try {
			//int i = 1/0;
		}finally {
			//System.out.println("Finally");
		}
		
		int i = 1/0;*/
		
		
		//Checked Exceptions  - throws keyword used at method level & also to delegate the exception to its caller methods
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//br.readLine();
		
		//throw keyword - raising the exception by yourself
		//throw new NullPointerException();
		
		
		
		
		
	}
	
	
}
