package com.RL.RegLog.service;

import java.util.List;

import com.RL.RegLog.Entity.Employee;
import com.RL.RegLog.dto.EmployeeDTO;
import com.RL.RegLog.dto.LoginDTO;
import com.RL.RegLog.response.LoginMesage;

public interface EmployeeService {
    String addEmployee(EmployeeDTO employeeDTO);
 
    LoginMesage loginEmployee(LoginDTO loginDTO);
    
    String updateById(Employee emp);
    
    void delById(int employeeid);
    
    List<Employee> getAllEmployee ();
    
    Employee empById(int employeeid);
    
    Employee empByEmail(String email);
}
