/**
 * this is the blueprint of a card
 * @author lizhao
 *
 */
public class Card {
	private int value;
	private String name;
	private String suit;
	private int[] values = {11,2,3,4,5,6,7,8,9,10,10,10,10};
	private String[] names= {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
	private String[] suits= {"Spades", "Diamonds", "Clubs","Hearts"};
	/**
	 * 
	 * @param suitNum from 1 to 4
	 * @param valueNum from 1 to 13
	 */
	public Card(int suitNum, int valueNum){
		value = values[valueNum-1];
		name = names[valueNum-1];
		suit = suits[suitNum-1];
	}

	public int getValue() {
		return value;
	}

	public String getName() {
		return name;
	}

	public String getSuit() {
		return suit;
	}
	
}
