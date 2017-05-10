package com.greenfox.models;

/**
 * Created by Connor on 2017.05.10..
 */
public class ErrorMessage {

  private String errorMessage;

  public ErrorMessage(String error) {
    this.errorMessage = String.format("Please provide a %s!", error);
  }

  public String getErrorMessage() {
    return errorMessage;
  }
}
