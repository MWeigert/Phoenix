/**
 * 
 */
package tla.gui.main;

import java.awt.GridBagLayout;

import javax.swing.JFrame;

import tla.gui.panel.VersionInfoPanel;
import tla.gui.tools.MainMenuBar;

/**
 * @author Tingle Driftwood (Guk)
 * @version 1.0
 */
public class MainGUI {

	private JFrame frame;
	
	public MainGUI() {
		frame = new JFrame("Tingles Log Analyzer");
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setLayout(new GridBagLayout());
		
		frame.setJMenuBar(new MainMenuBar().getMainMenuBar());
		
		frame.add(new VersionInfoPanel().getInfoPanel());
		frame.pack();
		frame.setVisible(true);
	}
}
