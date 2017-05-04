package com.greenfoxacademy.lionkingbank.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by Connor on 2017.05.03..
 */
@Getter
@Setter
@AllArgsConstructor
public class BankAccount {

  private String name;
  private int balance;
  private String animalType;
  private String currency;
  private boolean king;
  private boolean goodGuy;

  public void increaseBalance() {
    balance += 10;
  }
}
