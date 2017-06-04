package com.greenfox.groot.controllers;

import com.greenfox.groot.models.Arrow;
import com.greenfox.groot.models.Ship;
import com.greenfox.groot.models.Groot;
import com.greenfox.groot.service.ErrorMessageService;
import com.greenfox.groot.service.ShipService;
import com.greenfox.groot.models.ShipStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Connor on 2017.05.15..
 */
@RestController
public class GuardianRestController {

  @Autowired
  ShipService shipService;

  @Autowired
  ErrorMessageService errorMessageService;

  @ExceptionHandler(MissingServletRequestParameterException.class)
  public ResponseEntity noParameterHandler() {
    return new ResponseEntity<>(errorMessageService.setErrorMessage("I am Groot!"), HttpStatus.BAD_REQUEST);
  }

  @GetMapping("/groot")
  public Groot translate(@RequestParam("message") String message) {
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
}

  

