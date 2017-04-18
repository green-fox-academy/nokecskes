package main.java.music;

/**
 * Created by Connor on 2017.04.18..
 */
public class ElectricGuitar extends StringedInstrument {

  public ElectricGuitar() {
    name = "Electric Guitar";
    numberOfStrings = 6;
    sound = "Twang";
  }

  public ElectricGuitar(int numberOfStrings) {
    name = "Electric Guitar";
    this.numberOfStrings = numberOfStrings;
    sound = "Twang";
  }
}
