package com.greenfox.groot.service;

import com.greenfox.groot.models.Ship;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by Connor on 2017.05.15..
 */
@Setter
@Getter
public class ShipStatus {

  private String received;
  private double amount;
  private String shipstatus;
  private boolean ready;

  public ShipStatus(Ship ship, String caliber, double amount) {
    this.received = caliber;
    this.amount = amount;
    fillShip(ship);
  }

  public void fillShip(Ship ship) {
    if (received.equals(".25")) {
      ship.setCaliber25(ship.getCaliber25() + amount);
    } else if (received.equals(".30")) {
      ship.setCaliber25(ship.getCaliber30() + amount);
    } else if (received.equals(".50")) {
      ship.setCaliber25(ship.getCaliber50() + amount);
    }
    calculateShipStatus(ship);
  }

  public void calculateShipStatus(Ship ship) {
    double statusSum = ship.getCaliber25() + ship.getCaliber30() + ship.getCaliber50();
    if (statusSum > 12500) {
      statusSum = 12500;
    }
    double statusPercentage = statusSum / 12500 * 100;
    shipstatus = statusPercentage + "%";
    setReadyStatus(ship);
  }

  public void setReadyStatus(Ship ship) {
    if (shipstatus.equals("100.0%")) {
      ship.setReady(true);
    } else {
      ship.setReady(false);
    }
  }
}
