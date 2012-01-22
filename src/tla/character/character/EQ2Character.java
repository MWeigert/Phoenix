/**
 * 
 */
package tla.character.character;

import tla.character.utils.EQ2Class;
import tla.character.utils.EQ2Server;

/**
 * @author Tingle Driftwood (Guk)
 * @version 1.0
 *
 */
public class EQ2Character {

	private String name;
	private String race;
	private EQ2Server server;
	private EQ2Class adventureClass;
	private EQ2Class artisanClass;
	
	public EQ2Character(String name, String race, EQ2Server server, EQ2Class advClass) {
		this.name = name;
		this.race = race;
		this.server = server;
		this.adventureClass = advClass;
	}
	
	/**
	 * @param advClass the adventure class to set
	 */
	public void setAdventureClass(EQ2Class advClass) {
		this.adventureClass = advClass;
	}
	
	/**
	 * @param artClass the artisan class to set
	 */
	public void setArtisanClass(EQ2Class artClass) {
		this.artisanClass = artClass;
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
	public void setServer(EQ2Server server) {
		this.server = server;
	}

	/**
	 * @return the adventure class
	 */
	public EQ2Class getAdventureClass() {
		return adventureClass;
	}
	
	/**
	 * @return the artisan class
	 */
	public EQ2Class getArtisanClass() {
		return artisanClass;
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
		return server.toString();
	}
}
