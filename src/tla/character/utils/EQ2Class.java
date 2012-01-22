/**
 * 
 */
package tla.character.utils;

/**
 * @author Tingle Driftwood (Guk)
 * @version 1.0
 */
public class EQ2Class {

	private Boolean adventureClass;
	private Boolean artisanClass;
	private int classLevel;
	
	public EQ2Class (Boolean adv, Boolean art, int lvl){
		this.adventureClass = adv;
		this.artisanClass = art;
		this.classLevel = lvl;
	}
	
	public int getLevel(){
		return classLevel;
	}
	
	public Boolean isAdventureClass(){
		return adventureClass;
	}
	
	public Boolean isArtisanClass(){
		return artisanClass;
	}
	
	public void setClassLevel (int lvl) {
		this.classLevel = lvl;
	}
}
