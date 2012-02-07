/**
 * 
 */
package tla.gui.main;

import java.awt.GridBagLayout;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import tla.gui.panel.QuestTrackerPanel;
import tla.gui.panel.VersionInfoPanel;
import tla.gui.tools.MainMenuBar;
import tla.gui.tools.XYGrid;
import tla.quest.event.ValentineQuests;

/**
 * @author Tingle Driftwood (Guk)
 * @version 1.0
 */
public class MainGUI {

	public static void main(String args[]) {
		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
				MainFrame mframe = new MainFrame();
				mframe.initFrame();
				QuestTrackerPanel qtrackerpanel = new QuestTrackerPanel();
				ValentineQuests valentine = new ValentineQuests();
				qtrackerpanel.initPanel(valentine.getQuests(), null);
				mframe.setPanel(qtrackerpanel.getPanel());
				mframe.setVisible(true);
			}
		});
	}
}
