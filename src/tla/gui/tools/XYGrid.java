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
		g.drawLine(30, 25, 30, 515);
		g.drawLine(30, 25, 25, 30);
		g.drawLine(30, 25, 35, 30);
		for (int i = 1; i <= 9; i++) {
			g.drawLine(25, 510 -(50*i), 35, 510-(50*i));
			g.drawLine(27, 535-(50*i), 33, 535-(50*i));
		}
		// x-axes
		g.drawLine(20, 510, 1000, 510);
		g.drawLine(1000, 510, 995, 505);
		g.drawLine(1000, 510, 995, 515);
		// Label y-axes
		g.drawString("Level", 15, 20);
		for (int i = 1; i <= 9; i++) {
			g.drawString(String.valueOf(i *10), 10, 515-(50*i));
		}
		// Label x-axes
		g.drawString("Time", 985, 530);
	}
}
