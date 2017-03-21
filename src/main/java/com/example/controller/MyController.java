package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.domain.Employee;
import com.example.repository.EmployeeRepository;

@RestController
public class MyController {
    @Autowired
	private EmployeeRepository employeeRepository;
    
    @RequestMapping(value="/getOne/{email}", method = RequestMethod.GET)
    public Employee findOneEmpl(@PathVariable("email") String email){
    	Employee emp=(Employee) employeeRepository.findByemail(email);
    	return emp;
    }
    
    @RequestMapping(value="/getAlls", method = RequestMethod.GET)
    public List<Employee> findAlls(){
    	List<Employee> emps=(List<Employee>) employeeRepository.findAll();
    	return emps;
    }
}
