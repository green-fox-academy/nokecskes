/**
 * Created by Connor on 2017.04.12..
 */
public class Skeleton extends Character {

  public Skeleton (Area myGameArea) {
    /*int randomX = 0;
    int randomY = 0;

    do{
      randomX = (int)(0 + 9 * Math.random());
      randomY = (int)(0 + 9 * Math.random());
    } while(myGameArea.boardTiles.get(randomY).get(randomX) instanceof NotEmptyTile);*/

    super(myGameArea, ImageLoader.getInstance().SKELETON, 4, 4);
  }

}
