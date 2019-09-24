package com.employee.repository;

//import javax.jdo.Query;
import javax.jdo.Query;

import org.springframework.stereotype.Repository;

import com.employee.entity.Employee;
import com.employee.exception.RepositoryException;

import com.employee.repository.EmployeeRepository;
import com.employee.repository.GenericRepository;

@Repository
public class EmployeeRepositoryImpl extends GenericRepository<Employee> implements EmployeeRepository {

	@Override
	public Employee save(Employee employee) throws RepositoryException {

		return super.save(employee);
	}

	@Override
	public Employee findByEmailId(String employeeemail) throws RepositoryException {
		Query query = this.pm().newQuery(Employee.class);
		query.setFilter("this.employeeemail ==:employeeemail");
		query.setUnique(true);
		return (Employee) query.execute(employeeemail);
	}

}
