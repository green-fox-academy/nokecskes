package main.java.music;

/**
 * Created by Connor on 2017.04.18..
 */
public abstract class Instrument {
  /* it reserves (e.g. protected) the name of the instrument
  it should provide a play() method.*/

  String name;

  public abstract void play();

}
