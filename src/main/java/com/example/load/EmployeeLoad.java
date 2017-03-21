package com.example.load;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.example.domain.*;
import com.example.repository.*;
@Component
public class EmployeeLoad implements ApplicationListener<ContextRefreshedEvent>{

	private EmployeeRepository employeeRepository;
	private DepartmentRepository departmentRepository;
	
	private Logger log = Logger.getLogger(EmployeeLoad.class);
	 
    @Autowired
    public void setEmployeeRepository(EmployeeRepository productRepository) {
        this.employeeRepository = productRepository;
    }
    @Autowired
    public void setDepartmentRepository(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }
    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
 
       
        
    	Employee emp1 = new Employee("Mark", "Lonting","MakrK@yahoo.com", "987-129-9017");
		Employee emp2 = new Employee("Polin", "Operat","Operaklith@gmail.com", "712-029-1188");
		
		Department department = new Department();
		department.setDepartmentName("IT Consolting INC");
		department.setAddress("6887 East Markting Road Sacrament CA 67542");
		departmentRepository.save(department);
	   
	    emp1.setDepartment(department);
		emp2.setDepartment(department);
		employeeRepository.save(emp1);
		employeeRepository.save(emp2);
    	
    	
    	

 
        log.info("Saved Shirt - id: " + "nothing to save");
 
        
 
        //log.info("Saved Mug - id:" + emp2.getEmail());
    }
}
