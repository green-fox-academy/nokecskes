package com.greenfox.controllers;

import com.greenfox.models.Doubling;
import com.greenfox.models.ErrorMessage;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Connor on 2017.05.10..
 */
@org.springframework.web.bind.annotation.RestController
public class RestController {

  @ExceptionHandler(MissingServletRequestParameterException.class)
  public ErrorMessage badRequestHandler() {
    return new ErrorMessage("Please provide an input!");
  }

  @RequestMapping(value = "/doubling", method = RequestMethod.GET)
  public Doubling getDouble(@RequestParam(value = "input", required = true) int input) {
    Doubling doubling = new Doubling(input);
    return doubling;
  }

}
