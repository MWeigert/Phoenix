/**
 * 
 */
package tla.gui.main;

import java.awt.GridBagLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

import tla.gui.tools.MainMenuBar;

/**
 * @author Tingle Driftwood (Guk)
 * @version 1.0
 */
public class MainFrame {

	private JFrame frame;
	
	public void initFrame() {
		frame = new JFrame("Tingles Log Analyzer");
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setLayout(new GridBagLayout());

		frame.setJMenuBar(new MainMenuBar().getMainMenuBar());
	}
	
	public void setVisible(Boolean visible) {
		frame.setVisible(visible);
	}
	
	public void setPanel(JPanel panel) {
		frame.add(panel);
		frame.pack();
	}
	
	public JFrame getFrame() {
		return frame;
	}
	
}
