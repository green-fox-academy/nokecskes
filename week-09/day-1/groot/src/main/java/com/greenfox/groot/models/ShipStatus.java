package com.greenfox.groot.models;

import org.springframework.stereotype.Component;

/**
 * Created by Connor on 2017.05.15..
 */
@Component
public class ShipStatus {

  private String received;
  private double amount;
  private String shipstatus;
  private boolean ready;

  public ShipStatus() {
  }

  public ShipStatus(String received, double amount, String shipstatus, boolean ready) {
    this.received = received;
    this.amount = amount;
    this.shipstatus = shipstatus;
    this.ready = ready;
  }

  public String getReceived() {
    return received;
  }

  public void setReceived(String received) {
    this.received = received;
  }

  public double getAmount() {
    return amount;
  }

  public void setAmount(double amount) {
    this.amount = amount;
  }

  public String getShipstatus() {
    return shipstatus;
  }

  public void setShipstatus(String shipstatus) {
    this.shipstatus = shipstatus;
  }

  public boolean isReady() {
    return ready;
  }

  public void setReady(boolean ready) {
    this.ready = ready;
  }
}
