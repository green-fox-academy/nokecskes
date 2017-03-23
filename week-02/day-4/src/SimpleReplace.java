import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by Connor on 2017.03.23..
 */
public class SimpleReplace {

  public static void main(String... args) {

    // I would like to replace "dishwasher" with "galaxy" in this example, but it has a problem.
    // Please fix it for me!
    // Expected ouput: In a galaxy far far away

    String example = "In a dishwasher far far away";
    example = example.replace("dishwasher", "galaxy");
    System.out.println(example);

  }

}


/* Or another way to implement replace and print at the same line:

    System.out.println(example.replace("dishwasher", "galaxy"));

*/
