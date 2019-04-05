package com.rk.explore.sync;

public class Operations {

	/*
	 * synchronized method - to sync whole method
	 * syncronized block - Just to sync a part of the method
	 */
	//public static synchronized void add(Thread threadName) {
	public static void add(Thread threadName) {
		System.out.println(threadName);
		synchronized (threadName) {
			System.out.println(threadName + " : sync block");
		}
		
	}

}
