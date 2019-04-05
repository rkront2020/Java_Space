package com.rk.binarysearch;

public class BinarySearch {
	//Iteration  Without recursion
	/*int binarysearch(int arr[],int x) {
		int l=0, r = arr.length-1;
		while(l<=r) {
			int m = l + (r-1)/2;
			
			if(arr[m] == x)
				return m;
			
			if(arr[m] < x)
				l = m +1;
			
			else
				r = m - 1;
		}
		return -1;
	}*/
	
	//With Recursion
	int binarysearch(int arr[],int l, int r, int x) {
		
		if(r >= l) {
			
			int m = l + (r - l)/2;
			
			// if mid element is x
			if(arr[m] == x)
				return m;
			if(arr[m] > x)
				return binarysearch(arr,l,m-1,x);
			
			return binarysearch(arr, m+1, r, x);
		}
		return -1;
	}
 
	
	

}
