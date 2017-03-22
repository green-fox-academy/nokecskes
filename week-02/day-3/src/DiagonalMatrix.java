/**
 * Created by Connor on 2017.03.22..
 */

import java.util.Scanner;

public class DiagonalMatrix {

    public static void main(String[] args) {

        // - Create (dynamically) a two dimensional array
        //   with the following matrix. Use a loop!
        //
        //   1 0 0 0
        //   0 1 0 0
        //   0 0 1 0
        //   0 0 0 1
        //
        // - Print this two dimensional array to the output

        int size = inputNr();

        int[][] matrix = new int[size][size];

        String padding = "0";
        String line = "1";

        for (int i = 0; i < size; i++){
            for (int j = 0; j < size; j++){
                if(j == i) {
                    System.out.print(line + " ");
                }
                else{
                    System.out.print(padding + " ");
                }
            }
            System.out.print("\n");
        }
    }

    public static int inputNr (){

            Scanner scanner = new Scanner(System.in);
            int usersNr = 0;

            do {
                System.out.println("Please give me a positive number: ");
                usersNr = scanner.nextInt();
            } while(usersNr < 1);

            return usersNr;

    }

}
