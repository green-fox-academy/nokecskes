package com.greenfoxacademy.lionkingbank.controllers;

import com.greenfoxacademy.lionkingbank.models.BankAccount;
import com.greenfoxacademy.lionkingbank.models.BankAccountList;
import java.lang.reflect.Array;
import java.util.ArrayList;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Connor on 2017.05.03..
 */
@Controller
public class AccountController {

  BankAccountList bankAccountList = new BankAccountList();

  @RequestMapping("/web/Account")
  public String addAccount(Model model) {
    model.addAttribute("account", bankAccountList.getListOfAccounts().get(0));
    return "bankAccount";
  }

  @RequestMapping("/web/ListOfAccounts")
  public String createListOfAccounts (Model model) {
    model.addAttribute("accounts", bankAccountList.getListOfAccounts());
    return "listOfAccounts";
  }

  @RequestMapping("/web/Enjoy")
  public String enjoyText(Model model) {
    String text = "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>";
    model.addAttribute("text", text);
    return "enjoy";
  }

  @RequestMapping("/web/ListOfAccounts/increaseBalance")
  public String hit(int index) {
    bankAccountList.getListOfAccounts().get(index).increaseBalance();
    return "redirect:/web/ListOfAccounts";
  }

  /*Not working solution, still thinking about it :)
    public String hit (@RequestParam int id) {
    int newBalance = bankAccountList.getListOfAccounts().get(id).getBalance() + 10;
    bankAccountList.getListOfAccounts().get(id).setBalance(newBalance);
    return "redirect:/web/ListOfAccounts";
  }*/


}
