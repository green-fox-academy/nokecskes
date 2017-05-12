package com.greenfox.controller;

import com.greenfox.model.Todo;
import com.greenfox.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Connor on 2017.05.09..
 */
@Controller
@RequestMapping("/todo")
public class TodoController {

  @Autowired
  TodoRepository todoRepository;

  @Autowired
  ModelAndView m;

  @RequestMapping(value = {"/", "/list"}, method = RequestMethod.GET)
  public ModelAndView list(@RequestParam(value = "isActive", required = false) String isActive) {
    if (isActive == null) {
      m.addObject("todos", todoRepository.findAll());
    } else if (isActive.equals("true")) {
      m.addObject("todos", todoRepository.findByIsDoneEquals(false));
    } else if (isActive.equals("false")) {
      m.addObject("todos", todoRepository.findByIsDoneEquals(true));
    }
    m.setViewName("todo");
    return m;
  }

  @RequestMapping(value = "/add")
  public ModelAndView add() {
    m.addObject("todo", new Todo());
    m.setViewName("add");
    return m;
  }

  @RequestMapping(value = "/adding", method = RequestMethod.POST)
  public String adding(Todo todo) {
    todoRepository.save(todo);
    return "redirect:/todo/";
  }

}


