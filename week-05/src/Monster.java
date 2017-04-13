/**
 * Created by Connor on 2017.04.12..
 */
public class Monster extends Character {

  public Monster(Area myGameArea, CurrentArea myCurrentArea, int[] positionXY) {
    super(myGameArea, myCurrentArea, ImageLoader.getInstance().BOSS, positionXY[0], positionXY[1]);
  }
}
