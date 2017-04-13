/**
 * Created by Connor on 2017.04.12..
 */
public class Skeleton extends Character {

  public Skeleton (Area myGameArea, CurrentArea myCurrentArea, int[] positionXY) {
    super(myGameArea,myCurrentArea, ImageLoader.getInstance().SKELETON, positionXY[0], positionXY[1]);
  }

}
