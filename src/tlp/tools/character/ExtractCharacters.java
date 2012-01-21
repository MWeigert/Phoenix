/**
 * 
 */
package tlp.tools.character;

import java.io.File;

import tlp.gui.tools.ExceptionDisplay;


/**
 * @author Tingle Driftwood (Guk)
 * @version 1.0
 */
public class ExtractCharacters {

	/**
	 * Method which extract the names of the character log files
	 * @param path
	 * @return
	 */
	public String[] getCharNames (File path) {
		File files[] = path.listFiles();
		int x;
		int anz = 0;
		int no = 0;
		
		for (int i = 0; i < files.length; i++) {
			String fileName = files[i].getName();
			x = fileName.indexOf("eq2log_");
			if (x != -1) {
				anz++;
			}
		}
		System.out.println("Anzahl: " + anz);
		String charNames[] = new String[anz];
		
		for (int i = 0; i < files.length; i++) {
			String fileName = files[i].getName();
			x = fileName.indexOf("eq2log_");
			if (x != -1) {
				charNames[no] = fileName.substring(x + 7, fileName.length() - 4);
				no++;
			}
		}
		if (charNames == null) {
			new ExceptionDisplay("No Characters found.");
		}
		return charNames;
	}
}
