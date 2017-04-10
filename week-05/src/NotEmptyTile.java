/**
 * Created by Connor on 2017.04.10..
 */
public class NotEmptyTile extends Tile {

  public NotEmptyTile (int positionX, int positionY) {
    super(positionX, positionY);
  }

  @Override
  public void drawTile(int positionX, int positionY) {
    super.drawTile("assets/wall.png", positionX, positionY);
  }
}
