
package com.annotations.Autowired.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.annotations.Autowired.service.VegPizza;

//Marks this class as a Spring component
@Component
public class PizzaController {

	
    // Field Injection: The `VegPizza` bean is automatically injected here {Directly Injected to field}
	@Autowired
	private VegPizza veggy;  //Here veggy is the reference name for VegPizza class
	
	
	// Creating a constructor Injection using reference name
	//	@Autowired
	//	public PizzaController(VegPizza veggy) {
	//		this.veggy=veggy;
	//	}

	
	//	 Setter Injection using set() method
	//	@Autowired
	//		public void setVeggy(VegPizza veggy) {
	//			this.veggy = veggy;
	//		}
	//	
	
	
    // Method that uses the injected `VegPizza` bean to order a pizza
	public String OrderPizza() {
		return veggy.OrderPizza();
	}
	
	
    // Method that uses the injected `VegPizza` bean to deliver a pizza
	public String DeliveredPizza() {
		return veggy.DeliverPIzza();
	}
	
	
}
