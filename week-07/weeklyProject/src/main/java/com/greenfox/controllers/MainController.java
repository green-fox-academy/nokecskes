package com.greenfox.controllers;

import com.greenfox.models.Hippo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Connor on 2017.05.04..
 */
@Controller
public class MainController {

  @Autowired
  Hippo fiona;
  @Autowired
  ModelAndView m;


  @RequestMapping("/")
  public ModelAndView index() {
    m.setViewName("index");
    m.addObject("animal", fiona);
    return m;
  }

  @RequestMapping("/nutritionStore")
  public ModelAndView nutritionStore() {
    m.setViewName("nutritionStore");
    return m;
  }

  @RequestMapping("/trickCenter")
  public ModelAndView trickCenter() {
    m.addObject("animal", fiona);
    m.setViewName("trickCenter");
    return m;
  }

  @RequestMapping("/learnNewTrick")
  public String learnNewTrick(@RequestParam int index) {
    fiona.learnTrick(index);
    return "redirect:/";
  }


}
