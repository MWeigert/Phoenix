/**
 * 
 */
package tla.gui.panel;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * @author Tingle Driftwood (Guk)
 * @version 1.0
 */
public class VersionInfoPanel {

	private JPanel infoPanel;
	
	public VersionInfoPanel() {
		infoPanel = new JPanel(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.gridx = 0;
		gbc.gridy = 0;
		
		JLabel titelLabel = new JLabel("Tingles Log Analyzer");
		infoPanel.add(titelLabel, gbc);
		
		JLabel versionsLabel = new JLabel("Version 1.0");
		gbc.gridy = 1;
		infoPanel.add(versionsLabel, gbc);
		
		JLabel emptyLabel = new JLabel(" ");
		gbc.gridy = 2;
		infoPanel.add(emptyLabel, gbc);
		
		JLabel programmedLabel = new JLabel("programmed by");
		gbc.gridy = 3; 
		infoPanel.add(programmedLabel, gbc);
		
		JLabel programmerLabel = new JLabel("Tingle Driftwood (Guk)");
		gbc.gridy = 4;
		infoPanel.add(programmerLabel, gbc);
	}
	
	public JPanel getInfoPanel() {
		return infoPanel;
	}
}
