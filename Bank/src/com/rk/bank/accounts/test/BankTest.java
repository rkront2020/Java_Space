//first statemnet should always be package if it exists

/*
 * Author - Rahuk Kumar
 * Date - Jan/03/2019
 * Version - 1.0
 * 
 * This package conatins classes for testing the accounts
 */
package com.rk.bank.accounts.test;


//Second thinhs should always be imoorts if they exists
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import com.rk.bank.*;
import com.rk.bank.custonexceptions.InsufficientFundsAvailableException;

/* - Multi line comment
 some code 
 some code
 */

/*
 * BankTest class is for testing checking & savings accounts
 */
public class BankTest {
	public static void main(String[] args) throws IOException, InsufficientFundsAvailableException {
		
		//Dynamic Inputs / User Input 
		//First Way 
		/*BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please Enter something");
		String input = br.readLine();
		System.out.println("Input was "+ input);*/
		
		
		//Second Way /preffered 
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter Amount to deposit : ");
		int amt = sc.nextInt();
		//System.out.println(amt);
		
		
		/*
		 * Creating a object & testing the checking class
		 */
		Checking chk = new Checking();
		chk.deposit(amt);
		
		System.out.println("What amount to withdraw: ");
		int amt_to_withdraw = sc.nextInt();
		chk.withdraw(amt_to_withdraw);
		
		// Checking current balance
		
	}

}
