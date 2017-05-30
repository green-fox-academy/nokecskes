package com.greenfoxacademy.lionkingbank.controllers;

import com.greenfoxacademy.lionkingbank.models.BankAccount;
import com.greenfoxacademy.lionkingbank.models.BankAccountList;
import java.lang.reflect.Array;
import java.util.ArrayList;
import javax.jws.WebParam.Mode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Connor on 2017.05.03..
 */
@Controller
public class AccountController {

  @Autowired
  ModelAndView modelAndView;

  BankAccountList bankAccountList = new BankAccountList();

  @GetMapping("/web/Account")
  public ModelAndView addAccount() {
    modelAndView.addObject("account", bankAccountList.getListOfAccounts().get(0));
    modelAndView.setViewName("bankAccount");
    return modelAndView;
  }

  @GetMapping("/web/ListOfAccounts")
  public ModelAndView createListOfAccounts() {
    modelAndView.addObject("accounts", bankAccountList.getListOfAccounts());
    modelAndView.setViewName("listOfAccounts");
    return modelAndView;
  }

  @GetMapping("/web/Enjoy")
  public ModelAndView enjoyText() {
    String text = "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>";
    modelAndView.addObject("text", text);
    modelAndView.setViewName("enjoy");
    return modelAndView;
  }

  @GetMapping("/web/addNewBankAccount")
  public ModelAndView addNewBankAccount() {
    modelAndView.addObject("account", new BankAccount());
    modelAndView.setViewName("addAccount");
    return modelAndView;
  }

  @PostMapping("/web/addingNewBankAccount")
  public String savingNewBankAccount(BankAccount bankAccount) {
    bankAccountList.addNewAccount(bankAccount);
    return "redirect:/web/ListOfAccounts";
  }

  @GetMapping("/web/ListOfAccounts/increaseBalance")
  public String hit(@RequestParam int index) {
    bankAccountList.getListOfAccounts().get(index).increaseBalance();
    return "redirect:/web/ListOfAccounts";
  }

  @RequestMapping("/web/deletingAccount")
  public String deleteAccount(@RequestParam String accountHolder) {
    bankAccountList.deleteAccount(accountHolder);
    return "redirect:/web/ListOfAccounts";
  }
}
