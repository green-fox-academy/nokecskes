import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by Connor on 2017.03.23..
 */
public class TakesLonger {

  public static void main(String... args){

    // When saving this quote a disk error has occured. Please fix it.
    // Add "always takes longer than" to the StringBuilder (quote) between the words "It" and "you"
    // Using pieces of the quote variable (instead of just redefining the string)

    String quote = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";

    String toAdd = "always takes longer than ";

    int startFrom = quote.indexOf("It") + 3;

    String qoute1 = quote.substring(0, startFrom);
    String qoute2 = quote.substring(startFrom);

    quote = qoute1.concat(toAdd);
    quote = quote.concat(qoute2);

    System.out.println(quote);

  }

}
