package main.java.music;

/**
 * Created by Connor on 2017.04.18..
 */
public class BassGuitar extends StringedInstrument {

  public BassGuitar() {
    name = "Bass Guitar";
    numberOfStrings = 4;
    sound = "Duum-duum-duum";
  }

  public BassGuitar(int numberOfStrings) {
    name = "Bass Guitar";
    this.numberOfStrings = numberOfStrings;
    sound = "Duum-duum-duum";
  }
}
