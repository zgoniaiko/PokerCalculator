package pokercalculator.lib;

/**
 *
 * @author Ivan Zgoniaiko <zgoniaiko [at] gmail.com>
 */
public class Pips implements Comparable {
  private int pipsValue;

  Pips(int i)
  {
    if ((i < 2) || (i > 14)) throw new NullPointerException("Provided incorrect pips: " + i);
    pipsValue = i;
  }

  Pips(String pipsString) {
    String pips = pipsString.trim().toUpperCase();

    if (pips.equals("2")) {
      pipsValue = 2;
    } else if (pips.equals("3")) {
      pipsValue = 3;
    } else if (pips.equals("4")) {
      pipsValue = 4;
    } else if (pips.equals("5")) {
      pipsValue = 5;
    } else if (pips.equals("6")) {
      pipsValue = 6;
    } else if (pips.equals("7")) {
      pipsValue = 7;
    } else if (pips.equals("8")) {
      pipsValue = 8;
    } else if (pips.equals("9")) {
      pipsValue = 9;
    } else if (pips.equals("T")) {
      pipsValue = 10;
    } else if (pips.equals("J")) {
      pipsValue = 11;
    } else if (pips.equals("Q")) {
      pipsValue = 12;
    } else if (pips.equals("K")) {
      pipsValue = 13;
    } else if (pips.equals("A")) {
      pipsValue = 14;
    } else {
      throw new NullPointerException("Provided incorrect pips: " + pipsString);
    }
  }

  @Override
  public String toString()
  {
    if (pipsValue > 1 && pipsValue < 10)
      return String.valueOf(pipsValue);
    else if (pipsValue == 10)
      return "T";
    else if (pipsValue == 11)
      return "J";
    else if (pipsValue == 12)
      return "Q";
    else if (pipsValue == 13)
      return "K";
    else if (pipsValue == 14)
      return "A";
    else throw new NullPointerException("Provided incorrect pips: " + pipsValue);
  }

  public int getValue()
  {
    return pipsValue;
  }

  @Override
	public boolean equals(Object obj) {
		if (obj == null ) return false;
    if (getClass() != obj.getClass()) return false;
		Pips that = (Pips)obj;

    return this.getValue() == that.getValue();
	}

  @Override
  public int hashCode() {
    int hash = 5;
    hash = 79 * hash + this.pipsValue;

    return hash;
  }

  @Override
  public int compareTo(Object o) {
    final int BEFORE = -1;
    final int EQUAL = 0;
    final int AFTER = 1;
    
		if ((o == null) || (this == null)) return EQUAL;
    Pips that = (Pips)o;
    
    if (getValue() < that.getValue()) { return AFTER; }
    else if (getValue() > that.getValue()) { return BEFORE; }
    
    return EQUAL;
  }
}
