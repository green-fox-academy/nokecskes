package com.greenfoxacademy.models;

import com.greenfoxacademy.models.MyColor;

/**
 * Created by Connor on 2017.05.04..
 */
public class RedColor implements MyColor {

  @Override
  public void printColor() {
    System.out.println("It is red in color...");
  }
}
