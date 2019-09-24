package com.employee.entity;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.DatastoreIdentity;
import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.PrimaryKey;


@PersistenceCapable(table="employee", detachable="true")
@DatastoreIdentity(customStrategy = "uuid")
public class Employee 
{ 
	
	@PrimaryKey(column = "EMPLOYEEID")
	//@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	@Persistent(customValueStrategy = "uuid")
	private String employeeid;
	
	@Persistent(column = "EMPLOYEENAME")
	private String employeename;
	
	@Persistent(column = "EMPLOYEEADDRESS")
	private String employeeaddress;
	
	@Persistent(column = "EMPLOYEEEMAIL")
	private String employeeemail;
	
	
	public Employee()
	{
		
	}
	 public Employee(String employeeid, String employeename, String employeeaddress, String employeeemail) 
	 {
	        this.employeeid = employeeid;
	        this.employeename = employeename;
	        this.employeeaddress = employeeaddress;
	        this.employeeemail = employeeemail;
	 }
	
	public String getEmployeeid() 
	{
		return employeeid;
	}
	public String getEmployeename() 
	{
		return employeename;
	}
	public String getEmployeeaddress() 
	{
		return employeeaddress;
	}
	public String getEmployeeemail() 
	{
		return employeeemail;
	}
}
