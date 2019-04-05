package com.rk.th;

import com.rk.th.way2.YourThread1;
import com.rk.th.way2.YourThread2;

public class YourThreadTesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		YourThread1 y1 = new YourThread1();
		//Extra Step when your Thread is from Runnable is 
		Thread t1 = new Thread(y1);
		t1.start();
		
		YourThread2 y2 = new YourThread2();
		//Extra Step when your Thread is from Runnable is 
		Thread t2 = new Thread(y2);
		t2.start();

	}

}
