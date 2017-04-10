import java.awt.Graphics;

public class GameObject {

  public static final int TILE_WIDTH = 72;
  public static final int TILE_HEIGHT= 72;

  int positionX;
  int positionY;
  String fileName;

  public GameObject(String filename, int positionX, int positionY) {
    this.positionX = positionX;
    this.positionY = positionY;
    this.fileName = filename;
  }

  public void draw(Graphics graphics) {
    PositionedImage image = new PositionedImage(fileName, positionX, positionY);
    image.draw(graphics);
  }

}
