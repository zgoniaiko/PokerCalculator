package pokercalculator.lib;

public class Hand {
  
  private Card[] hand;

  public Hand() {
    hand = new Card[2];
  }

  void add(Card card) {
    if (hand[0] == null) {
      hand[0] = card;
    } else if (hand[1] == null) {
      hand[1] = card;
    }
  }
  
  public Card[] getCards() {
    return hand;
  }
  
}
