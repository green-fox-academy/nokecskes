package multiples;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MultiplesTest {

  Multiples multiples = new Multiples();

  @Test
  public void multipleBelow10() {
    int sumBelow = 10;
    int expectedSum = 23;
    assertEquals(expectedSum, multiples.sumOfMultiplesOF3And5(sumBelow));
  }

  @Test
  public void multipleBelow1000() {
    int sumBelow = 1000;
    int expectedSum = 233168;
    assertEquals(expectedSum, multiples.sumOfMultiplesOF3And5(sumBelow));
  }


}