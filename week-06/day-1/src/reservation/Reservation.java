package reservation;

/**
 * Created by Connor on 2017.04.25..
 */
public class Reservation implements Reservationy {

  private String dowBooking;
  private String codeBooking;

  public Reservation () {
    dowBooking = generateDowBooking();
    codeBooking = generateCodeBooking();
  }

  public String generateDowBooking() {
    String[] daysOfWeek = {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};
    return daysOfWeek[randomNumberGenerator(0, 6)];
  }

  @Override
  public String getDowBooking() {
    return dowBooking;
  }

  public String generateCodeBooking() {
    int codeLength = 8;
    int[] codePattern = generateCodePattern(8);
    String code = generateRandomCode(codePattern);
    return code;
  }

  public int[] generateCodePattern(int codeLength) {
    int[] codePattern = new int[8];
    for (int i = 0; i < codeLength; i++) {
      codePattern[i] = randomNumberGenerator(0, 1);
    }
    return codePattern;
  }

  public String generateRandomCode(int[] codePattern) {
    String randomCode = "";
    int min = 0;
    int max = 0;
    for (int i = 0; i < codePattern.length; i++) {
      if (codePattern[i] == 0) {
        min = 48;
        max = 57;
      } else {
        min = 65;
        max = 90;
      }
      randomCode += String.valueOf(Character.toChars(randomNumberGenerator(min, max)));
    }
    return randomCode;
  }

  @Override
  public String getCodeBooking() {
   return codeBooking;
  }

  public int randomNumberGenerator(int min, int max) {
    int random = min + (int) (Math.random() * (max - min + 1));
    return random;
  }

  @Override
  public String toString() {
    String booking = String.format("Booking# %s for %s", codeBooking, dowBooking);
    return booking;
  }
}
