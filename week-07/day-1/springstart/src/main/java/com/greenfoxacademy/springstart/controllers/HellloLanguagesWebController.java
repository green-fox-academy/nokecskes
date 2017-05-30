package com.greenfoxacademy.springstart.controllers;

import com.greenfoxacademy.springstart.models.Hello;
import com.greenfoxacademy.springstart.services.HelloService;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Connor on 2017.05.02..
 */
@Controller
public class HellloLanguagesWebController {

  @Autowired
  HelloService helloService;

  @RequestMapping("/web/helloLanguages")
  public ModelAndView greetInDifferentLanguages(ModelAndView modelAndView) {
    modelAndView.addObject("hellos", helloService.createHelloList());
    modelAndView.setViewName("helloLanguages");
    return modelAndView;
  }
}
