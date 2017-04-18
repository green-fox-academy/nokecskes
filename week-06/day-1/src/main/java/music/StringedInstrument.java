package main.java.music;

/**
 * Created by Connor on 2017.04.18..
 */
public abstract class StringedInstrument extends Instrument {
  /*add another abstract class, StringedInstrument which extends Instrument.
  It introduces numberOfStrings and
  has a final formatForPlay string field
      that is the format of the String that the play() will include
      (which prints a confirmation message of the sound of the instruments).
  */

  int numberOfStrings;
  final String formatForPlay = "%s, a %d-stringed instrument that %s\n";

  public void play() {
    System.out.printf(formatForPlay, name, numberOfStrings, sound);
  }
}
