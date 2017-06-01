package com.greenfox.controllers;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by K on 2017.06.01..
 */
@Configuration
public class CalorieFactory {

  @Bean
  public ModelAndView getModelAndView() {
    return new ModelAndView();
  }

}
