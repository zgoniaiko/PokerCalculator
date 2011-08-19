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
  
}
