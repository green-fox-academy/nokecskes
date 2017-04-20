package aircraft_carrier;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Connor on 2017.04.04..
 */
public class Carrier {

  List<Aircraft> myAircraftArmy;
  int ammoStore;
  int healtPoint;

  public Carrier(int ammoInitial) {
    myAircraftArmy = new ArrayList<>();
    ammoStore = ammoInitial;
  }

  public void add_aircraft(String type) {
    if (type.equalsIgnoreCase("F16")) {
      myAircraftArmy.add(new AircraftF16());
    }
    else if (type.equalsIgnoreCase("F35")) {
      myAircraftArmy.add(new AircraftF35());
    } else {
      System.out.println("not able to find type!");
    }

  }

  /*public void fill() {
    if(ammoIsEnough()) {
      //fillAll();
    } else {
      fillF35()
    }

  }*/

  /*public boolean ammoIsEnough() {
    int ammoNeeded = 0;

    for (Aircraft aircraft : myAircraftArmy) {
      ammoNeeded += (aircraft.ammoMax - aircraft.ammoCurrent);
    }

    if (ammoNeeded > ammoStore) {
      return false;
    }
    else {
      return true;
    }

  }*/



}



/*
fill
        It should fill all the aircraft with ammo and substract the needed ammo from the ammo storage
        If there is not enough ammo than it should start to fill the F35 types first
        ammomax - ammocurrent
        If there is no ammo when this method is called it should throw an exception*/
