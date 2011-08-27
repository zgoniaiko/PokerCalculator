package pokercalculator;

import javax.swing.JButton;
import pokercalculator.lib.Card;

/**
 *
 * @author Ivan Zgoniaiko <zgoniaiko [at] gmail.com>
 */
class CardButton extends JButton{

  private Card card;
  
  public CardButton(Card card) {
    this.card = card;
    setText(card.toString());
  }
  
  public Card getCard() {
    return card;
  }
}
