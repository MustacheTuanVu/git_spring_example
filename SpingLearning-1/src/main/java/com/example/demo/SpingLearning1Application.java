package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpingLearning1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpingLearning1Application.class, args);
		
		
		//4. Spring, Autowire, Dependency Injection
		Alien alienNumber1 = context.getBean(Alien.class);
		alienNumber1.show();
		
		Alien alienNumber2 = context.getBean(Alien.class);
		alienNumber2.show();
		
		
	}

}
