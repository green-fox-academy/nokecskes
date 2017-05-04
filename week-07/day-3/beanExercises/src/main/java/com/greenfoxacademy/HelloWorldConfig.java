package com.greenfoxacademy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * Created by Connor on 2017.05.04..
 */

@Configuration
public class HelloWorldConfig {

  @Bean
  public HelloWorld helloWorld () {
    return new HelloWorld();
  }

}
