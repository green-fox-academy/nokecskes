package com.greenfoxacademy.springstart.controllers;

import java.util.ArrayList;
import java.util.Arrays;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Connor on 2017.05.02..
 */
@Controller
public class HellloLanguagesWebController {

  String[] hellos = {"Mirëdita", "Ahalan", "Parev", "Zdravei", "Nei Ho", "Dobrý den", "Ahoj",
          "Goddag", "Goede dag, Hallo", "Hello", "Saluton", "Hei", "Bonjour",
          "Guten Tag", "Gia'sou", "Aloha", "Shalom", "Namaste", "Namaste", "Jó napot", "Halló",
          "Helló", "Góðan daginn", "Halo", "Aksunai", "Qanuipit", "Dia dhuit",
          "Salve", "Ciao", "Kon-nichiwa", "An-nyong Ha-se-yo", "Salvëte", "Ni hao", "Dzien' dobry",
          "Olá", "Bunã ziua", "Zdravstvuyte", "Hola", "Jambo", "Hujambo", "Hej",
          "Sa-wat-dee", "Merhaba", "Selam", "Vitayu", "Xin chào", "Hylo", "Sut Mae",
          "Sholem Aleychem", "Sawubona"};
  ArrayList<Hello> listOfHellos = new ArrayList<Hello>();


  @RequestMapping("/web/helloLanguages")
  public String greetInDifferentLanguages(Model model) {
    createHelloList();
    String hellosInLines = arrangeHellos(hellos);
    model.addAttribute("hello", hellosInLines);
    return "helloLanguages";
  }

  private static void createHelloList() {


  }

  private static String arrangeHellos(String[] hellos) {
    String hellosInLines = "";
    for (int i = 0; i < hellos.length; i++) {
      hellosInLines += hellos[i] + "! ";
    }
    return hellosInLines;
  }

  /*private static int randomNumberGenerator(int min, int max) {
    int random = min + (int) (Math.random() * max);
    return random;
  }

  private static String generateRandomColor() {
    String randomColor = "#";
    String[] hexes = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "a", "b", "c", "d", "f"};
    for (int i = 0; i < 6; i++) {
      randomColor += hexes[randomNumberGenerator(0, hexes.length)];
    }
    return randomColor;
  }*/

}
