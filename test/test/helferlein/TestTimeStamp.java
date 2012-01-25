/**
 * 
 */
package test.helferlein;

import tla.tools.parser.TimeStamp;

/**
 * @author Tingle Driftwood (Guk)
 * @version 1.0
 */
public class TestTimeStamp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TimeStamp ts = new TimeStamp();
		System.out.println("***** Testing date & time extraction ************");
		System.out.println("dd.MMM.yyyy kk:mm:ss");
		System.out.println(ts.extractTimeStamp("(1264876020)[Sat Jan 30 19:27:00 2010] " +
				"You gain experience!"));
		System.out.println(ts.extractTimeStamp("(1264857981)[Sat Jan 30 14:26:21 2010] You " +
				"have entered Greater Faydark."));
		System.out.println("***** Now testing String to date conversion *****");
		String str = ts.extractTimeStamp("(1264876020)[Sat Jan 30 19:27:00 2010] " +
				"You gain experience!");
		ts.setStamp(str);
		System.out.println(ts.getStamp());
		str = ts.extractTimeStamp("(1264857981)[Sat Jan 30 14:26:21 2010] You " +
				"have entered Greater Faydark.");
		ts.setStamp(str);
		System.out.println(ts.getStamp());
	}

}
