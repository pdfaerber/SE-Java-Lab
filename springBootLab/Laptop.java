package com.example.demo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;



@Component
@Scope(value = "prototype") //makes this bean the prototype 

public class Laptop {
	private int id; 
	private String make; 
	private String model;
	
//	public Laptop(int id, String make, String model) {
//		super();
//		this.id = id;
//		this.make = make;
//		this.model = model;
//	}
//	
	public Laptop () {
		System.out.println("Laptop Constructor");
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
	
	public void printLapName(String make) {
		System.out.println(make);
	}
	
	
	
	
	

}
