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
  int suitValue;

  Suit(int i)
  {
    if ((i < 1) || (i > 4)) throw new NullPointerException("Provided incorrect suit: " + i);
    suitValue = i;
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
}
