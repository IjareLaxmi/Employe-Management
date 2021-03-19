package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<Employee, Integer>
{
	 List<Employee> findById(int id);
	 List<Employee> readByName(String name);
	 
	 List<Employee> queryByName(String query);
	 
	List<Employee> getByName(String name);
	
	List<Employee> deleteById(int id);
	
	List<Employee> dis(int id);
	 
}
