/**
 * 
 */
package test.helferlein;

import java.io.File;

import tlp.tools.character.ExtractCharacters;

/**
 * @author Tingle Driftwood (Guk)
 * @version 1.0
 */
public class TestExtractCharacters {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File path = new File("D:\\Games\\EQ2\\logs\\Guk");
//		File path = new File("D:\\Daten");
		ExtractCharacters extract = new ExtractCharacters(path);
		String[] characters = extract.getCharacters();
		System.out.println(characters.length + " EQ II characters log files found.");
		System.out.println("************************************");
		for (int i = 0; i < characters.length ; i++) {
			System.out.println(i + ". " + characters[i]);
		}
		System.out.println("************************************");
	}

}
