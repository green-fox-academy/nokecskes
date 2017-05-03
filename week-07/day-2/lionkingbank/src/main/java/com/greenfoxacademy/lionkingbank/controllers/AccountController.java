package com.greenfoxacademy.lionkingbank.controllers;

import com.greenfoxacademy.lionkingbank.models.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Connor on 2017.05.03..
 */
@Controller
public class AccountController {

  @RequestMapping("/web/Account")
  public String addAccount(Model model) {
    BankAccount simbaAccount = new BankAccount("Simba", 2000, "lion", "Zebra");
    model.addAttribute("account", simbaAccount);
    return "bankAccount";
  }

  @RequestMapping("/web/Enjoy")
  public String enjoyText(Model model) {
    String text = "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>";
    model.addAttribute("text", text);
    return "enjoy";
  }


}
