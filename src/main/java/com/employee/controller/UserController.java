package com.employee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee.dto.ResponseBean;
import com.employee.entity.Employee;
import com.employee.exception.BusinessServiceException;
import com.employee.service.EmployeeService;

@RequestMapping("/api/employee")
@RestController
public class UserController {

	@Autowired
	private EmployeeService employeeService;

	@PostMapping(value = "/", consumes = org.springframework.http.MediaType.APPLICATION_JSON_VALUE, produces = org.springframework.http.MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<ResponseBean> save(@RequestBody Employee employee) {
		ResponseBean responseBean = new ResponseBean();
		try {
			responseBean = new ResponseBean(true, "Record saved successfully",null, employeeService.save(employee));
		} catch (BusinessServiceException e) {
			e.printStackTrace();
			responseBean = new ResponseBean(true,null, e.getMessage(),null);
		}
		return new ResponseEntity<ResponseBean>(responseBean, HttpStatus.OK);
	}
//
//	@GetMapping(value = "/{employeeemail}", produces = MediaType.APPLICATION_JSON_VALUE)
//	public ResponseEntity<ResponseBean> findByEmailId(@PathVariable String employeeemail) {
//		ResponseBean responseBean = new ResponseBean();
//		try {
//			responseBean = new ResponseBean(true, "Data return successfully",
//					employeeService.findByEmailId(employeeemail));
//		} catch (BusinessServiceException e) {
//			e.printStackTrace();
//			responseBean = new ResponseBean(true, e.getMessage(), null);
//		}
//		return new ResponseEntity<ResponseBean>(responseBean, HttpStatus.OK);
//	}

}
