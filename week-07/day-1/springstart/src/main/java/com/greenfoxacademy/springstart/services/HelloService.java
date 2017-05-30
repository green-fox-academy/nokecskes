package com.greenfoxacademy.springstart.services;

import com.greenfoxacademy.springstart.models.Hello;
import java.util.ArrayList;
import org.springframework.stereotype.Service;

/**
 * Created by K on 2017.05.30..
 */
@Service
public class HelloService {

  final int colorRgbMin = 0;
  final int colorRgbMax = 255;
  final int fontMin = 10;
  final int fontMax = 150;
  final  String[] hellosArray = {"Mirëdita", "Ahalan", "Parev", "Zdravei", "Nei Ho", "Dobrý den", "Ahoj",
      "Goddag", "Goede dag, Hallo", "Hello", "Saluton", "Hei", "Bonjour",
      "Guten Tag", "Gia'sou", "Aloha", "Shalom", "Namaste", "Namaste", "Jó napot", "Halló",
      "Helló", "Góðan daginn", "Halo", "Aksunai", "Qanuipit", "Dia dhuit",
      "Salve", "Ciao", "Kon-nichiwa", "An-nyong Ha-se-yo", "Salvëte", "Ni hao", "Dzien' dobry",
      "Olá", "Bunã ziua", "Zdravstvuyte", "Hola", "Jambo", "Hujambo", "Hej",
      "Sa-wat-dee", "Merhaba", "Selam", "Vitayu", "Xin chào", "Hylo", "Sut Mae",
      "Sholem Aleychem", "Sawubona"};

  public ArrayList<Hello> createHelloList() {
    ArrayList<Hello> hellosList = new ArrayList<Hello>();
    for (String hello : hellosArray) {
      String greeting = setHelloGreeting(hello);
      int red = setHelloColor();
      int green = setHelloColor();
      int blue = setHelloColor();
      int fontSize = setHelloFontSize();
      Hello newHello = new Hello(greeting, red, green, blue, fontSize);
      hellosList.add(newHello);
    }
    return hellosList;
  }

  public String setHelloGreeting(String hello) {
    hello += "! ";
    return hello;
  }

  public int setHelloColor() {
    return randomNumberGenerator(colorRgbMin, colorRgbMax);
  }

  public int setHelloFontSize() {
    return randomNumberGenerator(fontMin, fontMax);
  }

  public int randomNumberGenerator(int min, int max) {
    int random = min + (int) (Math.random() * max);
    return random;
  }

}
