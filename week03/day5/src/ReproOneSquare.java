import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ReproOneSquare {
    public static void mainDraw(Graphics graphics) {

        graphics.setColor(Color.YELLOW);
        graphics.fillRect(0, 0, WIDTH, HEIGHT);
        graphics.setColor(Color.BLACK);
        graphics.drawRect(0, 0, WIDTH, HEIGHT);

        pushSquares(0, 0, WIDTH, graphics);
    }

    public static void pushSquares(int startX, int startY, int sizeOfSquare, Graphics graphics) {

        int newSize = sizeOfSquare / 3;

        graphics.drawRect(startX + newSize, startY, newSize, newSize);
        graphics.drawRect(startX,newSize + startY, newSize, newSize);
        graphics.drawRect((sizeOfSquare - newSize) + startX,startY + newSize, newSize, newSize);
        graphics.drawRect(newSize + startX,(sizeOfSquare - newSize) + startY, newSize, newSize);

        if (newSize != 1) {
            pushSquares(newSize + startX, startY, newSize, graphics);
            pushSquares(startX, newSize+ startY, newSize, graphics);
            pushSquares(startX + newSize *2, startY + newSize, newSize, graphics);
            pushSquares(newSize + startX, startY + newSize * 2, newSize, graphics);
        }
    }


    // Don't touch the code below
    static int WIDTH = 729;
    static int HEIGHT = 729;

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