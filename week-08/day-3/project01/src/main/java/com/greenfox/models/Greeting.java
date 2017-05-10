package com.greenfox.models;

/**
 * Created by Connor on 2017.05.10..
 */
public class Greeting {

  private String welcome_message;

  public Greeting(String name, String title) {
   this.welcome_message = String.format("Oh, hi there %s, my dear %s!", name, title);
  }

  public String getWelcome_message() {
    return welcome_message;
  }
}
