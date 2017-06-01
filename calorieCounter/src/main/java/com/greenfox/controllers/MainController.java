package com.greenfox.controllers;

import com.greenfox.models.Meal;
import com.greenfox.repositories.MealRepository;
import com.greenfox.repositories.MealTypeRepository;
import com.greenfox.service.MealService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
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

  @Autowired
  MealService mealService;

  @GetMapping("/")
  public ModelAndView getIndexPage() {
    modelAndView.addObject("meals", mealRepository.findAll());
    int sumOfCalories = mealService.sumCalories(mealRepository.findAll());
    modelAndView.addObject("sumOfCalories", sumOfCalories);
    modelAndView.setViewName("index");
    return modelAndView;
  }

  @PostMapping("/")
  public ModelAndView setCalorieTable(Meal meal) {
    mealService.saveMeal(meal);
    modelAndView.addObject("meals", mealRepository.findAll());
    modelAndView.setViewName("index");
    return modelAndView;
  }

  @GetMapping("/add")
  public ModelAndView addNewMeal() {
    modelAndView.addObject("meal", new Meal());
    modelAndView.addObject("mealtypes", mealTypeRepository.findAll());
    modelAndView.setViewName("changeMealTable");
    return modelAndView;
  }

  @GetMapping("/delete/{id}")
  public String deleteMeal(@PathVariable long id) {
    mealService.deleteMeal(id);
    return "redirect:/";
  }

  @GetMapping("/edit/{id}")
  public ModelAndView editMeal(@PathVariable long id) {
    Meal meal = mealRepository.findById(id);
    modelAndView.addObject("meal", meal);
    modelAndView.addObject("mealtypes", mealTypeRepository.findAll());
    modelAndView.setViewName("changeMealTable");
    return modelAndView;
  }
}
