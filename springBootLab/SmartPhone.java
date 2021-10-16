package com.example.demo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "prototype")//makes this bean the prototype


public class SmartPhone {
	private int id;
	private String make;
	private String model; 
	private String carrier;
	
	//parameterized constructor
//	public SmartPhone(int id, String make, String model, String carrier) {
//		super();
//		this.id = id;
//		this.make = make;
//		this.model = model;
//		this.carrier = carrier;
//	}
	
	//empty constructor
	public SmartPhone() {
		
	}

	
	
	//Getters & Setters to give our properties some values to retrieve
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

	public String getCarrier() {
		return carrier;
	}

	public void setCarrier(String carrier) {
		this.carrier = carrier;
	}
	
	public void printPhoneMake(String make) {
		System.out.println(make);
	}
	
	
	
	
	

}//end class SmartPhone
