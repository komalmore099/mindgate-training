package com.mindgate.main;

import com.mindgate.pojo.GoodMorningGreeter;
import com.mindgate.pojo.Greetings;

public class GreetingMain
{

	public static void main(String[] args)
	{
//		Greetings greetings1=new GoodMorningGreeter(); 
//		greetings1.greet();
//		
		Greetings greetings=() ->{
			System.out.println("Good afternoon");
			System.out.println("Good night");
			};
			greetings.greet();
		
		
		
	}
		
}


