package com.greenfoxacademy.lionkingbank.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by Connor on 2017.05.03..
 */
public class BankAccount {

  private String name;
  private int balance;
  private String animalType;
  private String currency;
  private boolean king;
  private boolean goodGuy;

  public BankAccount() {
  }

  public BankAccount(String name, int balance, String animalType, String currency, boolean king,
      boolean goodGuy) {
    this.name = name;
    this.balance = balance;
    this.animalType = animalType;
    this.currency = currency;
    this.king = king;
    this.goodGuy = goodGuy;
  }

  public void increaseBalance() {
    balance += 10;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getBalance() {
    return balance;
  }

  public void setBalance(int balance) {
    this.balance = balance;
  }

  public String getAnimalType() {
    return animalType;
  }

  public void setAnimalType(String animalType) {
    this.animalType = animalType;
  }

  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public boolean isKing() {
    return king;
  }

  public void setKing(boolean king) {
    this.king = king;
  }

  public boolean isGoodGuy() {
    return goodGuy;
  }

  public void setGoodGuy(boolean goodGuy) {
    this.goodGuy = goodGuy;
  }
}
