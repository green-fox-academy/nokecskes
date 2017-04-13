import java.awt.image.BufferedImage;

public class Hero extends Character {

  public Hero(Area myGameArea, CurrentArea myCurrentArea) {
    super(myGameArea, myCurrentArea, ImageLoader.getInstance().HERO_DOWN, 0, 0);
    maxHP = 20 + 3 * myCurrentArea.randomNumberGenerator(1, 6);
    currentHP = maxHP;
    maxDP = 2 * myCurrentArea.randomNumberGenerator(1, 6);
    currentDP = maxDP;
    maxSP = 5 + myCurrentArea.randomNumberGenerator(1, 6);
    currentSP = maxSP;
  }

  @Override
  public int generateLevel() {
    return myCurrentArea.areaNumber;
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
