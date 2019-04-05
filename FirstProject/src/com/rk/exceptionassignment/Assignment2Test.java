package com.rk.exceptionassignment;

import java.util.Scanner;

public class Assignment2Test {

	public static void main(String[] args) throws NumberNotFoundException {
		// TODO Auto-generated method stub
 
		
		int arr[] = {10,2,35,5,8,43,54,6,9,11,22};
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Which number you want to check");
		int num = sc.nextInt();
		int flag = 1;
		for(int i=0;i<arr.length;i++) {
			if(num==arr[i]) {
				System.out.println("number found:"+  i );
				 flag = 0;
			}
			
			
		}
		if(flag!=0) {
		
		throw new NumberNotFoundException("Number Not Found");
		}
	}
	}
	


