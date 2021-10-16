package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {
	private int id;
	private String fname;
	private String lname;
	
	@Autowired
	private Laptop laptop;
	
	@Autowired
	private SmartPhone smartphone; 
	
	
//	public Person(int id, String fname,
//	String lname) {
//		super();
//		this.id = id;
//		this.fname = fname;
//		this.lname = lname;
//	} 
	
	
	public Person () {
		System.out.println("Person");
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getFname() {
		return fname;
	}


	public void setFname(String fname) {
		this.fname = fname;
	}


	public String getLname() {
		return lname;
	}


	public void setLname(String lname) {
		this.lname = lname;
	}


	public Laptop getLaptop() {
		return laptop;
	}


	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}
	
	public SmartPhone getSmartPhone() {
		return smartphone; 
	}
	
	public void setSmartPhone(SmartPhone smartphone) {
		this.smartphone = smartphone; 
		
	}
	

	
	
	}//end Class
