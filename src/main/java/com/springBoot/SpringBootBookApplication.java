package com.springBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootBookApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootBookApplication.class, args);
		
		
		System.out.println("hello book change in first time");
		System.out.println("SpringBoot Starting");
	}

}
