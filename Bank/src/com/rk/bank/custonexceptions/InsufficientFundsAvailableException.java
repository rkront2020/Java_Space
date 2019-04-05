package com.rk.bank.custonexceptions;


/*
 * Step 1 : you class must & should extend from Exception class
 */
public class InsufficientFundsAvailableException extends Exception{
	
	/*
	 * Step 2: Need to have a One Argumnet Constructor that could take the custom message
	 */
	public InsufficientFundsAvailableException(String message) {
		/*
		 * Step3: pass the message to the Exception class constructor using super keyword and it should take care.
		 */
		super(message);
	}

}
