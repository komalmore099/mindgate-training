package com.mindgate.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowiringMain {

	public static void main(String[] args) 
	{
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring.xml");
		
	}

}
