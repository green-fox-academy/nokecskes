/**
 * Created by Connor on 2017.04.12..
 */
public class Monster extends Character {

  public Monster(Area myGameArea) {
    super(myGameArea, ImageLoader.getInstance().BOSS, 9, 9);
  }
}
