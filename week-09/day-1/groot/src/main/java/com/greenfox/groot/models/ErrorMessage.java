package com.greenfox.groot.models;


import org.springframework.stereotype.Component;

/**
 * Created by Connor on 2017.05.15..
 */
@Component
public class ErrorMessage {

  private String error;

  public ErrorMessage() {
  }

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
