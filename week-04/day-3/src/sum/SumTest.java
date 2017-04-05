package sum;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

/**
 * Created by Connor on 2017.04.05..
 */
class SumTest {

  Sum sum = new Sum();

  @Test
  public void emptyList() {
    List<Integer> eltsToAdd = new ArrayList<>();
    assertEquals(0, sum.sumElts(eltsToAdd));
  }

  @Test
  public void oneElementList() {
    int oneElt = 42;
    List<Integer> eltsToAdd = new ArrayList<>();
    eltsToAdd.add(oneElt);
    assertEquals(oneElt, sum.sumElts(eltsToAdd));
  }

  @Test
  public void multipleElts() {
    List<Integer> eltsToAdd = new ArrayList<>();
    eltsToAdd.add(11);
    eltsToAdd.add(9);
    eltsToAdd.add(42);
    int expected = 62;
    assertEquals(expected, sum.sumElts(eltsToAdd));
  }

  @Test
  public void nullList() {
    List<Integer> eltsToAdd = null;
    assertEquals(0, sum.sumElts(eltsToAdd));
  }
}

/*

  Create different tests where you
  with multiple elements in it
  with a null
  Run them
  Fix your code if needed*/
