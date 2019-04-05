package com.newth.th;

public class ThreadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThreadGroup racingGrouo = new ThreadGroup("Race Group");
		
		Player p = new Player("Driver", racingGrouo);
		p.start();
		//p.setDaemon(true);
		
		Car c = new Car();
		c.start();
		
		//Accelaration acc = new Accelaration();
		//Thread t = new Thread(acc);
		
		Thread t = new Thread(new Accelaration());
		t.start();
		
		
		
		
	}

}
