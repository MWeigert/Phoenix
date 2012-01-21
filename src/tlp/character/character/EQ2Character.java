/**
 * 
 */
package tlp.character.character;

/**
 * @author Tingle Driftwood (Guk)
 * @version 1.0
 *
 */
public class EQ2Character {

	private String name;
	private String race;
	private String server;
	private String advClass;
	private int advLevel;
	private String artClass;
	private int artLevel;
	
	public EQ2Character(String name) {
		this.name = name;
	}
	
	/**
	 * @param race the race to set
	 */
	public void setRace(String race) {
		this.race = race;
	}

	/**
	 * @param server the server to set
	 */
	public void setServer(String server) {
		this.server = server;
	}

	/**
	 * @param advClass the advClass to set
	 */
	public void setAdvClass(String advClass) {
		this.advClass = advClass;
	}

	/**
	 * @param artClass the artClass to set
	 */
	public void setArtClass(String artClass) {
		this.artClass = artClass;
	}
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @return the race
	 */
	public String getRace() {
		return race;
	}
	/**
	 * @return the server
	 */
	public String getServer() {
		return server;
	}
	/**
	 * @return the advClass
	 */
	public String getAdvClass() {
		return advClass;
	}
	/**
	 * @return the artClass
	 */
	public String getArtClass() {
		return artClass;
	}
}
