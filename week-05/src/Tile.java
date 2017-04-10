import java.awt.Graphics;

public class Tile extends GameObject {

  int positionX;
  int positionY;
  String fileName;

  public Tile(int positionX, int positionY) {
    this.positionX = positionX;
    this.positionY = positionY;
    fileName = "unknown";
  }

  @Override
  public void draw(Graphics graphics) {
    PositionedImage image = new PositionedImage(fileName, positionX, positionY);
    image.draw(graphics);
  }

}
