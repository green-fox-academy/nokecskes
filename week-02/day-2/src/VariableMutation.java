/**
 * Created by Connor on 2017.03.21..
 */


public class VariableMutation {
    public static void main(String[] args) {
        int a = 3;
        // make it bigger by 10
        a += 10;
        System.out.println(a);

        int b = 100;
        // make it smaller by 7
        b -= 7;
        System.out.println(b);

        int c = 44;
        // please double c's value
        c *= 2;
        System.out.println(c);

        int d = 125;
        // please divide by 5 d's value
        d /= 5;
        System.out.println(d);

        int e = 8;
        // please cube of e's value
        double eCube = Math.pow((double)e, 3);
        System.out.println((int)eCube);

        int f1 = 123;
        int f2 = 345;
        // tell if f1 is bigger than f2 (print as a boolean)
        boolean comp = f1 > f2;
        System.out.println(comp);


        int g1 = 350;
        int g2 = 200;
        // tell if the double of g2 is bigger than g1 (print as a boolean)
        boolean comp2 = (2 * g2) > g1;
        System.out.println(comp2);

        long h = 1357988018575474l;
        // tell if it has 11 as a divisor (print as a boolean)
        boolean divisor = (h % 11) == 0;
        System.out.println(divisor);

        int i1 = 10;
        int i2 = 3;
        // tell if i1 is higher than i2 squared and smaller than i2 cubed (print as a boolean)
        boolean comp3 = i1 > Math.pow((double)i2, 2) && i1 < Math.pow((double)i2, b);
        System.out.println(comp3);

        int j = 1521;
        int x = 3;
        int y = 5;
        // tell if j is dividable by 3 or 5 (print as a boolean)
        boolean comp4 = (j % x) == 0 || (j % y) == 0;
        System.out.println(comp4);

        String k = "Apple";
        //fill the k variable with its cotnent 4 times
        for (int i = 0; i < 2; i++){
            k +=k;
        }
        System.out.println(k);
    }
}
