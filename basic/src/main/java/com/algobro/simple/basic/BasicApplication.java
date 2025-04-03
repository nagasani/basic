package com.algobro.simple.basic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/*
 🧩 Breakdown of what each does:
@SpringBootConfiguration
	A specialization of @Configuration.
	Indicates that the class can be used by Spring's IoC container as a source of bean definitions.

@EnableAutoConfiguration
	Enables Spring Boot’s auto-configuration mechanism.
	Automatically configures Spring and third-party libraries based on the classpath and defined beans.

@ComponentScan
	Scans for @Component, @Service, @Repository, @Controller, etc., starting from the package of the class where @SpringBootApplication is placed.
	You can customize the base package with scanBasePackages.
 */

@SpringBootApplication
public class BasicApplication {

	public static void main(String[] args) {
		SpringApplication.run(BasicApplication.class, args);
	}

}
