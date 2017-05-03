package com.greenfoxacademy.lionkingbank.models;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Created by Connor on 2017.05.03..
 */
@Getter
@AllArgsConstructor
public class BankAccount {

  private String name;
  private int balance;
  private String animalType;
  private String currency;

}
