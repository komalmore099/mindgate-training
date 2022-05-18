package com.mindgate.main;

import com.mindgate.pojo.Address;
import com.mindgate.pojo.Employee;

public class Main {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Address address=new Address(101, "sakki naka", "Kalyan", "Maharashtra");
		
		Employee employee=new Employee(1, "mahi", 10000, address);//employee dependa on address object called as dependency
		
		System.out.println(employee);

	}

}
