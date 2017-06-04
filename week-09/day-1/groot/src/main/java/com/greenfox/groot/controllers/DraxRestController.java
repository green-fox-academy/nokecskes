package com.greenfox.groot.controllers;

import com.greenfox.groot.models.Food;
import com.greenfox.groot.service.CalorieService;
import com.greenfox.groot.service.ErrorMessageService;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by K on 2017.06.04..
 */
@RestController
@RequestMapping("/drax")
public class DraxRestController {

  @Autowired
  CalorieService calorieService;

  @Autowired
  ErrorMessageService errorMessageService;

  @ExceptionHandler(MissingServletRequestParameterException.class)
  public ResponseEntity noParameterHandler() {
    return new ResponseEntity<>(errorMessageService.setErrorMessage("I am Groot!"), HttpStatus.BAD_REQUEST);
  }

  @GetMapping("/")
  public ArrayList<Food> getDraxCalorieTable() {
    return calorieService.getCalorieTable();
  }

  @PostMapping("/add")
  public ArrayList<Food> addToDraxCalorieTable(@RequestBody Food food) {
    return calorieService.addToCalorieTable(food);
  }

  @DeleteMapping("/delete")
  public ArrayList<Food> deleteFromDraxCalorieTable(@RequestParam("foodToDelete") String foodToDelete) {
    return calorieService.deleteFromCalorieTable(foodToDelete);
  }

  @PutMapping("/changeAmount")
  public ArrayList<Food> changeAmountOfFood(@RequestBody Food foodToUpdate) {
    return calorieService.updateCalorieTable(foodToUpdate);
  }

}
