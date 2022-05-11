package com.mindgate.main;

import java.util.Scanner;

import com.mindgate.pojo.Account;

public class AccountApplicationMainV3 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Welcome to Axis Bank");
		
		int AccountNumber;
	    String name;
	    double balance;
	    double amount;
	    boolean result;
	    String continueChoice;
		
		System.out.println("Enter AccountNumber");
		AccountNumber=scanner.nextInt();
		
		System.out.println("Enter name");
		name=scanner.next();
		
		System.out.println("Enter Balance");
		balance=scanner.nextDouble();
		
		Account account=new Account();
		account.setAccountnumber(AccountNumber);
		account.setName(name);
		account.setBalance(balance);
		
		//System.out.println(account.getAccountnumber());
		//System.out.println(account.getName());
		//System.out.println(account.getBalance());
 
		System.out.println("Account opened Susccessfully...");
		do {
			System.out.println("Menu");
			System.out.println("1.Withdraw");
			System.out.println("2.Deposite");
			System.out.println("3.Check Balance");
		
			System.out.println("Enter Your Choice");
			int choice=scanner.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println("For withdraw ");
				System.out.println("Enter Amount");
				 amount=scanner.nextDouble();
				result=account.withdraw(amount);
				if(result)
				{
					System.out.println("Withdraw successfully");
					System.out.println("Balance : "+account.getBalance());
				}
				else {
					System.out.println("Transaction Failed");
				}
				break;
			case 2:
				System.out.println("For Deposite ");
				System.out.println("Enter Amount");
				amount=scanner.nextDouble();
				result=account.deposite(amount);
				if(result)
				{
					System.out.println("Deposite successfully");
					System.out.println("Balance : "+account.getBalance());
				}
				else {
					System.out.println("Transaction Failed");
				}
				break;
			case 3:
				System.out.println("Account Balance");
				System.out.println("Balance : "+account.getBalance());
				break;
		   default:
			   System.out.println("Invalid choice");
			}
			System.out.println("Do you want to continue?");
			continueChoice=scanner.next();
		}while(continueChoice.equals("yes"));
		System.out.println("Thank you for Banking with us...");
		
	}
}
		
		
	 
	
	


