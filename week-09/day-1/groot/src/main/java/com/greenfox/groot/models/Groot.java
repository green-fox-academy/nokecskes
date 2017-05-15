package com.greenfox.groot.models;


import lombok.Getter;
import lombok.Setter;

/**
 * Created by Connor on 2017.05.15..
 */
@Getter
@Setter
public class Groot {

  private String received;
  private String translated;

  public Groot(String received) {
    this.received = received;
    this.translated = "I am Groot!";
  }
}
