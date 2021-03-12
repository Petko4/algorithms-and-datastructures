package tech.petko4.algorithmsanddatastructures.recursion;

import java.awt.BasicStroke;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;
/**
 * The class displays pair of squares where the inner square is rotated 45 degrees to the outer square.
 * The pair of squares are drew via recursion.
 * @author Petko4
 *  
 */
public class Squares extends Canvas{

    private static final long serialVersionUID = 7183110280305455677L;
    
    private static final int WIDTH = 800;
    private static final int HEIGHT = 800;
    
    //Set window and canvas
    public static void main(String[] args) {
        JFrame frame = new JFrame("SQUARES");
        Canvas canvas = new Squares();
        canvas.setSize(WIDTH,HEIGHT);
        canvas.setBackground(Color.WHITE);
        frame.add(canvas);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        
    }

    @Override
    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(Color.ORANGE);
        g2.setStroke(new BasicStroke(5));
        drawSquares(g2, 5, 0, 0, WIDTH - 2);
    }
    
    /**
     * 
     * @param g - Graphics object for drawing
     * @param n - number of "square pairs" 
     * @param x - x starting point
     * @param y - y starting point
     * @param length - length of a square side
     */
    private void drawSquares(Graphics g, int n, int x, int y, int length ) {
        if(n > 0) { 
            g.drawLine(x, y, x + length, y);
            g.drawLine(x + length, y, x + length, y + length);
            g.drawLine(x + length, y + length, x, y + length);
            g.drawLine(x, y + length, x, y + length / 2);
            g.drawLine(x, y + length / 2, x + length / 2, y + length);
            g.drawLine(x + length / 2, y + length, x + length, y + length/2);
            g.drawLine(x + length, y + length/2, x + length / 2, y);
            g.drawLine(x + length / 2, y, x + length / 4, y + length / 4);
            drawSquares(g, n - 1, x + length / 4, y + length / 4, length / 2); //recursive call
            g.drawLine(x + length / 4, y + length / 4, x, y + length / 2);
            g.drawLine(x, y + length / 2, x , y);
        }
    }
    
    

}
