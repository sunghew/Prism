public class StandardDeck extends Deck {
	String suit[] = {"spades", "hearts", "clubs", "diamonds"};

	void setup() {
		for(String s : suit) {
			for (int r = 0; r < 13; r++) {
				deck.add(new StandardCard(s, r));
			}
		}
	}

	class StandardCard extends Card {
		private String suit;
		private int rank;

		StandardCard(String suit, int rank) {
			this.suit = suit;
			this.rank = rank;
		}

		String getSuit() {
			return suit;
		}

		int getRank() {
			return rank;
		}
	}

}