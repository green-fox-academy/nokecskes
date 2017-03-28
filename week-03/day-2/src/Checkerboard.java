/**
 * Created by Connor on 2017.03.28..
 */
import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

final public stat

public class Checkerboard {

  public static void mainDraw(Graphics graphics){
    // fill the canvas with a checkerboard pattern.

    int sizeOfSquares = 10;
    int topleftX = 0;
    int topleftY = 0;

    for (int i = 0; i < 8 ; i++) {
      if ((i % 2) == 0){
        drawCheckLineOdd(sizeOfSquares, topleftX, topleftY, graphics);
        topleftY += 10;
      }
      else{
        drawCheckLineEven(sizeOfSquares, topleftX, topleftY, graphics);
        topleftY += 10;
      }
    }
  }

  public static void drawCheckLineOdd(int sizeOfSquares, int startX, int startY, Graphics graphics){
    for (int i = 0; i < 8 ; i++) {
      graphics.drawRect(startX, startY, sizeOfSquares, sizeOfSquares);
      if((i % 2) == 0){
        graphics.fillRect(startX, startY, sizeOfSquares, sizeOfSquares);
      }
      startX +=10;
    }
  }

  public static void drawCheckLineEven(int sizeOfSquares, int startX, int startY, Graphics graphics){
    for (int i = 0; i < 8 ; i++) {
      graphics.drawRect(startX, startY, sizeOfSquares, sizeOfSquares);
      if((i % 2) != 0){
        graphics.fillRect(startX, startY, sizeOfSquares, sizeOfSquares);
      }
      startX +=10;
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