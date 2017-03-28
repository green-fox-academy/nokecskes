/**
 * Created by Connor on 2017.03.28..
 */
import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FourRectangles {

  public static void mainDraw(Graphics graphics) {
    // draw four different size and color rectangles.

    for (int i = 0; i < 4 ; i++) {
      graphics.setColor(new Color(randomColorGenerator(), randomColorGenerator(), randomColorGenerator()));
      graphics.drawRect(randomSizeGenerator(), randomSizeGenerator(), randomSizeGenerator(), randomSizeGenerator());
    }


  }

  public static int randomColorGenerator() {
    int random = (int) (Math.random() * 256);
    return random;
  }

  public static int randomSizeGenerator() {
    int random = (int) (Math.random() * 301);
    return random;
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
