import java.awt.image.BufferedImage;

public class Hero extends Character {

  Area myGameArea;

  public Hero(Area myGameArea) {
    super(ImageLoader.getInstance().HERO_DOWN, 0, 0);
    this.myGameArea = myGameArea;
  }

  public void heroUp() {
    if ((positionY - 1) >= 0 && myGameArea.boardTiles.get(positionY - 1).get(positionX) instanceof EmptyTile) {
      positionY -= 1;
    }
    image = ImageLoader.getInstance().HERO_UP;
  }

  public void heroDown() {
    if ((positionY + 1) < 10 && myGameArea.boardTiles.get(positionY + 1).get(positionX) instanceof EmptyTile) {
      positionY += 1;
    }
    image = ImageLoader.getInstance().HERO_DOWN;
  }

  public void heroLeft() {
    if ((positionX - 1) >= 0 && myGameArea.boardTiles.get(positionY).get(positionX - 1) instanceof EmptyTile) {
      positionX -= 1;
    }
    image = ImageLoader.getInstance().HERO_LEFT;
  }

  public void heroRight() {
    if ((positionX + 1) < 10 && myGameArea.boardTiles.get(positionY).get(positionX + 1) instanceof EmptyTile) {
      positionX += 1;
    }
    image = ImageLoader.getInstance().HERO_RIGHT;
  }


}
