package com.employee.service;

import com.employee.entity.Employee;
import com.employee.exception.BusinessServiceException;


public interface EmployeeService 
{
	public Employee save(Employee employee) throws BusinessServiceException;
}
