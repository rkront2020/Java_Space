package com.rk.th.way1;

//Ste 1 : your class sholuld extend from java.lang.Thread class
public class MyThread1 extends Thread{

	//Step 2: Must & should override the run method from Thread class
	@Override
	public void run() {
		for (int i = 0; i < 50; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("MyThread1");
		}
	}
	
	public void add() {
		
	}

}
