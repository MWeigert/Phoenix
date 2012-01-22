/**
 * 
 */
package test.helferlein;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import tla.tools.character.LoadCharacterLogFile;

/**
 * @author Tingle Driftwood (Guk)
 * @version 1.0
 */
public class TestLoadCharacterLogFile {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("D:\\Games\\EQ2\\logs\\Guk\\Testlogfile.txt");
		LoadCharacterLogFile lCharlog = new LoadCharacterLogFile(file);
		Map<Integer, String> log = new HashMap<Integer, String>();
		log = lCharlog.getLogMap();
		for (int i = 0; i < log.size(); i++) {
			System.out.println(i+ ". " + log.get(i));
		}
	}

}
