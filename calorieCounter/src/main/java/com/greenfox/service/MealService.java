package com.greenfox.service;

import com.greenfox.models.Meal;
import com.greenfox.models.Status;
import com.greenfox.repositories.MealRepository;
import com.greenfox.repositories.MealTypeRepository;
import java.util.HashMap;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by K on 2017.06.01..
 */
@Service
public class MealService {

  @Autowired
  MealRepository mealRepository;

  @Autowired
  MealTypeRepository mealTypeRepository;

  @Autowired
  ModelAndView modelAndView;

  public ModelAndView setUpIndexPage() {
    modelAndView.addObject("meals", mealRepository.findAll());
    modelAndView.addObject("sumOfCalories", sumCalories());
    modelAndView.setViewName("index");
    return modelAndView;
  }

  public ModelAndView addNewMeal() {
    return setUpChangeMealTablePage(new Meal());
  }

  public ModelAndView editMeal(long id) {
    return setUpChangeMealTablePage(mealRepository.findById(id));
  }

  public ModelAndView setUpChangeMealTablePage(Meal meal) {
    modelAndView.addObject("meal", meal);
    modelAndView.addObject("mealtypes", mealTypeRepository.findAll());
    modelAndView.setViewName("changeMealTable");
    return modelAndView;
  }

  public ModelAndView saveMeal(@Valid Meal meal, BindingResult bindingResult) {
    if (!bindingResult.hasErrors()) {
      mealRepository.save(meal);
      return setUpIndexPage();
    }
    return setUpChangeMealTablePage(meal);
  }

  public ResponseEntity saveMealJson(@Valid Meal meal, BindingResult bindingResult) {
    if (!bindingResult.hasErrors()) {
      mealRepository.save(meal);
      return new ResponseEntity(new Status("ok"), HttpStatus.OK);
    }
    return new ResponseEntity(new Status("error"), HttpStatus.BAD_REQUEST);
  }

  public ResponseEntity deleteMealJson(long id) {
    if (mealRepository.findById(id) == null) {
      return new ResponseEntity(new Status("error"), HttpStatus.BAD_REQUEST);
    }
    deleteMeal(id);
    return new ResponseEntity(new Status("ok"), HttpStatus.OK);
  }

  public void deleteMeal(long id) {
    mealRepository.delete(id);
  }

  public HashMap<String, Integer> collectStats() {
    HashMap<String, Integer> statMap = new HashMap<>();
    statMap.put("Number of meals", calculateNumberOfMeals());
    statMap.put("Total calories", sumCalories());
    return statMap;
  }

  public int sumCalories() {
    int sumCalories = 0;
    for (Meal meal : mealRepository.findAll()) {
      sumCalories += meal.getCalories();
    }
    return sumCalories;
  }

  public int calculateNumberOfMeals() {
    return (int) mealRepository.findAll().spliterator().getExactSizeIfKnown();
  }
}
