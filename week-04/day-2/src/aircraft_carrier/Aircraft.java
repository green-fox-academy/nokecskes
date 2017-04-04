package aircraft_carrier;

/**
 * Created by Connor on 2017.04.04..
 */


public class Aircraft {

  int ammoMax;
  int ammoCurrent;
  int baseDamage;
  int totalDamage;
  String type;

  public Aircraft() {
    this(0, 0, "unknown");
  }

  public Aircraft(int ammoMax, int baseDamage, String type) {
    this.ammoMax = ammoMax;
    this.baseDamage = baseDamage;
    this.type = type;
    ammoCurrent = 0;
    totalDamage = 0;
  }

  public int fight() {
    int damage = 0;
    damage = baseDamage * ammoCurrent;
    ammoCurrent = 0;
    return damage;
  }

  public int refill(int refillAmount) {
    int ammoRemaining;
    if (refillAmount < ammoMax) {
      ammoCurrent = refillAmount;
      ammoRemaining = 0;
    } else {
      ammoCurrent = ammoMax;
      ammoRemaining = refillAmount - ammoMax;
    }
    return ammoRemaining;
  }

  public String get_type() {
    return type;
  }

  public void get_status() {
    System.out.printf("Type %s, Ammo: %d, Base Damage: %d, All Damage: %d", type, ammoCurrent,
            baseDamage, totalDamage);
  }


}
