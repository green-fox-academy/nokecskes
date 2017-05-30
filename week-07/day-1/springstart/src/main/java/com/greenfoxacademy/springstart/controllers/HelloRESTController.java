package com.greenfoxacademy.springstart.controllers;

import com.greenfoxacademy.springstart.models.Greeting;
import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Connor on 2017.05.02..
 */
@RestController
public class HelloRESTController {

  AtomicLong apiCalls = new AtomicLong();

  @RequestMapping(value = "/greeting")
  public Greeting greeting(@RequestParam("name") String name) {
    Greeting greeting = new Greeting(apiCalls.incrementAndGet(), "Hello " + name + "!");
    return greeting;
  }

}
