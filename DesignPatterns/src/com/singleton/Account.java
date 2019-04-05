package com.singleton;

public class Account {
	
	//for making new keyword not to create objects
	private Account() {
		//Private Constructor
	}
	
	//Assigning the Account instance for check
	private static Account acc;
	int i;
	
	//Singleton Method
	public static Account createAccountObjeects() throws CloneNotSupportedException {
		
		//Check for instance & gets satisfied for only first object
		if(acc == null) {
			acc = new Account();
		}
		
		return acc;
	}

}
