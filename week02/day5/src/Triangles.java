import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Triangles {

    public static void mainDraw(Graphics graphics) {

        graphics.setColor(Color.BLACK);
        int x1 = 10;
        int y1 = 160;
        int x2 = 150;
        int y2 = 10;
        int x2To = 0;

        for (int i = 0; i < 13 ; i++) {
            graphics.drawLine(x1, y1, x2, y2);

            graphics.drawLine(310-x1, y1, x2 -x2To, y2);

            graphics.drawLine(x2, y2, x2-x2To, y2);


            x1 += 20;
            x2 += 10;
            y2 += 10;
            x2To += 20;

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