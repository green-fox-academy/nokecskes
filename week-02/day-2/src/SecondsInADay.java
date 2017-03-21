/**
 * Created by Connor on 2017.03.21..
 */
public class SecondsInADay {
    public static void main(String[] args) {
        int currentHours = 14;
        int currentMinutes = 34;
        int currentSeconds = 42;

        // Write a program that prints the remaining seconds (as an integer) from a
        // day if the current time is represented bt the variables

        int remHoursInSec = (23 - currentHours) * 3600;
        int remMinsInSec = (59 - 34) * 60;
        int remSecs = 60 - currentSeconds;
        int remSecsTotal = remHoursInSec + remMinsInSec + remSecs;

        System.out.println("The remaing seconds: " + remSecsTotal);
    }
}
