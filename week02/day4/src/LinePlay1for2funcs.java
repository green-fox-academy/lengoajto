import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlay1for2funcs {
    private static void mainDraw(Graphics graphics) {

        drawlines(20, 5, 310, 25, 5, 20, 25, 310, graphics);

    }

public static void drawlines(int xFrom, int yStart, int xTo, int yTo, int greenXfrom, int greenYfrom, int greenXto, int greenYto, Graphics graphics){


    for (int i = 0; i < 14; i++) {
        graphics.setColor(Color.PINK);
            graphics.drawLine(xFrom, yStart, xTo, yTo);
            yTo += 20;
            xFrom+= 20;

graphics.setColor(Color.GREEN);
            graphics.drawLine(greenXfrom, greenYfrom, greenXto, greenYto);
            greenXto += 20;
            greenYfrom += 20;
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
            this.setBackground(Color.BLACK);
            mainDraw(graphics);
        }
    }



}







