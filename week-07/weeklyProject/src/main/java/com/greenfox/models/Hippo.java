package com.greenfox.models;

import java.util.ArrayList;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Connor on 2017.05.04..
 */

@Setter
@Getter
public class Hippo {

  private String name;
  String currentDrink;
  String currentFood;
  private int tricksLearned;

  @Autowired
  private ArrayList<Trick> trickList;

  public Hippo() {
    this.name = "Fiona";
    currentDrink = "water";
    currentFood = "watermelon";
    tricksLearned = 0;
  }

  public void learnTrick(int indexOfTrick) {
    tricksLearned++;
    trickList.get(indexOfTrick).setLearned(true);
  }
}





