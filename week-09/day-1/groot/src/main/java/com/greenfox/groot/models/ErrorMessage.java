package com.greenfox.groot.models;


/**
 * Created by Connor on 2017.05.15..
 */

public class ErrorMessage {

  private String error;

  public ErrorMessage(String errorMessage) {
    this.error = errorMessage;
  }

  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }
}
