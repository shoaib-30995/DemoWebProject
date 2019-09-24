package com.employee.dto;

public class ResponseBean {
	
	private Boolean status;
	private String sucessMsg;
	private String errorMsg;
	private Object response;

	public ResponseBean() {

	}

	public ResponseBean(Boolean status, String sucessMsg, String errorMsg, Object response) {
		super();
		this.status = status;
		this.sucessMsg = sucessMsg;
		this.errorMsg = errorMsg;
		this.response = response;
	}

	public Boolean getStatus() {
		return status;
	}

	public Object getResponse() {
		return response;
	}

	public String getSucessMsg() {
		return sucessMsg;
	}

	public String getErrorMsg() {
		return errorMsg;
	}

}
