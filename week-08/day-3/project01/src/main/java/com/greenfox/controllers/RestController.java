package com.greenfox.controllers;

import com.greenfox.models.Doubling;
import com.greenfox.models.ErrorMessage;
import com.greenfox.models.Greeting;
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
  public ErrorMessage badRequestHandler(MissingServletRequestParameterException e) {
    return new ErrorMessage(e.getParameterName());
  }

  @RequestMapping(value = "/doubling", method = RequestMethod.GET)
  public Doubling getDouble(@RequestParam(value = "input", required = true) int input) {
    Doubling doubling = new Doubling(input);
    return doubling;
  }

  @RequestMapping(value= "/greeter", method = RequestMethod.GET)
  public Greeting greetUser (@RequestParam(value = "name", required = true) String name,
          @RequestParam(value = "title", required = true) String title) {
    return new Greeting(name, title);
  }

}
