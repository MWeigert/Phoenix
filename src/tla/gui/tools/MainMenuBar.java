/**
 * 
 */
package tla.gui.tools;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 * @author Tingle Driftwood (Guk)
 * @version 1.0
 */
public class MainMenuBar {

	private JMenuBar menuBar;
	
	public MainMenuBar() {
		menuBar = new JMenuBar();
		
		// Setting the file menu
		JMenu fileMenu = new JMenu("File");
		fileMenu.setMnemonic('F');
		JMenuItem loadLogMItem = new JMenuItem("Load Log File");
		loadLogMItem.setMnemonic('L');
		fileMenu.add(loadLogMItem);
		fileMenu.addSeparator();
		JMenuItem loadCharMItem = new JMenuItem("Load Character File");
		loadCharMItem.setMnemonic('C');
		fileMenu.add(loadCharMItem);
		JMenuItem saveCharMItem = new JMenuItem("Save Character File");
		saveCharMItem.setMnemonic('S');
		fileMenu.add(saveCharMItem);
		fileMenu.addSeparator();
		JMenuItem exitMItem = new JMenuItem("Exit");
		exitMItem.setMnemonic('x');
		fileMenu.add(exitMItem);
		
		// Setting the help menu
		JMenu helpMenu = new JMenu("Help");
		helpMenu.setMnemonic('p');
		JMenuItem versionMItem = new JMenuItem("Version");
		versionMItem.setMnemonic('V');
		helpMenu.add(versionMItem);
		
		// Putting the menus in the menubar
		menuBar.add(fileMenu);
		menuBar.add(helpMenu);
	}
	
	public JMenuBar getMainMenuBar() {
		return menuBar;
	}
}
