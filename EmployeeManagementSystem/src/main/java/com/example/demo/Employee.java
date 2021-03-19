package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Employee 
{
	@Id
	int id;
	String name;
	String mail;
	int salary;
	int contact;
	public Employee(int id, String name, String mail, int salary, int contact) {
		super();
		this.id = id;
		this.name = name;
		this.mail = mail;
		this.salary = salary;
		this.contact = contact;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", mail=" + mail + ", salary=" + salary + ", contact="
				+ contact + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getContact() {
		return contact;
	}
	public void setContact(int contact) {
		this.contact = contact;
	}
	
	
	
	
	
}
