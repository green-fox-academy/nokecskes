package annotations;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by Connor on 2017.04.28..
 */
public class ScreenApp {

  public static void main(String[] args) {

    ArrayList<Screen> screens = new ArrayList<>();

    Screen screen1 = new Screen43(Size.INCH15);
    screens.add(screen1);
    Screen screen2 = new Screen43(Size.INCH17);
    screens.add(screen2);
    Screen screen3 = new Screen43(Size.INCH19);
    screens.add(screen3);
    Screen screen4 = new Screen169(Size.INCH21);
    screens.add(screen4);
    Screen screen5 = new Screen169(Size.INCH23);
    screens.add(screen5);
    Screen screen6 = new Screen169(Size.INCH25);
    screens.add(screen6);
    Screen screen7 = new Screen219(Size.INCH29);
    screens.add(screen7);
    Screen screen8 = new Screen219(Size.INCH34);
    screens.add(screen8);
    Screen screen9 = new Screen219(Size.INCH15);
    screens.add(screen9);

    for (Screen screen : screens) {
      System.out.println(screen);
    }

  }


}
