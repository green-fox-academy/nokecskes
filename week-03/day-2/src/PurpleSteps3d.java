/**
 * Created by Connor on 2017.03.28..
 */
import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class PurpleSteps3d {

  public static void mainDraw(Graphics graphics){
    // reproduce this:
    // [https://github.com/greenfox-academy/teaching-materials/blob/master/exercises/drawing/purple-steps-3d/r4.png]

    int topleft = 10;
    int size = 0;

    for (int i = 0; i < 6 ; i++) {
      size += 10;
      drawColoredSquare(topleft, size, graphics);
      topleft += size;
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