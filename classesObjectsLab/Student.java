package classesObjectsLab;

	
	public class Student extends Person {
		// ===== WHAT IS INHERITANCE? =====
		/*
		 * • A class that can inherit properties and methods from other class. Instance
		 * variables and methods* 
		 * • Interviewer: Constructor is never inherited. Each
		 * class has their own constructor. 
		 * • A class becomes a superclass or a parent
		 * class if it's being inherited. 
		 * • A class that inherits from a parent class is
		 * called a subclass.
		 * • The purpose of inheritance is so that we don't need to re-write properties and methods that we want in our child class. We can just use the inherited properties and methods from the parent. 
		 * 
		 * 
		 * !!! IMPORTANT !!!
		 * -----------------
		 * • Inheritance is a concept of IS-A-RELATIONSHIP
		 * • Method overriding is associated with inheritance.
		 */
		
		// NOTICE HOW WE ARE USING THE WORD EXTENDS ON LiNE 3
		
		// Student Class can have it's own instance variables and methods which are not accessible by the Parent.
		int stud_id;
		double subject1, subject2, subject3;
		String major;
		
		// The three things we are taking from the parent class (Person) are name, age, gender.
		// Notice that we don't have instance variables for those three inside this class. We are getting it from the parent.
		Student(int id, String name, int age, char gender, double s1, double s2, double s3) {
			
			// We need to call the super() method in able to tell our child class that we want to inherit those properties from our parent.
			// super() calls the constructor class from our parent class. We need to pass on the parameters we need or else it's going to call on an empty constructor.
			// By using super(), compiler class automatically knows we are referring to the parent class. This is defined on our line 3 where we are extending our Student class with the parent class Person.
			// You need to call as many parameters as you need that matches with the parent
			// You can avoid this if you have many parametized constructors in the parent to accept the amount of parameters you want to pass
			super(name, age, gender);
			
			this.stud_id = id;
			this.subject1 = s1;
			this.subject2 = s2;
			this.subject3 = s3;
		}
		
		public void Hello() {
			System.out.println("Good Morning from child class!");
		}
		
		public void display() {
			
			System.out.println("Id: " + this.stud_id);
			super.display();
			System.out.println("Subject 1 score: " + this.subject1);
			System.out.println("Subject 2 score: " + this.subject2);
			System.out.println("Subject 3 score: " + this.subject3);
			
			System.out.println();
			System.out.println();
			
			// This will call our calculate method in this class
			System.out.println(this.calculate(3));
			System.out.println();
			
			// This will call our calculate method in parent class
			System.out.println(super.calculate(3));
			System.out.println();
			
			// This will call our calculate method in this class
			System.out.println(calculate(3));
			
			// Compiler will check for overloading during compile time
			// Overloading - more than one method has the same name but different signatures
			// Method Overriding is runtime binding
		}
		
		public double calculate(int totalSubjects) {
			System.out.println("Inside child (Student) class");
			double average = ((this.subject1 + this.subject2 + this.subject3)/totalSubjects);
			return average;
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}//end main

}//class Student
