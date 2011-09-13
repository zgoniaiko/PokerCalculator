package pokercalculator.ui;

import pokercalculator.lib.Card;

/**
 *
 * @author Ivan Zgoniaiko <zgoniaiko [at] gmail.com>
 */
class CardLargeButton extends CardButton {
  
  public CardLargeButton(Card card) {
    super(card);
  }
  
  @Override
  public String getIconPath() {
    return "images/";
  }
}
