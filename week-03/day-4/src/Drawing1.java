/**
 * Created by Connor on 2017.03.30..
 */
import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Drawing1 {

  public static void mainDraw(Graphics graphics){
    // reproduce the nice image :)

    int size = 300;

    graphics.setColor(Color.yellow);
    graphics.fillRect(0,0, 320, 343);

    graphics.setColor(Color.black);
    fractalLines(0, 0, size, graphics);
  }

  public static void drawlines(int topleftX, int topleftY, int size, Graphics graphics) {
    graphics.drawLine(topleftX + (size / 3) , topleftY, topleftX + (size / 3), topleftY + size);
    graphics.drawLine(topleftX + (size / 3) * 2, topleftY, topleftX + (size / 3) * 2, topleftY + size);
    graphics.drawLine(topleftX, topleftY + (size / 3), topleftX + size, topleftY + (size / 3));
    graphics.drawLine(topleftX, topleftY + (size / 3) * 2, topleftX + size, topleftY + (size / 3) * 2);
  }

  public static void fractalLines(int topleftX, int topleftY, int size, Graphics graphics) {
    if(size < 1) {
      return;
    }

    drawlines(topleftX + (size / 3), topleftY, (size / 3), graphics);
    drawlines(topleftX + (size / 3), topleftY + (size / 3) * 2, (size / 3), graphics);
    drawlines(topleftX, topleftY + (size / 3), (size / 3), graphics);
    drawlines(topleftX + (size / 3) * 2, topleftY + (size / 3), (size / 3), graphics);
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
