import java.util.ArrayList;
import java.util.List;

/**
 * Created by Connor on 2017.04.03..
 */
/*
Create a Farm class
  it has list of Animals
  it has slots which defines the number of free places for animals
  breed() -> creates a new animal if there's place for it
  slaughter() -> removes the least hungry animal
 */

public class Farm {

  List<Animal> animals;
  int slots;

  public Farm() {
    this.animals = new ArrayList<>();
    slots = 10;
  }

  /*public Animal breed() {

    return newAnimal;
  }*/


}
