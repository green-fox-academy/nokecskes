import java.awt.image.BufferedImage;

public class Hero extends Character {

  public Hero(Area myGameArea, CurrentArea myCurrentArea) {
    super(myGameArea, myCurrentArea, ImageLoader.getInstance().HERO_DOWN, 0, 0);
    currentHP = 20 + 3 * myCurrentArea.randomNumberGenerator(1, 6);
    maxHP = 100;
    currentDP = 2 * myCurrentArea.randomNumberGenerator(1, 6);
    maxDP = 100;
    currentSP = 5 + myCurrentArea.randomNumberGenerator(1, 6);
    maxSP = 100;
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
