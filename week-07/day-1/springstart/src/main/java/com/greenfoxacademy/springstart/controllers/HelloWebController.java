package com.greenfoxacademy.springstart.controllers;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Connor on 2017.05.02..
 */
@Controller
public class HelloWebController {

  AtomicLong apiCalls = new AtomicLong();

  @RequestMapping("/web/greeting")
  public String greeting(Model model, @RequestParam("name") String name) {
    model.addAttribute("name", name);
    model.addAttribute("apiCalls", apiCalls.incrementAndGet());
    return "greeting";
  }

}
