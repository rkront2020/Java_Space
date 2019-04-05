package com.rk.explore.sync;

public class SyncTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyThread1 mt1 = new MyThread1();
		mt1.setName("Hero");
		mt1.start();
		System.out.println(mt1.getPriority());
		mt1.setPriority(1);
		System.out.println(mt1.getPriority());
		
		MyThread2 mt2 = new MyThread2();
		mt2.setName("Villan");
		mt2.start();

	}

}
