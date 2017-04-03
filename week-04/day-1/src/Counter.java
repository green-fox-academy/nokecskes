/**
 * Created by Connor on 2017.04.03..
 */
public class Counter {

 /* Create Counter class
  which has an integer field value
    when creating it should have a default value 0 or we can specify it when creating
  we can add(number) to this counter another whole number
  or we can add() without parameters just increasing the counter's value by one
  and we can get() the current value
  also we can reset() the value to the initial value*/

  int number;
  int currentValue;

  public Counter() {
    number = 0;
    currentValue = number;
  }

  public Counter(int number) {
    this.number = number;
    currentValue = this.number;
  }

  public void add(int numberToAdd) {
    currentValue += numberToAdd;
  }

  public void add() {
    currentValue++;
  }

  public int get() {
    return currentValue;
  }

  public void reset() {
    currentValue = number;
  }
}
