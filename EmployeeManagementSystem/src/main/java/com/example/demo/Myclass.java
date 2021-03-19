package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Myclass 
{
	@Autowired
	EmployeeRepo es;
	@RequestMapping("/")
	public String show()
	{
		System.out.println("hello from show");
		//List<Employee> list=es.findAll();
		//List<Employee> list=es.findById(2);	
		//List<Employee> list=es.readByName("raju");	
		//List<Employee> list=es.queryByName("sanju");		
		
		
		
		List<Employee> list=es.deleteById(2);		
		
		System.out.println(list);
		return "show.jsp";
	}

}
