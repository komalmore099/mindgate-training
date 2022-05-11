package com.mindgate.main;

import com.mindgate.pojo.Current;

public class AccountApplicationV6 {

	public static void main(String[] args) {
		
		Current current=new Current(101, "komal", 10000, 50000);
		System.out.println(current);
		
		System.out.println("Withdraw = 5000");
		current.withdraw(5000);
		System.out.println(current); //overdraft=50000,Balance =5000
	
	System.out.println();
		
		System.out.println("withdraw=20000");
		current.withdraw(20000);
		System.out.println(current); //overdraft=35000,Balance =0
		
		System.out.println();
		
		System.out.println("deposite=5000");
		current.withdraw(5000);
		System.out.println(current); //overdraft=40000,Balance =0
//		
//		System.out.println();
//		
//		System.out.println("deposite=15000");
//		current.withdraw(5000);
//		System.out.println(current); //overdraft=50000,Balance =5000
//		
		
		
		

	}

}
