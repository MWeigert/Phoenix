/**
 * 
 */
package tla.gui.io;

import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.filechooser.FileNameExtensionFilter;

import tla.gui.tools.ExceptionDisplay;


/**
 * @author Tingle Driftwood (Guk)
 * @version 1.0
 */
public class DirectoryChooser {

	private File directory;

	/**
	 * Method which launches a configured file chooser which let you select the 
	 * path of the EQ2 log files.
	 */
	public void setEQ2LogFileDirectory() {
		JFileChooser fc =  new JFileChooser();
		fc.setDialogTitle("Tingles Log Parser - Choose EQ2 Log File Directory");
		fc.setApproveButtonText("Choose Directory");
		fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
		fc.setFileFilter(new FileNameExtensionFilter("Path", ".*"));

		int returnVal = fc.showOpenDialog(new JFrame());
		
		if (returnVal == JFileChooser.APPROVE_OPTION) {
			directory = fc.getSelectedFile();
		}
	}

	/**
	 * Method which returns the selected path
	 * @return directory
	 */
	public File getDirectory() {
		if (directory == null) {
			new ExceptionDisplay("No path choosed.");
		}
		return directory;
	}
}
