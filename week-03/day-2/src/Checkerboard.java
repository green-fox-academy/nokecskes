/**
 * Created by Connor on 2017.03.28..
 */
import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Checkerboard {

  public static final int  sizeOfSquares = 20;

  public static void mainDraw(Graphics graphics){
    // fill the canvas with a checkerboard pattern.

    int topleftX = 10;
    int topleftY = 10;

    for (int i = 0; i < 8 ; i++) {
      if ((i % 2) == 0){
        drawCheckLineOdd(topleftX, topleftY, graphics);
        topleftY += sizeOfSquares;
      }
      else{
        drawCheckLineEven(topleftX, topleftY, graphics);
        topleftY += sizeOfSquares;
      }
    }
  }

  public static void drawCheckLineOdd(int startX, int startY, Graphics graphics){
    for (int i = 0; i < 8 ; i++) {
      graphics.drawRect(startX, startY, sizeOfSquares, sizeOfSquares);
      if((i % 2) == 0){
        graphics.fillRect(startX, startY, sizeOfSquares, sizeOfSquares);
      }
      startX +=sizeOfSquares;
    }
  }

  public static void drawCheckLineEven(int startX, int startY, Graphics graphics){
    for (int i = 0; i < 8 ; i++) {
      graphics.drawRect(startX, startY, sizeOfSquares, sizeOfSquares);
      if((i % 2) != 0){
        graphics.fillRect(startX, startY, sizeOfSquares, sizeOfSquares);
      }
      startX +=sizeOfSquares;
    }
  }


  //    Don't touch the code below
  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setSize(new Dimension(320, 343));
    jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    jFrame.add(new ImagePanel());
    jFrame.setLocationRelativeTo(null);
    jFrame.setVisible(true);
  }
  static class ImagePanel extends JPanel{
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      mainDraw(graphics);

    }
  }

}