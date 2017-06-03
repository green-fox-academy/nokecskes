package com.greenfox.groot.service;

import com.greenfox.groot.models.Food;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by K on 2017.06.03..
 */
@Service
public class CalorieService {

  @Autowired
  ArrayList<Food> calorieTable;

  public ArrayList<Food> getCalorieTable() {
    return calorieTable;
  }

  public ArrayList<Food> addToCalorieTable(Food food) {
    calorieTable.add(food);
    return getCalorieTable();
  }

  public ArrayList<Food> deleteFromCalorieTable(String foodToDelete) {
    for (Food food : calorieTable) {
      if (food.getName().equals(foodToDelete)) {
        calorieTable.remove(food);
      }
    }
    return getCalorieTable();
  }

  public ArrayList<Food> updateCalorieTable(Food foodToUpdate) {
    for (Food food : calorieTable) {
      if (food.getName().equals(foodToUpdate.getName())) {
        food.setAmount(foodToUpdate.getAmount());
        food.setCalorie(foodToUpdate.getCalorie());
      }
    }
    return getCalorieTable();
  }



}
