import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class GameObject {

  public static final int TILE_WIDTH = 72;
  public static final int TILE_HEIGHT = 72;

  int positionX;
  int positionY;
  BufferedImage image;

  public GameObject(BufferedImage image, int positionX, int positionY) {
    this.positionX = positionX;
    this.positionY = positionY;
    this.image = image;
  }

  public void draw(Graphics graphics) {
    graphics.drawImage(image, positionX * TILE_WIDTH, positionY * TILE_HEIGHT, null);
  }

}
