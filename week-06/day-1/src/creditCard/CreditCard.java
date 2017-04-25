package creditCard;

/**
 * Created by Connor on 2017.04.25..
 */
public class CreditCard implements CreditCardy {

  private String nameCardholder;
  private String codeAccount;
  private int sumCVV;

  public CreditCard(int nThCard) {
    nameCardholder = "ABC" + nThCard;
    codeAccount = "";
    generateCodeaccount();
    sumCVV = cumeSumCVV(codeAccount);
  }

  private void generateCodeaccount() {
    for (int i = 0; i < 16; i++) {
      codeAccount += randomNumberGenerator();
    }
  }

  private int randomNumberGenerator() {
    int random = (int) (Math.random() * 10);
    return random;
  }

  @Override
  public int getSumCVV() {
    return sumCVV;
  }

  @Override
  public String getNameCardholder() {
    return nameCardholder;
  }

  @Override
  public String getCodeAccount() {
    return codeAccount;
  }

  @Override
  public int cumeSumCVV(String codeAccount) {
    int sumCVV = 0;
    for (int i = 0; i < codeAccount.length(); i++) {
      sumCVV += Character.getNumericValue(codeAccount.charAt(i));
    }
    return sumCVV;
  }

  @Override
  public String toString() {
    String creditCard = String.format("Name=%s CC#=%s CVV=%d", nameCardholder, codeAccount, sumCVV);
    return creditCard;
  }
}
