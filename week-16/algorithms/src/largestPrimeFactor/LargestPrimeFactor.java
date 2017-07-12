package largestPrimeFactor;

/*
Largest Prime Factor
The prime factors of 13195 are 5, 7, 13 and 29.
What is the largest prime factor of the number 600851475143 ?
 */

public class LargestPrimeFactor {

  public static void main(String[] args) {
    long factorOf = 600851475143L;
    System.out.println(findLargestPrimeFactor(factorOf));
  }

  public static long findLargestPrimeFactor(long factorOf) {
    long currentFactor = 2L;
    do {
      for (long i = currentFactor; i < factorOf; i++) {
        if (factorOf % i == 0) {
          factorOf = factorOf / i;
          currentFactor = i + 1;
        }
      }
    } while (!isPrime(factorOf));
    return factorOf;
  }

  public static boolean isPrime(long number) {
    for (int i = 2; i < number; i++) {
      if (number % i == 0) {
        return false;
      }
    }
    return true;
  }

}
