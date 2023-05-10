package com.RL.RegLog.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.RL.RegLog.Entity.Employee;
import com.RL.RegLog.dto.EmployeeDTO;
import com.RL.RegLog.dto.LoginDTO;
import com.RL.RegLog.response.LoginMesage;
import com.RL.RegLog.service.EmployeeService;

@RestController
@CrossOrigin
@RequestMapping("/api/emp")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;

	@PostMapping(path = "/save")
	public String createEmp(@RequestBody EmployeeDTO employeeDTO)
	{
		String id = employeeService.addEmployee(employeeDTO);
		return id;
	}
	
	
	@PostMapping(path = "/login")
	public ResponseEntity<?> loginEmp(@RequestBody LoginDTO loginDTO)
	{
		LoginMesage loginMesage = employeeService.loginEmployee(loginDTO);
		return ResponseEntity.ok(loginMesage);
	}
	
	@PutMapping(path = "/update")
	public String updateById(@RequestBody Employee emp)
	{
		return employeeService.updateById(emp);
	}
	
	@DeleteMapping(path = "/delete/{employeeid}")
	public void delById(@PathVariable int employeeid)
	{
		employeeService.delById(employeeid);
		System.out.print("Data Removed");
	}
	
	@PostMapping(path = "/allemp")
	public List<Employee> getAllEmployee()
	{
		return this.employeeService.getAllEmployee();
	}
	
	@PostMapping(path = "/empById/{employeeid}")
	public Employee empById(@PathVariable int employeeid)
	{
		return this.employeeService.empById(employeeid);
	}
	
	@PostMapping(path = "/empByEmail/{email}")
	public Employee empByEmail(@PathVariable String email)
	{
		return this.employeeService.empByEmail(email);
	}
	
	
	
}
