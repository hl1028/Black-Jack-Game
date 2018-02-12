import java.util.ArrayList;
import java.util.Collections;
/**
 * this is the blueprint of deck, it contains cards(arraylist of Card)
 * @author lizhao
 *
 */
public class Deck {
	private ArrayList<Card> cards = new ArrayList<>();
	
	public Deck() {
		/**
		 * initializing cards and add cards to Deck-cards
		 */
		for (int i=1; i<=4; i++) {
			for (int j=1; j<=13; j++) {
				cards.add(new Card(i,j));
			}
		}
		/**
		 * Shuffle the Deck
		 */
		Collections.shuffle(cards);// shuffle the Deck
	}
	
	public int getCardValue(int i){
		return cards.get(i).getValue();
	}
	
	public void removeCard(int i) {
		cards.remove(i);
	}
	
	public Card getCard(int i) {
		return cards.get(i);
	}

}
