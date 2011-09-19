package pokercalculator.lib;

public class Hand {
  
  private Card[] hand;

  public Hand() {
    hand = new Card[2];
  }

  public void add(Card card) {
    if (hand[0] == null) {
      hand[0] = card;
    } else if (hand[1] == null) {
      hand[1] = card;
    }
  }
  
  public Card[] getCards() {
    return hand;
  }

  public void remove() {
    if(hand[1] != null) {
      remove(1);
    } else if(hand[0] != null) {
      remove(0);
    }
  }

  public void remove(int index) {
    hand[index] = null;
  }

  void replace(int i, Card card) {
    hand[i] = card;
  }  
}
