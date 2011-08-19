package pokercalculator.lib;

/**
 *
 * @author Ivan Zgoniaiko <zgoniaiko [at] gmail.com>
 */
public class Deck {

  private Card[] deck;
  
  Deck(int numOfCards) {
    deck = new Card[numOfCards];
    for (int i = 0; i < deck.length; i++) {
      
      deck[i] = new Card(new Suit(i / 13 + 1), new Pips(i % 13 + 2));
    }
  }
  
  public int countCards() {
    return deck.length;
  }
  
  public Card getCardByIndex(int i) {
    return deck[i];
  }
}
