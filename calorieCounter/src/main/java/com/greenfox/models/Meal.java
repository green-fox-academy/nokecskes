package com.greenfox.models;

import java.time.LocalDateTime;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by K on 2017.06.01..
 */
@Entity
public class Meal {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;

  private LocalDateTime date;
  private String mealType;
  private String description;
  private int calories;

  public Meal() {
  }

  public Meal(LocalDateTime date, String mealType, String description, int calories) {
    this.date = date;
    this.mealType = mealType;
    this.description = description;
    this.calories = calories;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public LocalDateTime getDate() {
    return date;
  }

  public void setDate(LocalDateTime date) {
    this.date = date;
  }

  public String getMealType() {
    return mealType;
  }

  public void setMealType(String mealType) {
    this.mealType = mealType;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public int getCalories() {
    return calories;
  }

  public void setCalories(int calories) {
    this.calories = calories;
  }
}
