package com.mindgate.main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.mindgate.config.ApplicationConfig;
import com.mindgate.pojo.Employee;
import com.mindgate.service.EmployeeService;
import com.mindgate.service.EmployeeServiceInterface;

public class EmployeeCRUDMain {

	public static void main(String[] args)
	{
	    Employee employee=new Employee(100, "Vihan", 500000);
		
		ApplicationContext applicationContext=new AnnotationConfigApplicationContext(ApplicationConfig.class);
		
		EmployeeServiceInterface employeeServiceInterface=applicationContext.getBean("employeeService",EmployeeService.class);
//		boolean result=employeeServiceInterface.addNewEmployee(employee);
//		if(result)
//		{
//			System.out.println("Employee added successfully");
//		}
//		else
//		{
//			System.out.println("Failed to add Employee");
//		}
//		List<Employee> allEmployees = employeeServiceInterface.getAllEmployees();
//		for(Employee employee2:allEmployees)
//		{
//			System.out.println(employee2);
//		}
//		System.out.println("*".repeat(60));
//		
//		Employee priya=employeeServiceInterface.getEmployeeByEmployeeId(42);
//		System.out.println(priya);
		
//		Employee employee2=new Employee(44,"Ravina", 11111);
//		boolean result=employeeServiceInterface.updateEmployee(employee2);
//		if(result)
//		{
//			System.out.println("Employee updated successfully");
//		}
//		else
//		{
//			System.out.println("Failed to Update");
//		}
//		
		boolean result=employeeServiceInterface.deleteEmployeeByEmployeeId(44);
		if(result)
		{
			
				System.out.println("Employee delete successfully");
			}
			else
			{
				System.out.println("Failed to delete");
			}
		}
		
	}


