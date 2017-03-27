/**
 * Created by Connor on 2017.03.25..
 */
public class DrawChessTable {

  public static void main(String[] args) {
    // Crate a program that draws a chess table like this
    //
    // % % % %
    //  % % % %
    // % % % %
    //  % % % %
    // % % % %
    //  % % % %
    // % % % %
    //  % % % %
    //

    int rowColumn = 8;
    String symbol = "%";
    String space = " ";

    for (int i = 0; i < rowColumn ; i++) {
      if(i % 2 == 0){
        printLine(rowColumn, symbol, space);
      }
      else{
        printLine(rowColumn, space, symbol);
      }
      System.out.println();
    }
  }

  public static void printLine(int length, String firstChar, String secondChar){
    for (int i = 0; i < length ; i++) {
      if(i % 2 == 0){
        System.out.print(firstChar);
      }
      else{
        System.out.print(secondChar);
      }
    }
  }

}
