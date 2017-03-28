/**
 * Created by Connor on 2017.03.28..
 */
import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class PurpleSteps {

  public static void mainDraw(Graphics graphics){
    // reproduce this:
    // [https://github.com/greenfox-academy/teaching-materials/blob/master/exercises/drawing/purple-steps/r3.png]

    int size = 10;

    for (int i = 0; i < 19 ; i++) {
      int topLeft = 10 + (i * 10);
      drawColoredSquare(topLeft, size, graphics);
    }
  }

  public static void drawColoredSquare(int topLeft, int squareSize, Graphics graphics) {
    graphics.setColor(new Color(186,85,211));
    graphics.fillRect(topLeft, topLeft, squareSize, squareSize);
    graphics.setColor(Color.black);
    graphics.drawRect(topLeft, topLeft, squareSize, squareSize);
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
