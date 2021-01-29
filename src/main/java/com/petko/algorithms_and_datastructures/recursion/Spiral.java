package com.petko.algorithms_and_datastructures.recursion;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

/**
 * Class displays spiral which is drew via recursion
 * @author Petko4
 *
 */
public class Spiral extends Canvas {
	
	private static final int WIDTH = 800;
	private static final int HEIGHT = 800;
	
	public static void main(String[] args) {
		JFrame frame = new JFrame("MAGIC SPIRAL");
		Canvas canvas = new Spiral();
		canvas.setSize(WIDTH,HEIGHT);
		canvas.setBackground(Color.BLACK);
		frame.add(canvas);
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
	
	public void paint(Graphics g) {
		g.setColor(Color.GREEN);
		paintSpiral(g, 10, WIDTH, 0, 0);
	}
	
	
	//Recursion usage
	private void paintSpiral(Graphics g, int space, int lineLength, int startX, int startY) {
		if(space >= lineLength) {
			return;
		} else {
			g.drawLine(startX, startY, startX + lineLength, startY);
			g.drawLine(startX + lineLength, startY, startX + lineLength, startY + lineLength);
			g.drawLine(startX + lineLength, startY + lineLength, startX + space, startY + lineLength);
			g.drawLine(startX + space, startY + lineLength, startX + space, startY + space);
			paintSpiral(g, space, lineLength - space - space, startX + space, startY + space);
		}
	}

}
