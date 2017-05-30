package com.greenfoxacademy.lionkingbank.controllers;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by K on 2017.05.30..
 */
@Configuration
public class BankFactory {

  @Bean
  public ModelAndView getModelAndView() {
    return new ModelAndView();
  }
}
