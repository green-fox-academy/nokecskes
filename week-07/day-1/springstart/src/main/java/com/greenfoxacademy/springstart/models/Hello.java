package com.greenfoxacademy.springstart.models;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Created by Connor on 2017.05.03..
 */

public class Hello {

  String greeting;
  int red;
  int green;
  int blue;
  int fontSize;

  public Hello(String greeting, int red, int green, int blue, int fontSize) {
    this.greeting = greeting;
    this.red = red;
    this.green = green;
    this.blue = blue;
    this.fontSize = fontSize;
  }

  public String getGreeting() {
    return greeting;
  }

  public void setGreeting(String greeting) {
    this.greeting = greeting;
  }

  public int getRed() {
    return red;
  }

  public void setRed(int red) {
    this.red = red;
  }

  public int getGreen() {
    return green;
  }

  public void setGreen(int green) {
    this.green = green;
  }

  public int getBlue() {
    return blue;
  }

  public void setBlue(int blue) {
    this.blue = blue;
  }

  public int getFontSize() {
    return fontSize;
  }

  public void setFontSize(int fontSize) {
    this.fontSize = fontSize;
  }
}
