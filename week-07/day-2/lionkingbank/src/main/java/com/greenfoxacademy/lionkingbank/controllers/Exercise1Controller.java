package com.greenfoxacademy.lionkingbank.controllers;

import com.greenfoxacademy.lionkingbank.models.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Connor on 2017.05.03..
 */
@Controller
public class Exercise1Controller {

  @RequestMapping("/web/Exercise1")
  public String addAccount(Model model) {
    BankAccount simbaAccount = new BankAccount("Simba", 2000, "lion");
    model.addAttribute("account", simbaAccount);
    return "bankAccount";
  }


}
