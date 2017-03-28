/**
 * Created by Connor on 2017.03.28..
 */
import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ColoredBox {

  public static void mainDraw(Graphics graphics){
    // draw a box that has different colored lines on each edge.

    graphics.setColor(Color.green);
    graphics.drawLine(25, 25, 125, 25);

    graphics.setColor(Color.blue);
    graphics.drawLine(125, 25, 125, 125);

    graphics.setColor(Color.red);
    graphics.drawLine(125, 125, 25, 125);

    graphics.setColor(Color.yellow);
    graphics.drawLine(25, 125, 25, 25);
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
