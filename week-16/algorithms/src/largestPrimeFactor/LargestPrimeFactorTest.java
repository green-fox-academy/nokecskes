package largestPrimeFactor;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LargestPrimeFactorTest {

  LargestPrimeFactor largestPrimeFactor = new LargestPrimeFactor();

  @Test
  public void largestPrimeFactorExample1() {
    long factorOf = 13195L;
    long expectedFactor = 29;
    assertEquals(expectedFactor, largestPrimeFactor.findLargestPrimeFactor(factorOf));
  }

  @Test
  public void largestPrimeFactorExample2() {
    long factorOf = 600851475143L;
    long expectedFactor = 6857;
    assertEquals(expectedFactor, largestPrimeFactor.findLargestPrimeFactor(factorOf));
  }

}