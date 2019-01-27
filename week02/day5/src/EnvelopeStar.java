import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class EnvelopeStar {

    public static void mainDraw(Graphics graphics) {

        graphics.setColor(Color.GREEN);
        graphics.drawLine(160, 5, 160, 315);

        int xTengely = 160;
        int yTengely = 150;
        int xTengely2 = 10;
        int yTengely2 = 160;
        int yDirection = 10;

        for (int i = 0; i < 15; i++) {

            graphics.drawLine(xTengely, yTengely2, xTengely2, yTengely);
            graphics.drawLine(xTengely, yTengely2 + yDirection, xTengely2,yTengely );
            graphics.drawLine(xTengely, yTengely2+ yDirection, 320-xTengely2, yTengely );

            yTengely2 -= 10;
            xTengely2 += 10;
            yDirection += 20;

            graphics.drawLine(xTengely, yTengely2, 320-xTengely2, yTengely);

        }




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