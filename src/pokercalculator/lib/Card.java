package pokercalculator.lib;

/**
 *
 * @author Ivan Zgoniaiko <zgoniaiko [at] gmail.com>
 */
public class Card implements Comparable {
  private Suit suit;
  private Pips pip;

  Card(Suit suit, Pips pips) {
    suit = suit;
    pip = pips;
  }

  public Suit getSuit()
  {
    return suit;
  }

  public Pips getPip()
  {
    return pip;
  }
  
  @Override
  public int compareTo(Object o) {
    Card tmp = (Card)o;
    if ((this != null) && (o != null))
    {
      int pip1 = this.getPip().getValue();
      int pip2 = tmp.getPip().getValue();

      if (pip1 == 1) {
        if (pip1 != pip2) return -1;
      } else if (pip2 == 1) {
        if (pip1 != pip2) return 1;
      } else {
        if (pip1 < pip2) { return 1; }
        else if (pip1 > pip2) { return -1; }
      }
    }

    return 0;
  }
  
}
