package com.newth.th;

public class Player extends Thread {
	
	String threadName;
	ThreadGroup tg;
	
	public Player(String threadName, ThreadGroup tg) {
		this.threadName = threadName;
		this.tg = tg;
	}
	
	@Override
	public void run() {
		Life.getLife();
		for(int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName());
		}
	}
	

}
