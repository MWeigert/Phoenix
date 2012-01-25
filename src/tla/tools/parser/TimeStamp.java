/**
 * 
 */
package tla.tools.parser;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import tla.gui.tools.ExceptionDisplay;

/**Class which extracts the time stamp of a log file row and convert these string to a date
 * @author Tingle Driftwood (Guk)
 * @version 1.0
 */
public class TimeStamp {

	private Date stamp;

	/**
	 * @return the stamp
	 */
	public Date getStamp() {
		return stamp;
	}

	/**
	 * @param stamp the stamp to set
	 */
	public void setStamp(String timeStamp) {
		SimpleDateFormat formatter = new SimpleDateFormat("dd.MMM.yyyy kk:mm:ss");
		try {
			stamp = formatter.parse(timeStamp);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			new ExceptionDisplay("Error while extracing time stamp.");
			e.printStackTrace();
		}
	}
	
	public String extractTimeStamp(String row) {
		String timeStamp = new String();
		int x = row.indexOf('[');
		timeStamp = row.substring(x + 9, x + 11) + ".";				//add day to string 
		timeStamp = timeStamp + row.substring(x + 5, x + 8) + ".";	//add month to string
		timeStamp = timeStamp + row.substring(x + 21, x + 25) + " ";//add year to string
		timeStamp = timeStamp + row.substring(x + 12, x + 20);		//add time to string
		return timeStamp;
	}
	
}
