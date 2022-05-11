package com.mindgate.main;

import com.mindgate.pojo.Account;

public class AccountApplicationMainV2 {

	public static void main(String[] args) {
     Account account=new Account(101, "Mahima", 1000);
     boolean result=account.withdraw(2002);
     if(result)
     {
    	 System.out.println("Transaction completed successfully");
    	 System.out.println("Balance :"+ account.getBalance());
     }
     else
     {
    	 System.out.println("Transaction Failed");
    	 System.out.println("Balance :"+account.getBalance());
     }
     System.out.println("-".repeat(25));
	
	//For deposite
	result=account.deposite(200);
	if(result)
	{
		System.out.println("Transaction completed successfully");
		 System.out.println("Balance :"+account.getBalance());
	}
	else
	{
		System.out.println("Transaction Failed");
   	 System.out.println("Balance :"+account.getBalance());
		
	}
	}
}
