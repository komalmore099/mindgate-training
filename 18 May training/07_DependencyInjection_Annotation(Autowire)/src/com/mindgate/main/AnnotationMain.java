package com.mindgate.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mindgate.pojo.Address;
import com.mindgate.pojo.Employee;

public class AnnotationMain {

	public static void main(String[] args) 
	{
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring.xml");
		
		Address address=applicationContext.getBean("address",Address.class);
		
		address.setAddressId(1);
		
		System.out.println(address);
		
		System.out.println("*".repeat(55));
		
		Employee employee=applicationContext.getBean("employee",Employee.class);
		employee.setHomeAddress(address);
	    System.out.println(employee);
		
	}

}
