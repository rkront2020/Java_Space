package com.rk.randompractice;

public class StrPrac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// S1 is in Heap
		String S1 = new String("Rahul");
		
		//S2 is in SCP
		String S2 = S1.intern();
		
		//Check if S1 and S2 are both in same location
		System.out.println(S1 == S2);

	}

}
