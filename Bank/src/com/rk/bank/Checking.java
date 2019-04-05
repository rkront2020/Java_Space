package com.rk.bank;

import com.rk.bank.custonexceptions.InsufficientFundsAvailableException;

public class Checking {
	float currentbalance;
	
	public void currentBalance(int bal) {
		
		
		
	}
	
	public void deposit(int amt) {
		int perc = 10;
		float savings_value = (perc * amt)/100;
		//System.out.println(savings_value);
		Savings savings = new Savings();
		savings.save(savings_value);
		this.currentbalance = amt - savings_value;
	}
	
	public void withdraw(int wth_amt) throws InsufficientFundsAvailableException {
		if(wth_amt<currentbalance) {
			System.out.println("Okay successful");
			this.currentbalance = this.currentbalance - wth_amt;
			System.out.println("Current Balance is :"+ this.currentbalance);
			
		}
		else {
			throw new InsufficientFundsAvailableException("Sorry the funds in your acc are low. Please reachrage..");
		}
		
	
		
	}

}

