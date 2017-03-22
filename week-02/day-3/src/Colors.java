import java.util.Arrays;

/**
 * Created by Connor on 2017.03.22..
 */
public class Colors {

    public static void main(String[] args) {

        // - Create a two dimensional array
        //   which can contain the different shades of specified colors
        // - In `colors[0]` store the shades of green:
        //   `"lime", "forest green", "olive", "pale green", "spring green"`
        // - In `colors[1]` store the shades of red:
        //   `"orange red", "red", "tomato"`
        // - In `colors[2]` store the shades of pink:
        //   `"orchid", "violet", "pink", "hot pink"`


        String[][] colors = {
                {"lime", "forest green", "olive", "pale green", "spring green"},
                {"orange red", "red", "tomato"},
                {"orchid", "violet", "pink", "hot pink"}};


        for (String[] currentRow : colors ){
            for (String currentColumn : currentRow){
                System.out.print(currentColumn + ", ");
            }

            System.out.print("\n");
        }

    }
}
