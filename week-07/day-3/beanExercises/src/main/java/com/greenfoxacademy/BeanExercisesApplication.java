package com.greenfoxacademy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class BeanExercisesApplication {

	public static void main(String[] args) {
		SpringApplication.run(BeanExercisesApplication.class, args);

		ApplicationContext hello = new AnnotationConfigApplicationContext(HelloWorldConfig.class);
		HelloWorld helloWorld = hello.getBean(HelloWorld.class);

		helloWorld.getMessage();
		helloWorld.setMessage("Hello, world!");
		helloWorld.getMessage();
	}
}
