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
		g.drawLine(30, 25, 30, 605);
		g.drawLine(30, 25, 25, 30);
		g.drawLine(30, 25, 35, 30);
		for (int i = 1; i <= 10; i++) {
			g.drawLine(25, 600 - (56*i), 35, 600 - (56*i));
			g.drawLine(27, 572 - (56*(i-1)), 33, 572 - (56*(i-1)));
		}
		// x-axes
		g.drawLine(20, 600, 950, 600);
		g.drawLine(950, 600, 945, 605);
		g.drawLine(950, 600, 945, 595);
		// Label y-axes
		g.drawString("Level", 15, 20);
		for (int i = 1; i <= 10; i++) {
			g.drawString(String.valueOf(i *10), 5, 605 - (56*i));
		}
		// Label x-axes
		g.drawString("Time", 935, 590);
		for (int i = 1; i<=10; i++) {
			g.drawLine(30 +( 90*i), 595, 30 + (90*i), 605);
			g.drawLine(75 + (90*(i-1)), 597, 75 + (90*(i-1)), 603);
		}
	}
}
