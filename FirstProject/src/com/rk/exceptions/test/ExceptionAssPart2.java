package com.rk.exceptions.test;

import java.util.Scanner;

import com.rk.exceptionassignment.NumberNotFoundException;

public class ExceptionAssPart2 {

	public static void main(String[] args) throws IndexNotAvailableException, NumberNotFoundException {
		// TODO Auto-generated method stub

		int arr[] = { 10, 2, 35, 5, 8, 43, 54, 6, 9, 11, 22 };

		Scanner sc = new Scanner(System.in);
		System.out.println("Which number you want to check");
		int num = sc.nextInt();
		System.out.println("which index?");
		int index = sc.nextInt();

		if (index > arr.length) {
			throw new IndexNotAvailableException("Index not found");
		}
		if (arr[index] == num) {
			System.out.println("Yes number matched");

			//try {
			//	if(num >= 0) {
			//		throw new NumberisPositiveException("Positive Number");
			//	}
			//}
			//catch(NumberisPositiveException e){
			//	e.printStackTrace();
				
		
			sc.close();
				System.out.println("fuck off");
			}
		 else {
			throw new NumberNotFoundException("Number Not matched at given location");
		}
		

	}

}
