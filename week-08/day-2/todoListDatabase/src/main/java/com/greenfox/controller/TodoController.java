package com.greenfox.controller;

import com.greenfox.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Connor on 2017.05.09..
 */
@Controller
@RequestMapping("/todo")
public class TodoController {

  @Autowired
  TodoRepository todoRepository;

  @RequestMapping(value = {"/", "/list"})
  public String list(Model model) {
    model.addAttribute("todos", todoRepository.findAll());
    return "todo";
  }
}


