package com.Project.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("controller")
@SpringBootApplication
public class HospApplication {

	public static void main(String[] args) {
		SpringApplication.run(HospApplication.class, args);
	}

}
