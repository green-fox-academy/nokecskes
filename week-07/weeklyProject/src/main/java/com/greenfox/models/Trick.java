package com.greenfox.models;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by Connor on 2017.05.04..
 */
@Getter
@Setter
public class Trick {

  private String description;
  boolean learned;

  public Trick(String description) {
    this.description = description;
    this.learned = false;
  }
}



