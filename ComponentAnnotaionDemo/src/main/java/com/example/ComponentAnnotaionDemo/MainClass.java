package com.example.ComponentAnnotaionDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.ComponentAnnotaionDemo.Controller.PizzaControllerBean;
import com.example.ComponentAnnotaionDemo.Controller.PizzaControllerComponent;

@SpringBootApplication
//Marks this class as the main entry point of the Spring Boot application
public class MainClass {

	public static void main(String[] args) {
		
        // Starts the application and returns the application context
		var context= SpringApplication.run(MainClass.class, args);
		
        // Retrieves the bean of type PizzzaController from the application context
		PizzaControllerComponent ComponentName =context.getBean(PizzaControllerComponent.class);
		
        // Calls methods on the PizzzaController bean and prints the results
		 System.out.println(ComponentName.getOrder());
		 System.out.println(ComponentName.getDeliver());
		 
		 
		 // Retrieves the bean of type BeanDemo with the name "BeanName" from the application context
		 //Here we are doing typecasting =>  (PizzaControllerBean)context.getBean("BeanName")
		 PizzaControllerBean BeanObj=(PizzaControllerBean)context.getBean("BeanName");
	       
		 // Calls methods on the PizzzaController bean and prints the results
		 System.out.println(BeanObj.OrderPizzaBean());
		 System.out.println(BeanObj.DeliverPizzaBean());
		 System.out.println("Integer Number is: "+BeanObj.CheckInteger());
		 System.out.println("Double Number is: "+BeanObj.checkDouble());
	}

}
