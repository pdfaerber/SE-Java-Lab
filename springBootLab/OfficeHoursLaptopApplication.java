package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class OfficeHoursLaptopApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext Context = SpringApplication.run(OfficeHoursLaptopApplication.class, args);
		
		Person p1 = Context.getBean(Person.class);
		Laptop l1 = Context.getBean(Laptop.class);
		
		Person p2 = Context.getBean(Person.class);
		Laptop l2 = Context.getBean(Laptop.class);
//		public void setLaptop(Laptop laptop) {
//			this.laptop = laptop;
//		}

		p1.setLaptop(l1);
		l1.setMake("Apple");
		
		//System.out.println(p1.getLaptop());
		l1.printLapName(l1.getMake());
		
		p2.setLaptop(l2);
		l2.setMake("IBM");
		
		//System.out.println(p2.getLaptop());
		l2.printLapName(l2.getMake());
	}

}
