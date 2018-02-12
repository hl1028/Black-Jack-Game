import java.util.ArrayList;
import java.util.Random;
/**
 * this is the blueprint of player, which can hit and get sum
 * @author lizhao
 *
 */
public class Player {

	public Player() {
	}
	
	private int sum = 0;
	public ArrayList<Card> Hand = new ArrayList<>(); //Hand of Card!!
	Random rand = new Random();
	/**
	 * when a player hits
	 * @param dd is the current deck
	 */
	public void hit(Deck dd) {
		Hand.add(dd.getCard(0));      //add card to hand
		sum = sum + dd.getCardValue(0);		//add value to sum
		dd.removeCard(0);				//remove card from deck
	}
	
	/**
	 * get sum of a player's Hand and optimize the value of Ace according to his Hand
	 * @return newSum
	 */
	public int getSum() {
		int newSum = sum;
		int countAce = 0;
		for(Card i : Hand) {
			if (i.getValue() == 11) {
				countAce++;
			}
		}
		if (sum>21 & countAce>0) {
			while(newSum > 21 & countAce>0) { //optimize Ace 
				newSum = newSum - 10;		
				countAce--;
			}
		}
		return newSum;		
	}
	
	public String getHand(int i) {
		return Hand.get(i).getSuit() + " " + Hand.get(i).getName();
	}
	
	public void lose() {
		System.out.println("Sorry, you lost.");
	}
	
	public void tie() {
		System.out.println("Oh, you push.");
	}
	
	public void win() {
		System.out.println("Congrats! You win!");
	}
	
	
}
