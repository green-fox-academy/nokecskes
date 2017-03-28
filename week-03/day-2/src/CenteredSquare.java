/**
 * Created by Connor on 2017.03.28..
 */
import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class CenteredSquare {

  public static void mainDraw(Graphics graphics){
    // draw a green 10x10 square to the canvas' center.

    int squareSize = 10;
    graphics.setColor(Color.green);
    graphics.drawRect(150 - (squareSize / 2), 150 - (squareSize / 2), squareSize, squareSize);
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


/* First, longer version:
    int squareSize = 10;
    int halfEdgeOfSquare = squareSize / 2;

    graphics.setColor(Color.green);
    graphics.drawLine(150 - halfEdgeOfSquare, 150 - halfEdgeOfSquare, 150 + halfEdgeOfSquare, 150 - halfEdgeOfSquare);
    graphics.drawLine(150 + halfEdgeOfSquare, 150 - halfEdgeOfSquare, 150 + halfEdgeOfSquare, 150 + halfEdgeOfSquare);
    graphics.drawLine(150 + halfEdgeOfSquare, 150 + halfEdgeOfSquare, 150 - halfEdgeOfSquare, 150 + halfEdgeOfSquare);
    graphics.drawLine(150 - halfEdgeOfSquare, 150 + halfEdgeOfSquare, 150 - halfEdgeOfSquare, 150 - halfEdgeOfSquare);

 */