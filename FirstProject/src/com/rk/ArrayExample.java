package com.rk;

public class ArrayExample {
	
	public static void main(String[] args) {
		
		int arr[] = new int[3];
		System.out.println(arr.length);
		arr[0] = 1100;
		System.out.println(arr[0]);
		
		
		int arr1[] = {100,200,300,400};
		System.out.println(arr1.length);
		
		for(int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}
		
	}

}
