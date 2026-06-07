package com.spring.Springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringbootApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringbootApplication.class, args);

//		Alien obj = context.getBean(Alien.class);
//		obj.code();
//
//		Alien obj1 = context.getBean(Alien.class);
//		obj1.code();

		Laptop obj1 = context.getBean(Laptop.class);
		obj1.compile();
	}

}
