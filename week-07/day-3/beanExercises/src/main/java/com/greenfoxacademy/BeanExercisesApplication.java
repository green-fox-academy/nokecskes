package com.greenfoxacademy;

import com.greenfoxacademy.models.BlueColor;
import com.greenfoxacademy.models.MyColor;
import com.greenfoxacademy.config.MyColorConfig;
import com.greenfoxacademy.models.RedColor;
import com.greenfoxacademy.models.YellowColor;
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

    ApplicationContext color = new AnnotationConfigApplicationContext(MyColorConfig.class);
    MyColor blue = color.getBean(BlueColor.class);
    blue.printColor();
    MyColor red = color.getBean(RedColor.class);
    red.printColor();
    MyColor yellow = color.getBean(YellowColor.class);
    yellow.printColor();

  }
}
