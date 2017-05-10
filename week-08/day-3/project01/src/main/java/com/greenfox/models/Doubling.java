package com.greenfox.models;

/**
 * Created by Connor on 2017.05.10..
 */
public class Doubling {

  private int received;
  private int result;

  public Doubling(int received) {
    this.received = received;
    this.result = received * 2;
  }

  public int getReceived() {
    return received;
  }

  public int getResult() {
    return result;
  }
}
