package pokercalculator.lib;

/**
 *
 * @author Ivan Zgoniaiko <zgoniaiko [at] gmail.com>
 */
public class Suit {

  static final int SPADES = 1;
  static final int CLUBS = 2;
  static final int DIAMONDS = 3;
  static final int HEARTS = 4;
  private int suitValue;

  Suit(int i)
  {
    if ((i < 1) || (i > 4)) throw new NullPointerException("Provided incorrect suit: " + i);
    suitValue = i;
  }

  Suit(String suitString) {
    String suit = suitString.trim().toLowerCase();

    if (suit.equals("s")) {
      suitValue = SPADES;
    } else if (suit.equals("c")) {
      suitValue = CLUBS;
    } else if (suit.equals("d")) {
      suitValue = DIAMONDS;
    } else if (suit.equals("h")) {
      suitValue = HEARTS;
    } else {
      throw new NullPointerException("Provided incorrect suit: " + suitString);
    }
  }

  public String toString() {
    switch (suitValue)
    {
      case SPADES: return "s";
      case CLUBS: return "c";
      case DIAMONDS: return "d";
      case HEARTS: return "h";
      default: throw new NullPointerException("Provided incorrect suit: " + suitValue);
    }
  }

  public int getValue()
  {
    return suitValue;
  }

  @Override
	public boolean equals(Object obj) {
		if (obj == null ) return false;
    if (getClass() != obj.getClass()) return false;
		Suit that = (Suit)obj;

		return this.getValue() == that.getValue();
	}

  @Override
  public int hashCode() {
    int hash = 7;
    hash = 53 * hash + this.suitValue;

    return hash;
  }
}
