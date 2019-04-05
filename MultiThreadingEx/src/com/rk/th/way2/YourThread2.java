package com.rk.th.way2;

public class YourThread2 implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 50; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("YourTHread2");
		}
	}

}
