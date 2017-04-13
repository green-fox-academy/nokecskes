import java.awt.Graphics;
import java.util.ArrayList;

public class Area {

  int[][] area;
  ArrayList<Tile> boardTiles;

  public Area() {

    area = new int[][]{{0, 0, 0, 1, 0, 1, 0, 0, 0, 0},
            {0, 0, 0, 1, 0, 1, 0, 1, 1, 0},
            {0, 1, 1, 1, 0, 1, 0, 1, 1, 0},
            {0, 0, 0, 0, 0, 1, 0, 0, 0, 0},
            {1, 1, 1, 1, 0, 1, 1, 1, 1, 0},
            {0, 1, 0, 1, 0, 0, 0, 0, 1, 0},
            {0, 1, 0, 1, 0, 1, 1, 0, 1, 0},
            {0, 0, 0, 0, 0, 1, 1, 0, 1, 0},
            {0, 1, 1, 1, 0, 0, 0, 0, 1, 0},
            {0, 0, 0, 1, 0, 1, 1, 0, 0, 0}};

    boardTiles = new ArrayList<Tile>();

    for (int i = 0; i < 10; i++) {
      for (int j = 0; j < 10; j++) {
        if (area[i][j] == 0) {
          EmptyTile tile = new EmptyTile(ImageLoader.getInstance().FLOOR, j, i);
          boardTiles.add(tile);
        } else if (area[i][j] == 1) {
          NotEmptyTile tile = new NotEmptyTile(ImageLoader.getInstance().WALL, j, i);
          boardTiles.add(tile);
        }
      }
    }
  }

  public void drawArea(Graphics graphics) {
    for (Tile tile : boardTiles) {
      tile.draw(graphics);
    }
  }
}
