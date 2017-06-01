package com.greenfox.controllers;

import com.greenfox.models.Meal;
import com.greenfox.repositories.MealRepository;
import com.greenfox.repositories.MealTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by K on 2017.06.01..
 */
@Controller
public class MainController {

  @Autowired
  ModelAndView modelAndView;

  @Autowired
  MealRepository mealRepository;

  @Autowired
  MealTypeRepository mealTypeRepository;

  @GetMapping("/")
  public ModelAndView getIndexPage() {
    modelAndView.setViewName("index");
    return modelAndView;
  }

  @GetMapping("/add")
  public ModelAndView addNewMeal() {
    modelAndView.addObject("meal", new Meal());
    modelAndView.addObject("mealtypes", new Meal());
    modelAndView.setViewName("changeMealTable");
    return modelAndView;
  }



}
