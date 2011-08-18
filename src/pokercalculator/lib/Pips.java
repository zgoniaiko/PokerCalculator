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

  Pips(String pipsString) {
    String pips = pipsString.trim().toLowerCase();
    
    if (pips.equals("a")) {
      pipsValue = 1;
    } else if (pips.equals("2")) {
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
    } else if (pips.equals("10")) {
      pipsValue = 10;
    } else if (pips.equals("j")) {
      pipsValue = 11;
    } else if (pips.equals("q")) {
      pipsValue = 12;
    } else if (pips.equals("k")) {
      pipsValue = 13;
    } else {
      throw new NullPointerException("Provided incorrect pips: " + pipsString);
    }
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
