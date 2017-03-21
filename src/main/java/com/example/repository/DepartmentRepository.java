package com.example.repository;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.domain.Department;
public interface DepartmentRepository  extends CrudRepository<Department, Long>{

}
