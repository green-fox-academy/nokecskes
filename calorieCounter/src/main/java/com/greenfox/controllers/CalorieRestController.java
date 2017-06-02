package com.greenfox.controllers;

import com.greenfox.models.Meal;
import com.greenfox.repositories.MealRepository;
import com.greenfox.service.MealService;
import java.util.HashMap;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by K on 2017.06.01..
 */
@RestController
public class CalorieRestController {

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

  @PutMapping("/meal")
  public ResponseEntity editMealJson(@Valid @RequestBody Meal meal, BindingResult bindingResult) {
    return mealService.saveMealJson(meal, bindingResult);
  }

  @DeleteMapping("/meal")
  public ResponseEntity deleteMealJson(@RequestBody Meal meal) {
    return mealService.deleteMealJson(meal.getId());
  }

}
