package com.mindgate.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.mindgate.pojo.Employee;

public class EmployeeRowMapper implements RowMapper<Employee>
{

	@Override
	public Employee mapRow(ResultSet resultSet, int i) throws SQLException {
		int employee_id=resultSet.getInt("employee_Id");
		String name=resultSet.getString("name");
		double salary=resultSet.getDouble("salary");
		
		Employee employee=new Employee(employee_id, name, salary);
		
		return employee;
	}
	
	

}
