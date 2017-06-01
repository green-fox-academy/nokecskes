package com.greenfox.service;

import com.greenfox.models.Meal;
import com.greenfox.models.MealType;
import com.greenfox.repositories.MealRepository;
import com.greenfox.repositories.MealTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by K on 2017.06.01..
 */
@Service
public class MealService {

  @Autowired
  MealRepository mealRepository;

  @Autowired
  MealTypeRepository mealTypeRepository;

  public void saveMeal(Meal meal){
    mealRepository.save(meal);
  }

  public void deleteMeal(long id) {
    mealRepository.delete(id);
  }

  public int sumCalories(Iterable<Meal> meals) {
    int sumCalories = 0;
    for (Meal meal : meals) {
      sumCalories += meal.getCalories();
    }
    return sumCalories;
  }


}
