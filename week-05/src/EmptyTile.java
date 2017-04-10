/**
 * Created by Connor on 2017.04.10..
 */
public class EmptyTile extends Tile {

  public EmptyTile (int positionX, int positionY) {
    super(positionX, positionY);
  }

  @Override
  public void drawTile(int positionX, int positionY) {
    super.drawTile("assets/floor.png", positionX, positionY);
  }
}
