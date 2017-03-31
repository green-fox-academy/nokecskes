/**
 * Created by Connor on 2017.03.31..
 */

import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class SquareGrid {

  public static void mainDraw(Graphics graphics){
    int size = 600;
    squareFractal(size / 4,  size / 4, size / 2, graphics);
  }

  public static void squareFractal(int startX, int startY, int squareSize, Graphics graphics) {
    if(squareSize < 10) {
      return;
    }

    graphics.drawRect(startX, startY, squareSize, squareSize);

    squareFractal(startX - (squareSize / 4), startY - (squareSize / 4), squareSize / 2, graphics);
    squareFractal(startX - (squareSize / 4), startY + (squareSize / 4) * 3, squareSize / 2, graphics);
    squareFractal(startX + (squareSize / 4) * 3, startY - (squareSize / 4), squareSize / 2, graphics);
    squareFractal(startX + (squareSize / 4) * 3, startY + (squareSize / 4) * 3, squareSize / 2, graphics);
  }


  //    Don't touch the code below
  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setSize(new Dimension(620, 643));
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
