package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class ArundhasApplication  {

	public static void main(String[] args) {
		SpringApplication.run(ArundhasApplication.class, args);
		
//		Airtel airtel = new Airtel();
//		airtel.calling();
//		airtel.data();
		
//		Jio jio = new Jio();
//		jio.calling();
//		jio.data();
	
//	  Sim sim = new Jio();
//	  sim.calling();
//	  sim.data();
	
		 ApplicationContext context = new ClassPathXmlApplicationContext("arun.xml");
		 
		 System.out.println("Arundhas");
		 
		// Airtel air =(Airtel) context.getBean("airtel"); //Typecast is happening
		// Airtel airr = context.getBean("airtel",Airtel.class);    //this line and previous lines are used to solve the typecasting issues
		//   airr.calling();
		//   airr.data();     // also we can create jio class object
		 
		Sim sim = context.getBean("sim",Sim.class);
		
		sim.calling();
		sim.data();

				 
	}

}
