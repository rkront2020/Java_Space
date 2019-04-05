package com.rk.th;

import com.rk.th.way1.MyThread1;
import com.rk.th.way1.MyThread2;

public class MyThreadTesting {
	
	/*  					          --> wait
	 * 								  --> sleep
	 * 								  --> yield
	 * Create Thread --> start --> running --> stop
	 */

	public static void main(String[] args) {
		
		//Thread Execution Way1
		MyThread1 mt1 = new MyThread1();
		mt1.start();
		
		MyThread2 mt2 = new MyThread2();
		mt2.start();
		
		
	}

}
