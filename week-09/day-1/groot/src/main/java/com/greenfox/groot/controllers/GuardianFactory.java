package com.greenfox.groot.controllers;

import com.greenfox.groot.models.Food;
import java.util.ArrayList;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by K on 2017.06.03..
 */
@Configuration
public class GuardianFactory {

  @Bean
  public ArrayList<Food> getFoodList() {
    return new ArrayList<>();
  }

}
