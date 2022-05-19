package com.mindgate.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.mindgate.dao.EmployeeDAOInterface;
import com.mindgate.pojo.Employee;

@Service("employeeService")
@Scope("prototype")
public class EmployeeService implements EmployeeServiceInterface
{
	@Autowired
	private EmployeeDAOInterface employeeDAOInterface;
	@Override
	public boolean addNewEmployee(Employee employee) {
		// TODO Auto-generated method stub
		System.out.println("Inside employee addNewEmployee()");
		System.out.println(employee);
		return employeeDAOInterface.addNewEmployee(employee);
	}
	@Override
	public List<Employee> getAllEmployees() {
		return employeeDAOInterface.getAllEmployees();
	}
	@Override
	public Employee getEmployeeByEmployeeId(int employee_Id) {
		return employeeDAOInterface.getEmployeeByEmployeeId(employee_Id);
	}
	@Override
	public boolean updateEmployee(Employee employee) {
		return employeeDAOInterface.updateEmployee(employee);
	}
	@Override
	public boolean deleteEmployeeByEmployeeId(int employeeId) {
		return employeeDAOInterface.deleteEmployeeByEmployeeId(employeeId);
	}
	
	

}
