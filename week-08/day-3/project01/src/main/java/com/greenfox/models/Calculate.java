package com.greenfox.models;

/**
 * Created by Connor on 2017.05.10..
 */
public class Calculate {

  private int result;

  public Calculate(int until, String what) {
    if (what.equals("sum")) {
      this.result = sum(until);
    } else if (what.equals("factor")) {
      this.result = factor(until);
    }
  }

  public int getResult() {
    return result;
  }

  private int sum(int until) {
    if (until == 1) {
      return 1;
    }
    return until + sum(until - 1);
  }

  private int factor(int until) {
    if (until == 1) {
      return 1;
    }
    return until * factor(until - 1);
  }
}
