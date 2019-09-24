package com.employee.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.constants.ExceptionMsg;
import com.employee.entity.Employee;
import com.employee.exception.BusinessServiceException;
import com.employee.repository.EmployeeRepository;
import com.employee.exception.RepositoryException;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public Employee save(Employee employee) throws BusinessServiceException {
		try {
			if (employee !=null && employee.getEmployeeemail()!=null) {
				Employee employee2=employeeRepository.findByEmailId(employee.getEmployeeemail());
				if(employee2==null){
					return employeeRepository.save(employee);			
				}else{
					throw new BusinessServiceException(ExceptionMsg.DUPLICATE_EMAILID, null);
				}
			}
		} catch (RepositoryException e) {
			throw new BusinessServiceException(ExceptionMsg.UNABLE_TO_SAVE, e);
		}
		return employee;
	}


}
