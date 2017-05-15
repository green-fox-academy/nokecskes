package com.greenfox.groot.models;


import lombok.Getter;
import lombok.Setter;

/**
 * Created by Connor on 2017.05.15..
 */
@Getter
@Setter
public class ErrorMessage {

  private String error;

  public ErrorMessage(String errorMessage) {
    this.error = errorMessage;
  }
}
