package apples;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * Created by Connor on 2017.04.05..
 */
class AppleTest {
  String message = "apple";
  Apple apple = new Apple();

  @Test
  public void isApple() {
    assertEquals(message, apple.getApple());
  }


}