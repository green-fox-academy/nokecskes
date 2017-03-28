/**
 * Created by Connor on 2017.03.28..
 */
import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Checkerboard {

  public static final int  sizeOfSquares = 20;
  public static final int margin = 10;

  public static void mainDraw(Graphics graphics){
    // fill the canvas with a checkerboard pattern.

    int topLeftX = 0;
    int topLeftY = 0;

    for (int i = 0; i < 8; i++) {
      topLeftX = margin;
      topLeftY = margin + (i * sizeOfSquares);
      for (int j = 0; j < 8; j++) {
        drawCheckLine(topLeftX, topLeftY, graphics, i, j);
        topLeftX += sizeOfSquares;
      }
    }
  }

  public static void drawCheckLine(int topLeftX, int topLeftY, Graphics graphics, int row, int column){
    graphics.drawRect(topLeftX, topLeftY, sizeOfSquares, sizeOfSquares);
    int isSquareToFill = (row + column) % 2;
      if( isSquareToFill == 0){
        graphics.fillRect(topLeftX, topLeftY, sizeOfSquares, sizeOfSquares);
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