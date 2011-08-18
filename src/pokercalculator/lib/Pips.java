package pokercalculator.lib;

/**
 *
 * @author Ivan Zgoniaiko <zgoniaiko [at] gmail.com>
 */
public class Pips {
  int pipsValue;

  Pips(int i)
  {
    if ((i < 1) || (i > 13)) throw new NullPointerException("Provided incorrect pips: " + i);
    pipsValue = i;
  }
  
  @Override
  public String toString()
  {
    if (pipsValue > 1 && pipsValue < 11)
      return String.valueOf(pipsValue);
    else if (pipsValue == 1)
      return "a";
    else if (pipsValue == 11)
      return "j";
    else if (pipsValue == 12)
      return "q";
    else if (pipsValue == 13)
      return "k";
    else throw new NullPointerException("Provided incorrect pips: " + pipsValue);
  }

  public int getValue()
  {
    return pipsValue;
  }  
}
