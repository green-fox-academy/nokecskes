package garden_application;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Connor on 2017.04.04..
 */

public class Garden {

  List<Tree> trees;
  List<Flower> flowers;

  public Garden() {
    trees = new ArrayList<>();
    flowers = new ArrayList<>();
  }

  public float needsWaterCounter(float waterAmount) {
    float needsWater = 0;
    for (Flower currentFlower : flowers) {
      if (currentFlower.needsWater()) {
        needsWater++;
      }
    }
    for (Tree currentTree : trees) {
      if (currentTree.needsWater()) {
        needsWater++;
      }
    }
    return needsWater;
  }

  public void waterPlant(float waterAmount) {
    float needsWater = needsWaterCounter(waterAmount);
    float waterPortion = waterAmount / needsWater;

    System.out.printf("Watering with %f\n", waterAmount);

    for (Flower currentFlower : flowers) {
      if (currentFlower.needsWater()) {
        currentFlower.watering(waterPortion);
      }
    }
    for (Tree currentTree : trees) {
      if (currentTree.needsWater()) {
        currentTree.watering(waterPortion);
      }
    }
    status();
  }

  public void status() {
    for (Flower currentFlower : flowers) {
      currentFlower.status();
    }
    for (Tree currentTree : trees) {
      currentTree.status();
    }
  }

}
