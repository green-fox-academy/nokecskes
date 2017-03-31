import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class SierpinskyCarpet {

  public static void mainDraw(Graphics graphics){
    int size = 600;
    drawSquare(size / 2, size / 2, size / 3, graphics);
  }

  public static void drawSquare(int centerX, int centerY, int squareSize, Graphics graphics) {
    if(squareSize < 2) {
      return;
    }

    graphics.fillRect(centerX - squareSize / 2, centerY - squareSize / 2, squareSize, squareSize);

    drawSquare(centerX - squareSize, centerY - squareSize, squareSize / 3, graphics);
    drawSquare(centerX - squareSize , centerY, squareSize / 3, graphics);
    drawSquare(centerX - squareSize, centerY + squareSize, squareSize / 3, graphics);
    drawSquare(centerX, centerY - squareSize, squareSize / 3, graphics);
    drawSquare(centerX, centerY + squareSize, squareSize / 3, graphics);
    drawSquare(centerX + squareSize, centerY - squareSize, squareSize / 3, graphics);
    drawSquare(centerX + squareSize, centerY, squareSize / 3, graphics);
    drawSquare(centerX + squareSize, centerY + squareSize, squareSize / 3, graphics);
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