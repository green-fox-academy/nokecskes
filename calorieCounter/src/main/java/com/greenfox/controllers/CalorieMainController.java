package com.greenfox.controllers;

import com.greenfox.models.Meal;
import com.greenfox.service.MealService;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by K on 2017.06.01..
 */
@Controller
public class CalorieMainController {

  @Autowired
  MealService mealService;

  @GetMapping("/")
  public ModelAndView getIndexPage() {
    return mealService.setUpIndexPage();
  }

  @PostMapping("/")
  public ModelAndView setCalorieTable(@Valid Meal meal, BindingResult bindingResult) {
    return mealService.saveMeal(meal, bindingResult);
  }

  @GetMapping("/add")
  public ModelAndView addNewMeal() {
    return mealService.addNewMeal();
  }

  @GetMapping("/delete/{id}")
  public String deleteMeal(@PathVariable long id) {
    mealService.deleteMeal(id);
    return "redirect:/";
  }

  @GetMapping("/edit/{id}")
  public ModelAndView editMeal(@PathVariable long id) {
    return mealService.editMeal(id);
  }
}
