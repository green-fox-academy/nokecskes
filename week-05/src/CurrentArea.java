import java.util.ArrayList;

/**
 * Created by Connor on 2017.04.12..
 */
public class CurrentArea extends GameLogic {

  Area myGameArea;
  ArrayList<Character> charactersOnBoard;
  int areaNumber;

  public CurrentArea(Area myGameArea) {
    areaNumber = 1;
    this.myGameArea = myGameArea;
  }

  public boolean isOnBoard(int position) {
    if (position >= 0 && position < 10) {
      return true;
    }
    return false;
  }


  public boolean isEmptyTile(int positionX, int positionY) {
    if (myGameArea.boardTiles.get(positionY * 10 + positionX) instanceof EmptyTile) {
      return true;
    }
    return false;
  }

  public boolean hasAnotherCharacter(ArrayList<Character> charactersOnBoard, int positionX, int positionY) {
    for (Character character : charactersOnBoard) {
      if(character.positionX == positionX && character.positionY == positionY) {
        return true;
      }
    }
    return false;
  }

  public int[] randomPositionGenerator (ArrayList<Character> charactersOnBoard) {
    int[] randomPosition = new int[2];
    do {
      randomPosition[0] = randomNumberGenerator(0, 9);
      randomPosition[1] = randomNumberGenerator(0, 9);
    } while(!(isEmptyTile(randomPosition[0], randomPosition[1])) || hasAnotherCharacter(charactersOnBoard, randomPosition[0], randomPosition[1]));
    return randomPosition;
  }

  public int randomNumberGenerator(int min, int max) {
    return (int)(min + Math.random() * max);
  }

}
