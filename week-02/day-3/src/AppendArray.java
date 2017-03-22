import java.util.Arrays;

/**
 * Created by Connor on 2017.03.22..
 */
public class AppendArray {

    public static void main(String[] args) {
        // - Create an array variable named `nimals`
        //   with the following content: `["kuty", "macs", "cic"]`
        // - Add all elements an `"a"` at the end

        String[] nimals = {"kuty", "macsk", "cic"};

        for ( int i = 0; i < nimals.length; i++ ){
            nimals[i] +="a";
        }

        System.out.println(Arrays.toString(nimals));

    }

}
