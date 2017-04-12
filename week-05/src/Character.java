import java.awt.image.BufferedImage;

public class Character extends GameObject {

  Area myGameArea;

  public Character(Area myGameArea, BufferedImage image, int positionX, int positionY) {
    super(image, positionX, positionY);
    this.myGameArea = myGameArea;
  }

  public void moveUp() {
    if ((positionY - 1) >= 0 && myGameArea.boardTiles.get(positionY - 1).get(positionX) instanceof EmptyTile) {
      positionY -= 1;
    }
  }

  public void moveDown() {
    if ((positionY + 1) < 10 && myGameArea.boardTiles.get(positionY + 1).get(positionX) instanceof EmptyTile) {
      positionY += 1;
    }
  }

  public void moveLeft() {
    if ((positionX - 1) >= 0 && myGameArea.boardTiles.get(positionY).get(positionX - 1) instanceof EmptyTile) {
      positionX -= 1;
    }
  }

  public void moveRight() {
    if ((positionX + 1) < 10 && myGameArea.boardTiles.get(positionY).get(positionX + 1) instanceof EmptyTile) {
      positionX += 1;
    }
  }
}
