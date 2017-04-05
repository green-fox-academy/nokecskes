package sum;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Connor on 2017.04.05..
 */
public class Sum {

  public int sumElts(List<Integer> eltsToSum) {
    int sum = 0;
    if(eltsToSum != null){
      for (int element : eltsToSum) {
        sum += element;
      }
    }
    return sum;
  }

  public static void main(String[] args) {
    ArrayList<Integer> myList = new ArrayList<>();
    myList.add(1);
    myList.add(3);
    myList.add(6);
    Sum sum = new Sum();
    int sumOfElts = sum.sumElts(myList);
    System.out.println(sumOfElts);
  }
}
/*

  Create a sum method in your class which has an ArrayList of Integers as parameter
        It should return the sum of the elements in the list
*/
