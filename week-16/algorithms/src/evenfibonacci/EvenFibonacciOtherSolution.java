package evenfibonacci;

public class EvenFibonacciOtherSolution {

  public static void main(String[] args) {
    int sumOfEvenFibonaccis = sumOfEvenFibonaccis();
    System.out.println(sumOfEvenFibonaccis);
  }

  public static int sumOfEvenFibonaccis() {
    int max = 4000000;
    int sum = 0;
    int evenValueBeforeCurrent = 0;
    int currentEvenValue = 2;
    do{
      sum = currentEvenValue;
      currentEvenValue = 4 * currentEvenValue + evenValueBeforeCurrent;
    }while(currentEvenValue < max);
    return sum;
  }

}
