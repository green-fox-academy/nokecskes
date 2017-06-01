package com.greenfox.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by K on 2017.06.01..
 */
@Entity
public class MealType {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;

  private String mealType;

  public MealType() {
  }

  public MealType(String mealType) {
    this.mealType = mealType;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getMealType() {
    return mealType;
  }

  public void setMealType(String mealType) {
    this.mealType = mealType;
  }
}
