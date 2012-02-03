/**
 * 
 */
package test.helferlein;

import javax.swing.JFrame;

import tla.gui.panel.LevelHistoryPanel;

/**
 * @author Tingle Driftwood (Guk)
 * @version 1.0
 */
public class TestLevelHistoryPanel {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f = new JFrame();
	    f.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
	    f.setSize( 1100, 750 );
	    f.setTitle("LevelHistoryPanel - Test");
	    f.add(new LevelHistoryPanel());
	    f.setVisible( true );
	}

}
