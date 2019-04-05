package com.singleton;

public class SingletonTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		
		Account acc1 = Account.createAccountObjeects();
		Account acc2 = Account.createAccountObjeects();
		//Account aac3 = new Account();
		Account acc3 = Account.createAccountObjeects();
		System.out.println(acc1);
		System.out.println(acc2);
		System.out.println(acc3);
		
	}

}
