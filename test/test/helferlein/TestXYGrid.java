/**
 * 
 */
package test.helferlein;

import javax.swing.JFrame;

import tla.gui.tools.XYGrid;

/**
 * @author Tingle Driftwood (Guk)
 * @version 1.0
 */
public class TestXYGrid {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f = new JFrame();
	    f.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
	    f.setSize( 1100, 750 );
	    f.add( new XYGrid() );
	    f.setVisible( true );
	}

}
