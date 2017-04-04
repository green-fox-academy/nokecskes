package garden_application;

import java.util.ArrayList;

/**
 * Created by Connor on 2017.04.04..
 */
public class GardenApp {

  public static void main(String[] args) {

    Garden myLittleGarden = new Garden();

    Flower flowerOne = new Flower("yellow", 4);
    myLittleGarden.flowers.add(flowerOne);
    Flower flowerTwo = new Flower("blue", 2);
    myLittleGarden.flowers.add(flowerTwo);
    Tree treeOne = new Tree("purple", 4);
    myLittleGarden.trees.add(treeOne);
    Tree treeTwo = new Tree("orange", 5);
    myLittleGarden.trees.add(treeTwo);

    myLittleGarden.status();
    myLittleGarden.waterPlant(40);
    myLittleGarden.waterPlant(70);
  }
}
