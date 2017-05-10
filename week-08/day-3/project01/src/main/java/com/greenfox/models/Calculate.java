package com.greenfox.models;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by Connor on 2017.05.10..
 */
public class Calculate {

  private Object result;

  public Calculate(int until, String what) {
    if (what.equals("sum")) {
      this.result = sum(until);
    } else if (what.equals("factor")) {
      this.result = factor(until);
    }
  }

  public Calculate(ArrayList<Integer> numbers, String what) {
    if (what.equals("sum")) {
      sumArray(numbers);
    } else if (what.equals("multiply")) {
      multiplyArray(numbers);
    } else if (what.equals("double")) {
      doubleArray(numbers);
    }
  }

  public Object getResult() {
    return result;
  }

  private int sum(int until) {
    if (until == 1) {
      return 1;
    }
    return until + sum(until - 1);
  }

  private int factor(int until) {
    if (until == 1) {
      return 1;
    }
    return until * factor(until - 1);
  }

  private void sumArray(ArrayList<Integer> numbers) {
    int sum = 0;
    for (Integer number : numbers) {
      sum += number;
    }
    result = new Integer(sum);
  }

  private void multiplyArray(ArrayList<Integer> numbers) {
    int multiple = 1;
    for (Integer number : numbers) {
      multiple *= number;
    }
    result = new Integer(multiple);
  }

  private void doubleArray(ArrayList<Integer> numbers) {
    ArrayList<Integer> doubled = new ArrayList<>();
    for (Integer number : numbers) {
      doubled.add(number * 2);
    }
    result = doubled;
  }
}
