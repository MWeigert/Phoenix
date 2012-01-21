/**
 * 
 */
package tlp.gui.tools;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * @author Tingle Driftwood (Guk)
 * @version 1.0
 */
public class ExceptionDisplay {
	
	/**
	 * Method which displays a error message
	 * @param msg
	 */
	public ExceptionDisplay (String msg) {
		JOptionPane.showMessageDialog(new JFrame(), msg, "TLP Error Message", JOptionPane.ERROR_MESSAGE);  
		}

}
