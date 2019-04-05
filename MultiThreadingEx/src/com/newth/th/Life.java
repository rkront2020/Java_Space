package com.newth.th;

import com.rk.explore.sync.Operations;

public class Life {
	
	//public static synchronized void getLife()
	public static void getLife() {
		System.out.println("Life");
		System.out.println("eed");
		
		synchronized (new Operations()) {
			System.out.println("wdwd");
			System.out.println("wdqw");
		}
		
		
		System.out.println("Lif53646e");
	}

}
