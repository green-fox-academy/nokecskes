import static javax.swing.JFrame.EXIT_ON_CLOSE;

import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SierpinskyCarpetOtherSolution {

  public static void mainDraw(Graphics graphics){
    int size = 600;
    drawSquare(size / 3, size / 3, size / 3, graphics);
  }

  public static void drawSquare(int topLeftX, int topLeftY, int squareSize, Graphics graphics) {
    if(squareSize < 2) {
      return;
    }

    graphics.fillRect(topLeftX, topLeftY, squareSize, squareSize);

    drawSquare(topLeftX - (squareSize / 3) * 2, topLeftY - (squareSize / 3) * 2,squareSize / 3, graphics);
    drawSquare(topLeftX - (squareSize / 3) * 2, topLeftY + (squareSize / 3), squareSize / 3, graphics);
    drawSquare(topLeftX - (squareSize / 3) * 2, topLeftY + (squareSize / 3) * 4,squareSize / 3, graphics);

    drawSquare(topLeftX + (squareSize / 3), topLeftY - (squareSize / 3) * 2, squareSize / 3, graphics);
    drawSquare(topLeftX + (squareSize / 3), topLeftY + (squareSize / 3) * 4, squareSize / 3, graphics);

    drawSquare(topLeftX + (squareSize / 3) * 4, topLeftY - (squareSize / 3) * 2, squareSize / 3, graphics);
    drawSquare(topLeftX + (squareSize / 3) * 4, topLeftY + (squareSize / 3), squareSize / 3, graphics);
    drawSquare(topLeftX + (squareSize / 3) * 4, topLeftY + (squareSize / 3) * 4, squareSize / 3, graphics);
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