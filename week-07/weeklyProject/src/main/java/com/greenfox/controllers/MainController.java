package com.greenfox.controllers;

import com.greenfox.models.Hippo;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
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
    fiona.getTrickList().get(3).setLearned(true);
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
    m.setViewName("trickCenter");
    return m;
  }


}
