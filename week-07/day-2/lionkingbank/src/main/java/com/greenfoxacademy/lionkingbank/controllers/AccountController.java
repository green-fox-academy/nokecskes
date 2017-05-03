package com.greenfoxacademy.lionkingbank.controllers;

import com.greenfoxacademy.lionkingbank.models.BankAccount;
import java.lang.reflect.Array;
import java.util.ArrayList;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Connor on 2017.05.03..
 */
@Controller
public class AccountController {

  BankAccount simbaAccount = new BankAccount("Simba", 2000, "lion", "Zebra");
  BankAccount timonAccount = new BankAccount("Timon", 100, "meerkat", "Leaf");
  BankAccount zordonAccount = new BankAccount("Zordon", 0, "lion", "Zebra");
  BankAccount zazuAccount = new BankAccount("Zazu", 8000, "bird", "Bug");
  BankAccount pumbaAccount = new BankAccount("Pumba", 1500, "tusker", "Bug");

  @RequestMapping("/web/Account")
  public String addAccount(Model model) {
    model.addAttribute("account", simbaAccount);
    return "bankAccount";
  }

  @RequestMapping("/web/ListOfAccounts")
  public String createListOfAccounts (Model model) {
    ArrayList<BankAccount> listOfAccounts = new ArrayList<>();
    listOfAccounts.add(simbaAccount);
    listOfAccounts.add(timonAccount);
    listOfAccounts.add(zordonAccount);
    listOfAccounts.add(zazuAccount);
    listOfAccounts.add(pumbaAccount);
    model.addAttribute("accounts", listOfAccounts);
    return "listOfAccounts";
  }

  @RequestMapping("/web/Enjoy")
  public String enjoyText(Model model) {
    String text = "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>";
    model.addAttribute("text", text);
    return "enjoy";
  }


}
