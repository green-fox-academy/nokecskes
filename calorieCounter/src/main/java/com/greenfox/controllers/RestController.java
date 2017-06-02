package com.greenfox.controllers;

import com.greenfox.models.Meal;
import com.greenfox.repositories.MealRepository;
import com.greenfox.service.MealService;
import java.util.HashMap;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * Created by K on 2017.06.01..
 */
@org.springframework.web.bind.annotation.RestController
public class RestController {

  @Autowired
  MealRepository mealRepository;

  @Autowired
  MealService mealService;

  @GetMapping("/getmeals")
  public Iterable<Meal> getMeals() {
    return mealRepository.findAll();
  }

  @GetMapping("/getstats")
  public HashMap<String, Integer> getStats() {
    return mealService.collectStats();
  }

  @PostMapping("/meal")
  public ResponseEntity addNewMealJson(@Valid @RequestBody Meal meal, BindingResult bindingResult) {
    return mealService.saveMealJson(meal, bindingResult);
  }

}
