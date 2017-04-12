import java.awt.image.BufferedImage;

public class Hero extends Character {

  public Hero(Area myGameArea) {
    super(myGameArea, ImageLoader.getInstance().HERO_DOWN, 0, 0);
  }

  @Override
  public void moveUp() {
    super.moveUp();
    image = ImageLoader.getInstance().HERO_UP;
  }

  @Override
  public void moveDown() {
    super.moveDown();
    image = ImageLoader.getInstance().HERO_DOWN;
  }

  @Override
  public void moveLeft() {
    super.moveLeft();
    image = ImageLoader.getInstance().HERO_LEFT;
  }

  @Override
  public void moveRight() {
    super.moveRight();
    image = ImageLoader.getInstance().HERO_RIGHT;
  }
}
