/**
 * Created by Connor on 2017.03.28..
 */
import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class RainbowBoxFunction {

  public static void mainDraw(Graphics graphics){
    // create a square drawing function that takes 2 parameters:
    // the square size, and the fill color,
    // and draws a square of that size and color to the center of the canvas.
    // create a loop that fills the canvas with rainbow colored squares.

    Color[] rainbowColors = {Color.red, Color.orange, Color.yellow, Color.green, Color.blue, new Color(75,0,130), new Color(238,130,238)}; 
    int squareSize = 0;

    for (int i = 0; i < 7 ; i++){
      squareSize = (7 - i) * 30;
      drawSquare(squareSize, rainbowColors[i], graphics);
    }
  }

  public static void drawSquare(int squareSize, Color color, Graphics graphics) {
    int startPoint = 150 - (squareSize / 2);
    graphics.setColor(color);
    graphics.fillRect(startPoint, startPoint, squareSize, squareSize);
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
