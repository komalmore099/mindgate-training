package com.mindgate.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mindgate.pojo.Product;

public class ProductMain {

	public static void main(String[] args) 
	{
		System.out.println("main start");
		
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring.xml");
		//default constructor called because spring  read xml file and created objects already
		System.out.println("Application context is created");//factory created
		
		Product product=applicationContext.getBean("product",Product.class);
		System.out.println("product object created");
		System.out.println(product);
		System.out.println(product.hashCode());
		
		System.out.println("-".repeat(50));
		
		Product product2=applicationContext.getBean("product",Product.class);
		System.out.println("product2 object created");
		System.out.println(product2);
		System.out.println(product2.hashCode());
		
		//spring share same object because  the has same hash code
		System.out.println("main end");
		
		
	}

}
