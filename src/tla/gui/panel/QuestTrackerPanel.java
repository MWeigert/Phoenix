/**
 * 
 */
package tla.gui.panel;

import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * @author Tingle Driftwood (Guk)
 * @version 1.0
 */
public class QuestTrackerPanel {

	private JPanel panel;
	
	public void initPanel(String [] quests, String [] chars) {
		panel = new JPanel();
		panel.setLayout(null);
		int y = quests.length;
//		int x = chars.length;
		int x = 5;
		panel.setSize(x * 25 , y * 25 + 100);
		for (int i = 0; i < y; i++) {
			JLabel label = new JLabel(quests[i]);
			label.setBounds(10, i * 25 + 25, 100, 25);
			panel.add(label);
		}
	}
	
	public JPanel getPanel() {
		return panel;
	}
}
