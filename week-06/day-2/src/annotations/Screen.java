package annotations;

/**
 * Created by Connor on 2017.04.28..
 */

@Monitor
public class Screen {
  Size size;

  public Screen(Size size) {
    this.size = size;
  }

  @Override
  public String toString() {
    return String.format("size: %s, aspectratio: %s, classification: %s",
            size,
            this.getClass().getAnnotation(Monitor.class).aspectratio(),
            this.getClass().getAnnotation(Monitor.class).classification());
  }
}
