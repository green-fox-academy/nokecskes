package garden_application;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Connor on 2017.04.04..
 */

public class Garden {

  List<Plant> myPlants;

  public Garden() {
    myPlants = new ArrayList<>();
  }

  public float needsWaterCounter(float waterAmount) {
    float needsWater = 0;
    for (Plant plant : myPlants) {
      if (plant.needsWater()) {
        needsWater++;
      }
    }
    return needsWater;
  }

  public void waterPlant(float waterAmount) {
    float needsWater = needsWaterCounter(waterAmount);
    float waterPortion = waterAmount / needsWater;

    System.out.printf("Watering with %d\n", (int)waterAmount);

    for (Plant plant : myPlants) {
      if (plant.needsWater()) {
        plant.watering(waterPortion);
      }
    }

    status();
  }

  public void status() {
    for (Plant plant : myPlants) {
      plant.status();
    }
  }

}
