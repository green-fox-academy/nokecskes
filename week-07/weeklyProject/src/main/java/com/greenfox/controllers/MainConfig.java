package com.greenfox.controllers;

import com.greenfox.models.Hippo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Connor on 2017.05.04..
 */
@Configuration
public class MainConfig {

  @Bean
  public Hippo getHippo() {
    return new Hippo();
  }

  @Bean
  public ModelAndView getModelAndView() {
    return new ModelAndView();
  }

}
