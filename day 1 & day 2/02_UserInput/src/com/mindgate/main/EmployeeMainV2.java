package com.mindgate.main;

import com.mindgate.pojo.Employee;

public class EmployeeMainV2 {

	public static void main(String[] args) {
		Employee employee=new Employee(101, "Vivek", 1000);
		System.out.println(employee);
		System.out.println(employee.toString());//both are same

	}

}
