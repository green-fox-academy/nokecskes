/**
 * Created by Connor on 2017.04.12..
 */
public class Skeleton extends Character {

  public Skeleton (Area myGameArea, CurrentArea myCurrentArea, int[] positionXY) {
    super(myGameArea,myCurrentArea, ImageLoader.getInstance().SKELETON, positionXY[0], positionXY[1]);
    maxHP = 2 * level * myCurrentArea.randomNumberGenerator(1, 6);
    currentHP = maxHP;
    maxDP = level / 2 * myCurrentArea.randomNumberGenerator(1, 6);
    currentDP = maxDP;
    maxSP = level * myCurrentArea.randomNumberGenerator(1, 6);
    currentSP = maxSP;
  }

}
