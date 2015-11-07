import java.util.Collections;
import java.util.ArrayList;

public abstract class Deck {
	ArrayList<Card> deck;

	public Deck() {
		deck = new ArrayList<Card>();
		Shuffle();
	}

	// Fisher-Yates shuffle
	public void Shuffle() {
		setup();
		for (int i = deck.size() - 1; i > 0; i--) {
			int rIndex = (int)(Math.random()*deck.size());
			Collections.swap(deck, rIndex, i);
		}
	}

	public Card GetNextCard() {
		if (deck.size() == 0) {
			System.out.println("No cards left!");
			return null;
		}
		return deck.remove(deck.size()-1);
	}

	abstract void setup();

	abstract class Card { }
}