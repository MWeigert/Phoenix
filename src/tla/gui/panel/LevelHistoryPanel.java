/**
 * 
 */
package tla.gui.panel;

import java.awt.Graphics;
import java.util.Date;
import java.util.Map;

import tla.gui.tools.XYGrid;
import tla.tools.parser.LevelHistory;
import tla.tools.tools.GetMinMaxLevel;

/**
 * @author Tingle Driftwood (Guk)
 * @version 1.0
 */
@SuppressWarnings("serial")
public class LevelHistoryPanel extends XYGrid {


	protected void paintComponent(Graphics g, LevelHistory lHist) {
		super.paintComponent(g);
//		Map<Integer, Date> advLvlHistory = lHist.getAdvLvlHistory();
//		int maxLvl = new GetMinMaxLevel().extractMaxLevel(lHist.getAdvLvlHistory());
//		int minLvl = new GetMinMaxLevel().extractMinLevel(lHist.getAdvLvlHistory());
		// Label y-axes
		g.drawString("Level", 15, 20);
		for (int i = 1; i <= 10; i++) {
			g.drawString(String.valueOf(i *10), 5, 605 - (56*i));
		}
		// Label x-axes
		g.drawString("Time", 935, 590);
	}
}
