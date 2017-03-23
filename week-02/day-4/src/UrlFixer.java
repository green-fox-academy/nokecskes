/**
 * Created by Connor on 2017.03.23..
 */
public class UrlFixer {

  public static void main(String... args) {

    // Accidentally I got the wrong URL for a funny subreddit. It's probably "odds" and not "bots"
    // Also, the URL is missing a crutial component, find out what it is and insert it too!
    // Try to solve it more than once using different String functions!

    String url = "https//www.reddit.com/r/nevertellmethebots";

    url = url.replace("bots", "odds");

    int toCut = url.indexOf("/");
    String url1 = url.substring(0, (toCut - 1));
    String url2 = url.substring(toCut);

    url = url1.concat(":");
    url = url.concat(url2);

    System.out.println(url);

  }

}
