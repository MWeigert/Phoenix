/**
 * 
 */
package test.helferlein;

import java.io.File;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

import tla.tools.character.LoadCharacterLogFile;
import tla.tools.parser.LevelHistory;

/**
 * @author Tingle Driftwood (Guk)
 * @version 1.0
 */
public class TestLevelHistory {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		File file = new File("D:\\Games\\EQ2\\logs\\Guk\\eq2log_Tuvien.txt");
		LoadCharacterLogFile lCharlog = new LoadCharacterLogFile(file);
		Map<Integer, String> log = new HashMap<Integer, String>();
		log = lCharlog.getLogMap();
		LevelHistory adv = new LevelHistory();
		adv.setLvlHistory(log);
	}

}
