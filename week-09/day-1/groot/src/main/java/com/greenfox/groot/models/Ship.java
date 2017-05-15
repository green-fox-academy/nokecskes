package com.greenfox.groot.models;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

/**
 * Created by Connor on 2017.05.15..
 */

@Component
@Setter
@Getter
public class Ship {

  private double caliber25;
  private double caliber30;
  private double caliber50;
  private String shipstatus;
  private boolean ready;

  public Ship() {
    this.caliber25 = 0;
    this.caliber30 = 0;
    this.caliber50 = 0;
    this.shipstatus = "empty";
    this.ready = false;
  }
}
