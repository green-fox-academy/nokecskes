package com.greenfoxacademy.lionkingbank.models;

import java.util.ArrayList;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by Connor on 2017.05.03..
 */

public class BankAccountList {

  private ArrayList<BankAccount> listOfAccounts;

  public BankAccountList() {
    listOfAccounts = new ArrayList<>();
    BankAccount simbaAccount = new BankAccount("Simba", 2000, "lion", "Zebra", false, true);
    BankAccount timonAccount = new BankAccount("Timon", 100, "meerkat", "Leaf", true, true);
    BankAccount zordonAccount = new BankAccount("Zordon", 0, "lion", "Zebra", false, false);
    BankAccount zazuAccount = new BankAccount("Zazu", 8000, "bird", "Bug", false, true);
    BankAccount pumbaAccount = new BankAccount("Pumba", 1500, "tusker", "Bug", true, true);
    listOfAccounts.add(simbaAccount);
    listOfAccounts.add(timonAccount);
    listOfAccounts.add(zordonAccount);
    listOfAccounts.add(zazuAccount);
    listOfAccounts.add(pumbaAccount);
  }

  public ArrayList<BankAccount> getListOfAccounts() {
    return listOfAccounts;
  }

  public void setListOfAccounts(
      ArrayList<BankAccount> listOfAccounts) {
    this.listOfAccounts = listOfAccounts;
  }

  public void addNewAccount(BankAccount bankAccount) {
    listOfAccounts.add(bankAccount);
  }
}
