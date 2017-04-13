import java.awt.image.BufferedImage;
import java.util.ArrayList;

public class Character extends GameObject {

  Area myGameArea;
  CurrentArea myCurrentArea;
  int maxHP;
  int currentHP;
  int maxDP;
  int currentDP;
  int maxSP;
  int currentSP;
  int level;

  public Character(Area myGameArea, CurrentArea myCurrentArea, BufferedImage image, int positionX, int positionY) {
    super(image, positionX, positionY);
    this.myGameArea = myGameArea;
    this.myCurrentArea = myCurrentArea;
    level = generateLevel();
  }

  public int generateLevel() {
    int chance = myCurrentArea.randomNumberGenerator(1, 10);
    if (chance < 6) {
      return myCurrentArea.areaNumber;
    }else if (chance > 5 && chance < 10) {
      return myCurrentArea.areaNumber + 1;
    }else if (chance == 10) {
      return myCurrentArea.areaNumber + 2;
    }
    return 0;
  }


  public void moveUp() {
    if (myCurrentArea.isOnBoard(positionY - 1) && myCurrentArea.isEmptyTile(positionX, positionY - 1)) {
      positionY -= 1;
    }
  }

  public void moveDown() {
    if (myCurrentArea.isOnBoard(positionY + 1)&& myCurrentArea.isEmptyTile(positionX, positionY + 1)) {
      positionY += 1;
    }
  }

  public void moveLeft() {
    if (myCurrentArea.isOnBoard(positionX - 1) && myCurrentArea.isEmptyTile(positionX - 1, positionY)) {
      positionX -= 1;
    }
  }

  public void moveRight() {
    if (myCurrentArea.isOnBoard(positionX + 1) && myCurrentArea.isEmptyTile(positionX + 1, positionY)) {
      positionX += 1;
    }
  }
}
