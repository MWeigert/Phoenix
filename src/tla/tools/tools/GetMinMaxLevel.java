/**
 * 
 */
package tla.tools.tools;

import java.util.Date;
import java.util.Map;

/**
 * @author Tingle Driftwood (Guk)
 * @version 1.0
 */
public class GetMinMaxLevel {

	/**
	 * Method extracts the maximal level (adventure or artisan) out of a 
	 * LevelHistory map.
	 * @param lHist
	 * @return int which contains the maximal level stored in map
	 */
	public int extractMaxLevel(Map<Integer, Date> lHist) {
		int max = 90;
		Boolean sw = true;
		for (int i = max; i > 0; i--) {
			if (lHist.get(i) == null && sw == true) {
				max = i - 1;
			} else {
				sw = false;
			}
		}
		return max;
	}
	
	/**
	 * Method extracts the minimal level (adventure or artisan) out of a
	 * LevelHistory map.
	 * @param lHist
	 * @return int which contains the minimal level stored in map
	 */
	public int extractMinLevel(Map<Integer, Date> lHist) {
		int min  = 1;
		Boolean sw = true;
		for (int i = min; i < 91; i++) {
			if (lHist.get(i) == null && sw == true) {
				min = i + 1;
			} else {
				sw = false;
			}
		}
		return min;
	}
}
