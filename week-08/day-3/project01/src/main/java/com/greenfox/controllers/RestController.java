package com.greenfox.controllers;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.greenfox.models.Append;
import com.greenfox.models.Calculate;
import com.greenfox.models.Doubling;
import com.greenfox.models.Greeting;
import com.greenfox.models.NumberToCalculate;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Connor on 2017.05.10..
 */
@org.springframework.web.bind.annotation.RestController
public class RestController {

  @ExceptionHandler(MissingServletRequestParameterException.class)
  public String noParameterHandler(MissingServletRequestParameterException e) {
    return String.format("Please provide %s!", e.getParameterName());
  }

  @ExceptionHandler(HttpMessageNotReadableException.class)
  public String noRequestBodyHandler (HttpMessageNotReadableException e) {
    return String.format("Please provide %s!", e.getMessage());
  }

  @RequestMapping(value = "/doubling", method = RequestMethod.GET)
  public Doubling getDouble(@RequestParam(value = "input", required = true) int input) {
    Doubling doubling = new Doubling(input);
    return doubling;
  }

  @RequestMapping(value = "/greeter", method = RequestMethod.GET)
  public Greeting greetUser(@RequestParam(value = "name", required = true) String name,
          @RequestParam(value = "title", required = true) String title) {
    return new Greeting(name, title);
  }

  @RequestMapping(value = "/appenda/{appendable}", method = RequestMethod.GET)
  public Append append(@PathVariable String appendable) {
    return new Append(appendable);
  }

  @RequestMapping(value = "/dountil/{what}", method = RequestMethod.POST)
  public Calculate calculateSumOrFactor(@PathVariable String what, @RequestBody NumberToCalculate numberToCalculate) {
    Calculate calculate = new Calculate(numberToCalculate.getUntil(), what);
    return calculate;
  }
}
