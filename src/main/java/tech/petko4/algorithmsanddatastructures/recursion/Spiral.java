package tech.petko4.algorithmsanddatastructures.recursion;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

/**
 * The class displays spiral which is drew via recursion.
 * 
 * @author Petko4
 *
 */
public class Spiral extends Canvas {

    private static final long serialVersionUID = 4629044331461303592L;

    private static final int WIDTH = 800;
    private static final int HEIGHT = 800;

    public static void main(String[] args) {
        JFrame frame = new JFrame("MAGIC SPIRAL");
        Canvas canvas = new Spiral();
        canvas.setSize(WIDTH, HEIGHT);
        canvas.setBackground(Color.BLACK);
        frame.add(canvas);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(Color.GREEN);
        drawSpiral(g, 10, WIDTH, 0, 0);
    }

    // Recursion usage
    private void drawSpiral(Graphics g, int space, int lineLength, int startX, int startY) {
        if (space >= lineLength) {
            return;
        } else {
            g.drawLine(startX, startY, startX + lineLength, startY);
            g.drawLine(startX + lineLength, startY, startX + lineLength, startY + lineLength);
            g.drawLine(startX + lineLength, startY + lineLength, startX + space, startY + lineLength);
            g.drawLine(startX + space, startY + lineLength, startX + space, startY + space);
            drawSpiral(g, space, lineLength - space - space, startX + space, startY + space);
        }
    }

}
