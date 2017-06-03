package com.greenfox.groot.service;

import com.greenfox.groot.models.Ship;
import com.greenfox.groot.models.ShipStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by K on 2017.06.03..
 */
@Service
public class ShipService {

  @Autowired
  Ship ship;

  @Autowired
  ShipStatus shipStatus;

  String caliber;
  double amount;
  final double maxAmount = 12500;

  public Ship getShip() {
    return ship;
  }

  public ShipStatus setShipstatus(String caliber, double amount) {
    this.caliber = caliber;
    this.amount = amount;
    updateShip();

    shipStatus.setReceived(caliber);
    shipStatus.setAmount(amount);
    shipStatus.setShipstatus(ship.getShipstatus());
    shipStatus.setReady(ship.isReady());
    return shipStatus;
  }

  public void updateShip() {
    updateCaliber();
    updateShipStatus();
  }

  public void updateCaliber() {
    if (caliber.equals(".25")) {
      ship.increaseCaliber25(amount);
    } else if (caliber.equals(".30")) {
      ship.increaseCaliber30(amount);
    } else if (caliber.equals(".50")) {
      ship.increaseCaliber50(amount);
    }
  }

  public void updateShipStatus() {
    double allCaliber = ship.getCaliber25() + ship.getCaliber30() + ship.getCaliber50();
    double caliberPercentage = allCaliber / maxAmount * 100;
    ship.setReady(false);
    if (allCaliber <= 0) {
      ship.setShipstatus("empty");
    }
    if (caliberPercentage < 100) {
      ship.setShipstatus(String.valueOf(caliberPercentage) + "%");
    } else if (allCaliber == 12500) {
      ship.setShipstatus("full");
      ship.setReady(true);
    } else if (allCaliber > 12500) {
      ship.setShipstatus("overloaded");
    }
  }
}
