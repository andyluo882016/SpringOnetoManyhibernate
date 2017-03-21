package com.example.repository;
import java.util.List;

//import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.example.domain.Employee;
public interface EmployeeRepository extends CrudRepository<Employee, Long>{

	Employee findByCellphone(String cellphone);
	List<Employee> findByemail(String email);
}