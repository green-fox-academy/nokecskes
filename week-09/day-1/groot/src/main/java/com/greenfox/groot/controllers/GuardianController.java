package com.greenfox.groot.controllers;

import com.greenfox.groot.models.ErrorMessage;
import com.greenfox.groot.models.Groot;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Connor on 2017.05.15..
 */
@RestController
public class GuardianController {

  @ExceptionHandler(MissingServletRequestParameterException.class)
  public ErrorMessage noParameterHandler() {
    ErrorMessage parameterError = new ErrorMessage("I am Groot!");
    return parameterError;
  }

  @GetMapping("/groot")
  public Groot translate(@RequestParam String message) {
    Groot groot = new Groot(message);
    return groot;
  }

}
