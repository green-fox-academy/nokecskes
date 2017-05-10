package com.greenfox.models;

/**
 * Created by Connor on 2017.05.10..
 */
public class Append {

  private String appended;

  public Append(String appendable) {
    this.appended = appendable + "a";
  }

  public String getAppended() {
    return appended;
  }
}
