package com.greenfox.models;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.hibernate.validator.constraints.NotBlank;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * Created by K on 2017.06.01..
 */
@Entity
public class Meal {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;

  @Temporal(TemporalType.DATE)
  @NotNull(message = "When did you eat?")
  @DateTimeFormat(pattern = "yyyy-MM-dd")
  private Date date;

  @NotNull(message = "What was the type of your meal?")
  private String mealType;

  @NotNull(message = "What did you eat?")
  @NotBlank(message = "What did you eat?")
  private String description;

  @NotNull(message = "How many calories did you consume?")
  @Min(value = 1, message = "How many calories did you consume?")
  private int calories;

  public Meal() {
  }

  public Meal(Date date, String mealType, String description, int calories) {
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

  public Date getDate() {
    return date;
  }

  public void setDate(Date date) {
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
