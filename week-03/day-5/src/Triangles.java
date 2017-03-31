/**
 * Created by Connor on 2017.03.31..
 */
import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Triangles {

  public static void mainDraw(Graphics graphics){
    int canvasSize = 600;
    drawTriangleFractal(0, 0, canvasSize, graphics);
  }

  public static void drawTriangleFractal(int startX, int startY, int size, Graphics graphics) {
    if(size < 5) {
      return;
    }

    int[] pointX = {startX, startX + size, startX + (size / 2)};
    int[] pointY = {startY, startY, startY + size};
    graphics.drawPolygon(pointX, pointY, 3);

    drawTriangleFractal(startX, startY, size / 2, graphics);
    drawTriangleFractal(startX + (size / 2), startY, size / 2, graphics);
    drawTriangleFractal(startX + (size / 4), startY + (size / 2), size / 2, graphics);
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
