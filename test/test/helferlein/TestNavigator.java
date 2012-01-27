/**
 * 
 */
package test.helferlein;

import java.io.File;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

import tla.tools.character.LoadCharacterLogFile;
import tla.tools.parser.Navigator;

/**
 * @author Tingle Driftwood (Guk)
 * @version 1.0
 */
public class TestNavigator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		File file = new File("D:\\Games\\EQ2\\logs\\Guk\\eq2log_Gerda.txt");
		LoadCharacterLogFile lCharlog = new LoadCharacterLogFile(file);
		Map<Integer, String> log = new HashMap<Integer, String>();
		log = lCharlog.getLogMap();
		Navigator navi = new Navigator();
		navi.setRoute(log);
	}

}
