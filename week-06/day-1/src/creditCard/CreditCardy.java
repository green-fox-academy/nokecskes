package creditCard;

/**
 * Created by Connor on 2017.04.25..
 */
public interface CreditCardy {

  int getSumCVV();

  String getNameCardholder();

  String getCodeAccount();

  int cumeSumCVV(String codeAccount); // computes codeAccount checksum

  String toString(); //String.format("Name=%s CC#=%s CVV=%d");
}


