package com.rk.explore.sync;

public class MyThread2 extends Thread{
	
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			Operations.add(Thread.currentThread());		
		}
	}
	
}
