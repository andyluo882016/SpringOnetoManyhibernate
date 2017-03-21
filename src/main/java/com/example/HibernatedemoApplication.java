package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.domain.Department;
import com.example.domain.Employee;
import com.example.repository.EmployeeRepository;
@SpringBootApplication
public class HibernatedemoApplication {
	//private static final Logger log = LoggerFactory.getLogger(HibernatedemoApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(HibernatedemoApplication.class, args);
		
		
	}
	
	
	
}
