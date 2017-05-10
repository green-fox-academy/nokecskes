package com.greenfox.models;

import javax.xml.soap.SAAJResult;

/**
 * Created by Connor on 2017.05.10..
 */
public class ErrorMessage {

  private String error;

  public ErrorMessage(String error) {
    this.error = error;
  }

  public String getError() {
    return error;
  }
}
