/**
 * 
 */
package tla.quest.event;

/**
 * @author Tingle Driftwood (Guk)
 * @version 1.0
 */
public class ValentineQuests {

	private String[] quests;
	
	public ValentineQuests() {
		quests = new String[15];
		quests[0] = "Unforgettable";
		quests[1] = "Heal the Pain";
		quests[2] = "Tainted Love";
		quests[3] = "Shot Through the Heart";
		quests[4] = "What's Love Got to Do With it?";
		quests[5] = "Bouquet of Trust";
		quests[6] = "Harts Full of Trust";
		quests[7] = "Sacrificial Trust";
		quests[8] = "Find 'em a find, Catch 'em a Catch!";
		quests[9] = "Love Lines";
		quests[10] = "Hearts a'Flutter - Antonica";
		quests[11] = "Hearts a'Flutter - Commonlands";
		quests[12] = "My Romantic Reputation";
		quests[13] = "Love Potion Number One";
		quests[14] = "Romantic Flower Petals";
	}
	
	public String[] getQuests() {
		return quests;
	}
}
