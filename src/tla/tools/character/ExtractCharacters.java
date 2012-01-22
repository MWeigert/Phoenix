/**
 * 
 */
package tla.tools.character;

import java.io.File;

/**
 * @author Tingle Driftwood (Guk)
 * @version 1.0
 */
public class ExtractCharacters {

	private String[] characters;

	public ExtractCharacters(File path) {
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

		String charNames[] = new String[anz];

		for (int i = 0; i < files.length; i++) {
			String fileName = files[i].getName();
			x = fileName.indexOf("eq2log_");
			if (x != -1) {
				charNames[no] = fileName.substring(x + 7, fileName.length() - 4);
				no++;
			}
		}
		characters = charNames;
	}
	
	public String[] getCharacters() {
		return characters;
	}
}
