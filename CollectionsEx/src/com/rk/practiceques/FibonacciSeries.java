package com.rk.practiceques;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Fibonacci Series");
		int i, n, n1 = 0, n2 = 1, next_num;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter input");
		n = sc.nextInt();
		System.out.println(n);
		for(i = 1; i <= n; i++) {
			System.out.println(n1);
			next_num = n1 + n2;
			n1 = n2;
			n2 = next_num;
		}
		

	}

}
