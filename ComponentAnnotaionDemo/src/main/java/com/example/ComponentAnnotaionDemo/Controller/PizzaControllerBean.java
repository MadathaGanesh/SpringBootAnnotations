package com.example.ComponentAnnotaionDemo.Controller;

import org.springframework.stereotype.Component;

@Component("BeanName")
public class PizzaControllerBean {

	
	public String OrderPizzaBean() {
		return "Ordering pizza using Bean Name";
	}
	
	public String DeliverPizzaBean() {
		return "Delivering pizza using Bean Name";
	}
	
	
	public int CheckInteger() {
		return 1210;
	}
	
	public double checkDouble() {
		return 1222.3422;
	}
}
