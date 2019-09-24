package com.employee.exception;

public class BusinessServiceException extends Exception
{
	private static final long SerialVersionUid = 1L;
	private String message;
	
	public BusinessServiceException(String message,Exception e)
	{
		super();
		this.message=message;
	}
	public String getMessage() 
	{
		return message;
	}
}
