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
    return getPips().toString() + getSuit().toString();
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
	public boolean equals(Object obj) {
		if (obj == null ) return false;
    if (getClass() != obj.getClass()) return false;
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

  @Override
  public int compareTo(Object o) {
    final int BEFORE = -1;
    final int EQUAL = 0;
    final int AFTER = 1;
    
		if ((o == null) || (this == null)) return EQUAL;
    Card that = (Card)o;
    
    return getPips().compareTo(that.getPips());
  }
}
