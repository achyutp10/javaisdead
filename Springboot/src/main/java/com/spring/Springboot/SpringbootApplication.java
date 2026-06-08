package com.spring.Springboot;

import com.spring.Springboot.model.Alien;
import com.spring.Springboot.model.Laptop;
import com.spring.Springboot.service.LaptopService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringbootApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringbootApplication.class, args);

		LaptopService service = context.getBean(LaptopService.class);
		Laptop lap = context.getBean(Laptop.class);
		service.addLaptop(lap);

//		Alien obj = context.getBean(Alien.class);
//		obj.code();
//		System.out.println(obj.getAge());
//
//		Alien obj1 = context.getBean(Alien.class);
//		obj1.code();

//		Laptop obj1 = context.getBean(Laptop.class);
//		obj1.compile();
	}

}
