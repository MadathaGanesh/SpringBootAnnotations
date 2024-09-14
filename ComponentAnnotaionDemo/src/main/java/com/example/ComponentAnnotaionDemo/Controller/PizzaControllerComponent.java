package com.example.ComponentAnnotaionDemo.Controller;

import org.springframework.stereotype.Component;



@Component
//Marks this class as a Spring bean with the default name "pizzzaController".
//when we didn't give any bean name means then Spring will assign a default bean and using that name only we can access methods
public class PizzaControllerComponent {

	
	// getOrder() method
	public String getOrder() {
		return "You can order Pizza Now! from @Component Annotation";
	}
	
	// getDeliver() method
	public String getDeliver() {
	return "Your pizza is ready to deliver! from @Component Annotation";	
	}
	
}
