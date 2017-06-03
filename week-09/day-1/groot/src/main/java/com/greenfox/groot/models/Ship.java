package com.greenfox.groot.models;

import org.springframework.stereotype.Component;

/**
 * Created by Connor on 2017.05.15..
 */

@Component
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

  public double getCaliber25() {
    return caliber25;
  }

  public void setCaliber25(double caliber25) {
    this.caliber25 = caliber25;
  }

  public void increaseCaliber25(double amount) {
    this.caliber25 += amount;
  }

  public double getCaliber30() {
    return caliber30;
  }

  public void setCaliber30(double caliber30) {
    this.caliber30 = caliber30;
  }

  public void increaseCaliber30(double amount) {
    this.caliber30 += amount;
  }

  public double getCaliber50() {
    return caliber50;
  }

  public void setCaliber50(double caliber50) {
    this.caliber50 = caliber50;
  }

  public void increaseCaliber50(double amount) {
    this.caliber50 += amount;
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
