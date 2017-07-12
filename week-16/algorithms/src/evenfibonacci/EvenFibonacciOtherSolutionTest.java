package evenfibonacci;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EvenFibonacciOtherSolutionTest {

  @Test
  public void sumOfFirst4MillionEvenFibonacci() {
    EvenFibonacci evenFibonacci = new EvenFibonacci();
    int sumOfEvenFibonaccis = 4613732;
    assertEquals(sumOfEvenFibonaccis, evenFibonacci.sumOfEvenFibonaccis());
  }

}