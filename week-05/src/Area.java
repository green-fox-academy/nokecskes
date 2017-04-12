import java.awt.Graphics;
import java.util.ArrayList;

public class Area {

  int[][] area;
  ArrayList<ArrayList<Tile>> boardTiles;
  ArrayList<Tile> rowOfTiles;

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
            {0, 0, 0, 1, 0, 1, 1, 0, 1, 0}};

    boardTiles = new ArrayList<ArrayList<Tile>>();

    for (int i = 0; i < 10; i++) {
      rowOfTiles = new ArrayList<>();
      for (int j = 0; j < 10; j++) {
        if (area[i][j] == 0) {
          EmptyTile tile = new EmptyTile(ImageLoader.getInstance().FLOOR, j, i);
          rowOfTiles.add(tile);
        } else if (area[i][j] == 1) {
          NotEmptyTile tile = new NotEmptyTile(ImageLoader.getInstance().WALL, j, i);
          rowOfTiles.add(tile);
        }
      }
      boardTiles.add(rowOfTiles);
    }
  }

  public void drawArea(Graphics graphics) {
    for (ArrayList<Tile> tiles : boardTiles) {
      for (Tile tile : tiles) {
        tile.draw(graphics);
      }
    }
  }
}
