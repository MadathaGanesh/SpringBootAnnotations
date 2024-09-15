
package com.annotations.Autowired;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.annotations.Autowired.Controllers.PizzaController;

@SpringBootApplication
public class Main {

	public static void main(String[] args) {

	// Starts the Spring Boot application and returns the application context
	var context=SpringApplication.run(Main.class, args);
	
	
    // Retrieves the `PizzaController` bean from the application context
     PizzaController pizza=context.getBean(PizzaController.class);
     
     
     // Calls methods on the `PizzaController` bean and prints the output
     System.out.println("Ordering pizza: "+pizza.OrderPizza());
     System.out.println("Delivering pizza: "+pizza.DeliveredPizza());
		
	}

}
