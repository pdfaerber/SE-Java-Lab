package com.example.demo.Model;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "students")

public class StudentModel {

	@Id
	private int id; 
	private String name; 
	private int grade;
	private String comment; /* Stringbuilder object datatype to store comments/tips might be a technical challenge to mention during presentation  */
	
	
	public StudentModel() {
		
	}

	public StudentModel(int id, String name, int grade, String comment) {
		super();
		this.id = id;
		this.name = name;
		this.grade = grade;
		this.comment = comment; 
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

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	@Override
	public String toString() {
		return "StudentModel [id=" + id + ", name=" + name + ", grade=" + grade + ", comment=" + comment + "]";
	}

	//remember to convert comment.toString()
	

}


