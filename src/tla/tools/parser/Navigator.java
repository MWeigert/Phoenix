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
public class Navigator {

	private Map<Date, String> route = new HashMap<Date, String>();

	/**
	 * @return the route
	 */
	public Map<Date, String> getRoute() {
		return route;
	}

	/**
	 * Method which extracts the moving informations from the character
	 * and saves time stamp and location in a map.
	 * 
	 * @param route the route to set
	 */
	public void setRoute(Map<Integer, String> log) {
		String zeile = new String();
		TimeStamp ts = new TimeStamp();
		int x = 0;
		for (int i = 0; i < log.size(); i++) {
			zeile = log.get(i);
			x = zeile.indexOf("You have entered");
			if (x != -1) {
				String zone = zeile.substring(x + 17, zeile.length() - 1);
				String time = ts.extractTimeStamp(zeile);
				ts.setStamp(time);
				Date date = ts.getStamp();
//				System.out.println(date + " ¦ " + zeile);
				route.put(date, zone);
				System.out.println(date + " ¦ " + route.get(date));
			}
		}
	}
	
	
}
