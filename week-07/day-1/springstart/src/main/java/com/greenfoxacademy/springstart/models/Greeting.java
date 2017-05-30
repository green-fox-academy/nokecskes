package com.greenfoxacademy.springstart.models;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Created by Connor on 2017.05.02..
 */


@Getter
public class Greeting {

  long id;
  String content;

  public Greeting(long id, String content) {
    this.id = id;
    this.content = content;
  }
}
