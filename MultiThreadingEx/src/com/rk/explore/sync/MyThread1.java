package com.rk.explore.sync;

//Ste 1 : your class sholuld extend from java.lang.Thread class
public class MyThread1 extends Thread{

	//Step 2: Must & should override the run method from Thread class
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			Operations.add(Thread.currentThread());		
		}
		
	}

}
