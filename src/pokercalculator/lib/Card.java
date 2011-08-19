package pokercalculator.lib;

/**
 *
 * @author Ivan Zgoniaiko <zgoniaiko [at] gmail.com>
 */
public class Card implements Comparable {
  private Suit suit;
  private Pips pips;

  Card(Suit suit, Pips pips) {
    this.suit = suit;
    this.pips = pips;
  }

  @Override
  public String toString() {
    return getSuit().toString() + getPips().toString();
  }

  public Suit getSuit()
  {
    return suit;
  }

  public Pips getPips()
  {
    return pips;
  }

  @Override
  public int compareTo(Object o) {
    Card tmp = (Card)o;
    if ((this != null) && (o != null))
    {
      int pips1 = getPips().getValue();
      int pips2 = tmp.getPips().getValue();

      if (pips1 == 1) {
        if (pips1 != pips2) return -1;
      } else if (pips2 == 1) {
        if (pips1 != pips2) return 1;
      } else {
        if (pips1 < pips2) { return 1; }
        else if (pips1 > pips2) { return -1; }
      }
    }

    return 0;
  }

  @Override
	public boolean equals(Object obj) {
		if (obj == null ) return false;
		Card that = (Card)obj;
		
    return (this.getSuit().equals(that.getSuit()) && this.getPips().equals(that.getPips()));
	}

  @Override
  public int hashCode() {
    int hash = 3;
    hash = 59 * hash + (this.suit != null ? this.suit.hashCode() : 0);
    hash = 59 * hash + (this.pips != null ? this.pips.hashCode() : 0);
    
    return hash;
  }
}
