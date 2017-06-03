package com.greenfox.groot.controllers;

import com.greenfox.groot.models.Arrow;
import com.greenfox.groot.models.Food;
import com.greenfox.groot.models.Ship;
import com.greenfox.groot.models.ErrorMessage;
import com.greenfox.groot.models.Groot;
import com.greenfox.groot.service.CalorieService;
import com.greenfox.groot.service.ShipService;
import com.greenfox.groot.models.ShipStatus;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Connor on 2017.05.15..
 */
@RestController
public class GuardianController {

  @Autowired
  ShipService shipService;
  
  @Autowired
  CalorieService calorieService;

  @ExceptionHandler(MissingServletRequestParameterException.class)
  public ErrorMessage noParameterHandler() {
    ErrorMessage parameterError = new ErrorMessage("I am Groot!");
    return parameterError;
  }

  @GetMapping("/groot")
  public Groot translate(@RequestParam String message) {
    return new Groot(message);
  }

  @GetMapping("/yondu")
  public Arrow calculateSpeed(@RequestParam(value = "distance", required = true) double distance,
      @RequestParam(value = "time", required = true) double time) {
    return new Arrow(distance, time);
  }

  @GetMapping("/rocket")
  public Ship getShipStatus() {
    return shipService.getShip();
  }


  @GetMapping("/rocket/fill")
  public ShipStatus fillShip(@RequestParam(value = "caliber") String caliber,
      @RequestParam(value = "amount") double amount) {
    return shipService.setShipstatus(caliber, amount);
  }

  @GetMapping("/drax")
  public ArrayList<Food> getDraxCalorieTable() {
    return calorieService.getCalorieTable();
  }
  
  @PostMapping("/drax/add")
  public ArrayList<Food> addToDraxCalorieTable(@RequestBody Food food) {
    return calorieService.addToCalorieTable(food);
  }
  
  @DeleteMapping("/drax/delete")
  public ArrayList<Food> deleteFromDraxCalorieTable(@RequestParam String foodToDelete) {
    return calorieService.deleteFromCalorieTable(foodToDelete);
  }

  @PutMapping("/drax/changeAmount")
  public ArrayList<Food> changeAmountOfFood(@RequestBody Food foodToUpdate) {
    return calorieService.updateCalorieTable(foodToUpdate);
  }
}

  

