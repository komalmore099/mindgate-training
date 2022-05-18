package com.mindgate.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mindgate.pojo.Address;
import com.mindgate.pojo.Employee;

public class AddressMain {

	public static void main(String[] args) 
	{
		//Address address=new Address();
		
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring.xml");
	
		Address address=applicationContext.getBean("address",Address.class);
		System.out.println(address);
		
		Employee employee=applicationContext.getBean("employee",Employee.class);
		System.out.println(employee);
	}

}
