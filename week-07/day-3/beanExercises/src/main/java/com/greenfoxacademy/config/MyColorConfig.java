package com.greenfoxacademy.config;

import com.greenfoxacademy.models.BlueColor;
import com.greenfoxacademy.models.RedColor;
import com.greenfoxacademy.models.YellowColor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Connor on 2017.05.04..
 */
@Configuration
public class MyColorConfig {

  @Bean
  public BlueColor getBlueColor() {
    return new BlueColor();
  }

  @Bean
  public YellowColor getYellowColor() {
    return new YellowColor();
  }

  @Bean
  public RedColor getRedColor() {
    return new RedColor();
  }


}
