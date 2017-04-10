import java.awt.Graphics;

public class Tile {

  int positionX;
  int positionY;
  String fileName;

  public Tile(int positionX, int positionY) {
    this.positionX = positionX;
    this.positionY = positionY;
    fileName = "no filename";
  }

  public void drawTile(Graphics graphics) {
    PositionedImage image = new PositionedImage(fileName, positionX, positionY);
    image.draw(graphics);
  }


}
