package com.greenfox.groot.models;

/**
 * Created by K on 2017.06.03..
 */
public class Food {

  private String name;
  private int amount;
  private int calorie;

  public Food() {
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAmount() {
    return amount;
  }

  public void setAmount(int amount) {
    this.amount = amount;
  }

  public int getCalorie() {
    return calorie;
  }

  public void setCalorie(int calorie) {
    this.calorie = calorie;
  }
}
