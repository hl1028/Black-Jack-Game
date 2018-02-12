

public class EcGame {
	private int win;
	
	public void play () {
		/**
		 * Initialize players and deck
		 */
		Player com = new Player();
		Player p1 = new Player();
		Deck d1 = new Deck();
		/**
		 * Starting Deal
		 */
		com.hit(d1); 
		com.hit(d1);
		String faceup = com.getHand(0);
		System.out.println("Computer's face up card is " + faceup);
		p1.hit(d1);
		p1.hit(d1);
		System.out.println("Your cards are " + p1.getHand(0) + " and " + p1.getHand(1));
		System.out.println("Your sum is currently " + p1.getSum());


		/**
		 * user Strategy
		 */
		if (com.Hand.get(0).getValue()<=6) {
			while (p1.getSum()<=12) {
				p1.hit(d1);
			}
		}
		if (com.Hand.get(0).getValue()>=7) {
			while (p1.getSum()<=16) {
				p1.hit(d1);
			}
		}	
		/**
		 * when Stand, computer shows cards
		 */
		System.out.print("Computer turn over cards: ");
		for (Card i: com.Hand) {
			System.out.print(i.getSuit() + " " + i.getName() + " ");
		}
		System.out.println();
		/**
		 * when user does not bust and while computer's sum<17, computer plays its strategy
		 */
		if (p1.getSum()<21) {	
			while (com.getSum()<17) {
				com.hit(d1);
				System.out.print("Computer hits: ");
				for (Card i: com.Hand) {
					System.out.print(i.getSuit() + " " + i.getName() + " ");
				}
				System.out.println();
			}	
		}			
		/**
		 * Determine the result
		 */
		System.out.println("Result:");
		System.out.println("Your sum: " + p1.getSum());
		System.out.println("Computer's sum: " + com.getSum());

		if (p1.getSum()>21) {  //if user bust
			p1.lose(); win = 2;
		} else if (p1.getSum() > com.getSum() || com.getSum()>21) {
			p1.win(); win = 0;
		} else if (p1.getSum() == com.getSum()) {
			p1.tie(); win = 1;
		} else if (p1.getSum()<com.getSum()) {
			p1.lose(); win = 2;
		}
		
	}
	
	public int getWin() {
		return win;
	}
}
