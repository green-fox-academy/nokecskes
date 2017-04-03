/**
 * Created by Connor on 2017.04.03..
 */
public class FleetOfThings {

  public static void main(String[] args) {
    Fleet fleet = new Fleet();
    // Create a fleet of things to have this output:
    // 1. [ ] Get milk
    // 2. [ ] Remove the obstacles
    // 3. [x] Stand up
    // 4. [x] Eat lunch

    Thing one = new Thing("Get milk");
    fleet.add(one);

    Thing two = new Thing("Remove the obstacles");
    fleet.add(two);

    Thing three = new Thing("Stand up");
    fleet.add(three);
    three.complete();

    Thing four = new Thing("Eat lunch");
    fleet.add(four);
    four.complete();

    System.out.println(fleet);
  }
}
