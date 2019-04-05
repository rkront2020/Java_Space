package com.newth.th;

public class Car extends Thread {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		Life.getLife();
		for(int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName());
		}
	}

}
