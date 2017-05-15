package com.greenfox.groot.models;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by Connor on 2017.05.15..
 */
@Getter
@Setter
public class Arrow {

  private double distance;
  private double time;
  private double speed;

  public Arrow(double distance, double time) {
    this.distance = distance;
    this.time = time;
    this.speed = distance / time;
  }


}
