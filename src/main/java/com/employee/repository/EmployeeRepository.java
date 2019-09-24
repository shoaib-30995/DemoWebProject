package com.employee.repository;

import com.employee.entity.Employee;
import com.employee.exception.RepositoryException;

public interface EmployeeRepository 
{ 
	public Employee save(Employee employee) throws RepositoryException;
	public Employee findByEmailId(String employeeemail) throws RepositoryException;
	
	
}
