package com.rk.factory;


//Factory class
public class AccountFactory {
	
	//Factory method
	public static Account createAccountObjects() {
		return new Account2();
	}

}
