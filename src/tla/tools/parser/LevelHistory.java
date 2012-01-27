/**
 * 
 */
package tla.tools.parser;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Tingle Driftwood (Guk)
 * @version 1.0
 */
public class LevelHistory {

	Map<Date, Integer> advLvlHistory = new HashMap<Date, Integer>();
	Map<Date, Integer> artLvlHistory = new HashMap<Date, Integer>();

	/**
	 * @return the advLvlHistory
	 */
	public Map<Date, Integer> getAdvLvlHistory() {
		return advLvlHistory;
	}

	/**
	 * @return the artLvlHistory
	 */
	public Map<Date, Integer> getArtLvlHisory() {
		return artLvlHistory;
	}
	
	/**
	 * Method which extracts the adventure and trade skill level
	 * history.
	 */
	public void setLvlHistory(Map<Integer, String> log) {
		TimeStamp ts = new TimeStamp();
		Date date = new Date();
		for (int i = 0; i < log.size(); i++) {
			String row = log.get(i);
			int x = row.indexOf("You are now level");
			if (x != -1){
				ts.setStamp(ts.extractTimeStamp(log.get(i)));
				date = ts.getStamp();
				String str = row.substring(x + 18, row.length() - 1);
				int lvl = Integer.valueOf(str);
				advLvlHistory.put(date, lvl);
				System.out.println("Adventure: " + advLvlHistory.get(date));
			} else {
				x = row.indexOf("Your tradeskill level is now");
				if (x != -1) {
					ts.setStamp(ts.extractTimeStamp(log.get(i)));
					date = ts.getStamp();
					String str = row.substring(x + 29, row.length() - 1);
					int lvl = Integer.valueOf(str);
					artLvlHistory.put(date, lvl);
					System.out.println("Tradeskill: " + artLvlHistory.get(date));
				}
			}
			
		}
	}



}
