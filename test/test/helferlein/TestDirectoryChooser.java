/**
 * 
 */
package test.helferlein;

import tlp.gui.io.DirectoryChooser;

/**
 * Class which tests the functionality of the DirectoryChooser and
 * give the selected directory to console out.
 * @author Tingle Driftwood (Guk)
 * @version 1.0
 */
public class TestDirectoryChooser {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DirectoryChooser dirChooser = new DirectoryChooser();
		dirChooser.setEQ2LogFileDirectory();
		System.out.println(dirChooser.getDirectory());
	}

}
