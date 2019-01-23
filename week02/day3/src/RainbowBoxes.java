import javax.swing.*;

import java.awt.*;

import static java.awt.image.ImageObserver.HEIGHT;
import static java.awt.image.ImageObserver.WIDTH;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class RainbowBoxes {
    public static void mainDraw(Graphics graphics) {

        Color[] rainbowColors = new Color[] {Color.RED, Color.ORANGE, Color.YELLOW,
                Color.GREEN, Color.BLUE, new Color(128, 0, 128),
                new Color(238, 130, 238)};
        for (int i = 7; i >= 1; i--) {
            drawingTheSquares(graphics, i * 300, rainbowColors[i - 1]);

        }

        }
        public static void drawingTheSquares(Graphics graphics, int size, Color fillcolor) {
            graphics.setColor(fillcolor);
            graphics.fillRect(WIDTH/2 - size/10/2, HEIGHT/2 - size/10/2, size/10, size/10);
        }


    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 320;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImagePanel panel = new ImagePanel();
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        jFrame.add(panel);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.pack();
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }
}