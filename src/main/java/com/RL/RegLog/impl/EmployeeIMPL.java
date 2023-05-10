package com.RL.RegLog.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.RL.RegLog.Entity.Employee;
import com.RL.RegLog.dto.EmployeeDTO;
import com.RL.RegLog.dto.LoginDTO;
import com.RL.RegLog.repository.EmployeeRepo;
import com.RL.RegLog.response.LoginMesage;
import com.RL.RegLog.service.EmployeeService;

@Service
public class EmployeeIMPL implements EmployeeService {

	@Autowired
    private EmployeeRepo employeeRepo;
 
    @Autowired
    private PasswordEncoder passwordEncoder;
	
	@Override
	public String addEmployee(EmployeeDTO employeeDTO) {
		 Employee employee = new Employee(
				 
	                employeeDTO.getEmployeeid(),
	                employeeDTO.getEmployeename(),
	                employeeDTO.getEmail(),
	 
	               this.passwordEncoder.encode(employeeDTO.getPassword()),
	               employeeDTO.getRole()
	        );
	 
	        employeeRepo.save(employee);
	 
	        return employee.getEmployeename();
	}
	 EmployeeDTO employeeDTO;

	@Override
	public LoginMesage loginEmployee(LoginDTO loginDTO) {
		//String msg = "";
        Employee employee1 = employeeRepo.findByEmail(loginDTO.getEmail());
        if (employee1 != null) {
            String password = loginDTO.getPassword();
            String encodedPassword = employee1.getPassword();
            Boolean isPwdRight = passwordEncoder.matches(password, encodedPassword);
            if (isPwdRight) {
                Optional<Employee> employee = employeeRepo.findOneByEmailAndPassword(loginDTO.getEmail(), encodedPassword);
                if (employee.isPresent()) {
                    return new LoginMesage("Login Successfull", true);
                    
                } else {
                    return new LoginMesage("Login Failed", false);
                }
            } else {
 
                return new LoginMesage("Password Not Match", false);
            }
        }else {
            return new LoginMesage("Email Not Exists", false);
        }
	}

	@Override
	public String updateById(Employee emp) {
		
		Employee employee2 = new Employee(
				emp.getEmployeeid(),
				emp.getEmployeename(),
				emp.getEmail(),
				this.passwordEncoder.encode(emp.getPassword()),
				emp.getRole()
				); 
		
		 employeeRepo.save(employee2);
		 
		 return employee2.getEmployeename();
	}
	

	@Override
	public void delById(int employeeid) {
		employeeRepo.deleteById(employeeid);
		
	}

	@Override
	public List<Employee> getAllEmployee() {
		return employeeRepo.findAll();
	}

	@Override
	public Employee empById(int employeeid) {
		return employeeRepo.findById(employeeid).get();
	}

	@Override
	public Employee empByEmail(String email) {
		// TODO Auto-generated method stub
		return employeeRepo.findByEmail(email);
	}

}
