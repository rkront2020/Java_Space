package com.rk.th.way2;

import com.rk.th.way1.ThreadCommonParent;

public class YourThread1 extends ThreadCommonParent implements Runnable{

	@Override
	public void run() {
		for (int i = 0; i < 50; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("YourTHread1");
		}
	}
}
