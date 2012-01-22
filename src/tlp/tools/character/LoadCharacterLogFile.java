/**
 * 
 */
package tlp.tools.character;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import tlp.gui.tools.ExceptionDisplay;

/**
 * @author Tingle Driftwood (Guk)
 * @version 1.0
 */
public class LoadCharacterLogFile {

	Map<Integer, String> log = new HashMap<Integer, String>();
	
	public LoadCharacterLogFile(File file) {
		try {
			BufferedReader reader = new BufferedReader(new FileReader(file));
			int ln = 0;
			for (int i; (i = reader.read()) != -1;) {
				log.put(ln, reader.readLine());
				ln++;
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			new ExceptionDisplay("File not found. Please try it again.");
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			new ExceptionDisplay("Error in file reading process.");
			e.printStackTrace();
		}
	}
	
	public Map<Integer, String> getLogMap() {
		return log;
	}
}
