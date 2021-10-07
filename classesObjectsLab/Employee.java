/**********************************************************************************************
 * Tasks:
 * 1. Make an Employee class. Make it a child class of Person.
 * 2. Inside Employee class. Make extra methods and properties that relate to what an employee would have.
 * 3. Create a constructor similar to Student class. Don’t forget to call your super() powers :wink:
 * 4. For example, employee should have a salary and an employee ID. Maybe have a method that creates an address (Aheem HINT)
 * 5. Display method anyone? Maybe calculate method (overriding)? 
 * 	  Inside calculate method add maybe some bonuses, be generous to your employee
 *
 * **********************************************************************************************
 * 	Implementing class Interface: 
 *	
 * public interface PersonInterface {
	
	DOC: https://docs.oracle.com/javase/tutorial/java/concepts/interface.html
	
	===== HOW TO CREATE INTERFACE =====
	1.) Right click on package -> New Interface -> Give Name and Finish
	
	Any variables you instantiate here is static because you cannot create objects in interface
	static final String ORGANIZATION = "Per Scholas";
	
	Any class IMPLEMENTING THIS INTERFACE will need to follow the structure
	All methods are defaulted to public
	double calculate(int num);
	}
 *
 ************************************************************************************************/


package classesObjectsLab;


public class Employee extends Person{
	int empID;
	double empSalary;
	double empBonus;
	Address empAddress;


	Employee(String name, int age, char gender,double empBonus,  double empSalary, int empID){
	super(name, age, gender);
	this.empID = empID;
	this.empSalary = empSalary;
	this.empBonus = empBonus; 
	}//end Employee
	
	
	public Employee() {
		
	}


	void createAddress() {
		empAddress = new Address(); 
		empAddress.street = "123 easy street";
		empAddress.city = "New York";
		empAddress.state = "NY";
		empAddress.zipcode = 11226;	
		
	}
	
	
	public double calculate() {
		double newSal = empSalary + empBonus; 
		return newSal; 
		
	}
	
	public void display() {
		this.createAddress();
		System.out.println(empAddress.street);
		System.out.println(empAddress.city);
		System.out.println(empAddress.state);
		System.out.println(empAddress.zipcode);
	}
	
	
	
	//Employee(String name, int age, char gender,double empBonus,  double empSalary, int empID)
	
	


	public static void main(String[] args) {
		Employee e1 = new Employee("Vanessa",99,'f',200.00,50000.00, 001 );
				
		e1.display();
//		e1.empSalary = 1000000.00;
//		e1.empBonus = 100.00;
		System.out.println(e1.calculate());
		

	}//end main

}//end Employee

/*********************************************************************************************************
	public class Employee extends Person implements PersonInterface {
		
		int emp_id;
		double emp_salary;
		// Notice the object reference from Address class
		// In here we are declaring addr variable
		// In here we create an instance variable so we can use it in any method in this class.
		// If we were to put it inside our createAddress() method it will only be accessible to that method.
		// This will ensure that we are not writing Address addr = new Address(); inside many methods.
		// You can check this out, if you delete our Address addr in top level, and add it inside createAddress().
		// We will get an error in display() because we can no longer access our object reference addr.street...etc.
		Address addr;
		
		Employee(int id, String name, int age, char gender, double salary) {
			
			super(name, age, gender);
			// This cannot link to the operator so we would need to use object reference like instantiating Address
			this.emp_id = id;
			this.emp_salary = salary;
			
		}
		
		public void createAddress() {
			
			// Take user input for this Employee's address fields
			addr = new Address();
			
			// Currently hard coding
			addr.street = "101 South St.";
			addr.city = "Queen City";
			addr.state = "OH";
			addr.zipcode = 78686;
			
		}
		
		public void display() {
			
			System.out.println(ORGANIZATION);
			System.out.println("-----------");
			System.out.println("Id: " + this.emp_id);
			super.display();
			// we are associating our Employee with the Address method
			// We do this by using our object reference addr
			// Since we are displaying together, they are associating with each other
			// ===== WHY DO WE HAVE ADDRESS CLASS =====
			// • Reusability so any people can have their own address :) 
			System.out.println(addr.street);
			System.out.println(addr.city);
			System.out.println(addr.state);
			System.out.println(addr.zipcode);
			System.out.println("Salary: " + this.emp_salary);
			System.out.println();
			
		}
		
		public double calculate(int bonus) {
			
			double netsalary = bonus + this.emp_salary;
			return netsalary;
			
		}
	}
	
	*************************************************************************************/
