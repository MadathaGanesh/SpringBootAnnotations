package com.annotations.Autowired.service;

import org.springframework.stereotype.Component;


// Marks this class as a Spring component, making it a bean managed by Spring's IoC container
@Component
public class VegPizza {
	
    // Method to simulate ordering a Veg Pizza
	public String OrderPizza() {
		return "You Ordered Veg Pizza ! dude";
	}
	
    // Method to simulate Delivering a Veg Pizza
	public String DeliverPIzza() {
		return "Your Veg Pizza is Delivered!";
	}

}
