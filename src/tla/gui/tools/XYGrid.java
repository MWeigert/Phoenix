/**
 * 
 */
package tla.gui.tools;

import java.awt.Graphics;

import javax.swing.JPanel;

/**
 * @author Tingle Driftwood (Guk)
 * @version 1.0
 */
public class XYGrid extends JPanel {

	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		// y-axes
		g.drawLine(30, 25, 30, 475);
		g.drawLine(30, 25, 25, 30);
		g.drawLine(30, 25, 35, 30);
		for (int i = 1; i <= 9; i++) {
			g.drawLine(25, 470 -(50*i), 35, 470-(50*i));
		}
		// x-axes
		g.drawLine(20, 470, 1000, 470);
		g.drawLine(1000, 470, 995, 465);
		g.drawLine(1000, 470, 995, 475);
		// Label y-axes
		g.drawString("Level", 15, 20);
	}
}
