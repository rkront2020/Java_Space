package com.rk.binarysearch;

public class BinarySearchTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		BinarySearch ob = new BinarySearch();
		int arr[]= {2,3,4,10,40};
		int n = arr.length;
		int x = 3;
		int result = ob.binarysearch(arr,0,n-1 ,x);
		if (result == -1)
			System.out.println("Not there, Sorry");
	  
		else
			System.out.println("Element found at index " + result);
	}

}
