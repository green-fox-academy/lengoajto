import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlay {
    public static void mainDraw(Graphics graphics) {
        // Create a line drawing function that takes 3 parameters:
        // The x and y coordinates of the line's starting point and the graphics
        // and draws a line from that point to the center of the canvas.
        // Draw 3 lines with that function. Use loop for that.

        int blueStartPosition = 64;
        int blueEndPosition = 20;
        drawBluelines(blueStartPosition, blueEndPosition, graphics);

        int greenStartPosition = 20;
        int greenEndposition = 20;
        drawGreenLines(greenStartPosition, greenEndposition, graphics);

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

    public static void drawBluelines(int x, int y, Graphics graphics) {
        for (int i = 0; i < 14; i++) {

            graphics.setColor(Color.BLUE);
            graphics.drawLine(x, 5, 315, y);

            x += 20;
            y += 20;


        }

    }

    public static void drawGreenLines(int z, int q, Graphics graphics) {


        for (int i = 0; i <= 14; i++) {

            graphics.setColor(Color.GREEN);
            graphics.drawLine(5, q, z, 315);

            z += 20;
            q += 20;
        }
    }
}




