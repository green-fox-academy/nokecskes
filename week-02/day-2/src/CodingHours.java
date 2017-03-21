/**
 * Created by Connor on 2017.03.21..
 */
public class CodingHours {
    public static void main(String[] args) {
        // An average Green Fox attendee codes 6 hours daily
        // The semester is 17 weeks long
        int hours = 6;
        int workdays = 5;
        int weeks = 17;
        //
        // Print how many hours is spent with coding in a semester by an attendee,
        // if the attendee only codes on workdays.

        int codingHours = hours * workdays * weeks;
        System.out.println("An attendee spends " + (codingHours) + " hours with coding in a semester.");

        //
        // Print the percentage of the coding hours in the semester if the average
        // work hours weekly is 52
        int codePerWeek = hours * workdays;
        int workHours = 52;

        float percentage = ((float)codePerWeek / (float)workHours) * 100;
        System.out.println("The weekly codehours are " + (Math.round(percentage)) + "% of the weekly workhours.");




    }
}
