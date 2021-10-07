




package classesObjectsLab;

public class Person {
	
	String pname;
	int page;
	char pgender;
	
	public Person() {
	}
	
	public Person(String pname, int page, char pgender) {
		this.pname = pname;
		this.page = page;
		this.pgender = pgender;
	}
	
	public void Hello() {
		System.out.println("Hello there from Parent class!!!");
	}

	void display() {
		System.out.println("Name: " + this.pname);
		System.out.println("Gender: " + this.pgender);
		System.out.println("Age: " + this.page);
	}
	
	public void display(Person obj) {
		System.out.println("Within parameterized display...");
		System.out.println("Name: " + obj.pname);
	}
	
	double calculate(int num) {
		System.out.println("Calculate inside parent (Person) class");
		return 121.33;
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}//end main

}//end Person
