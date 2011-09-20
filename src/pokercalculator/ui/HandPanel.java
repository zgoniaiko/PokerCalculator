package pokercalculator.ui;

import javax.swing.JPanel;
import pokercalculator.lib.Card;
import pokercalculator.lib.Hand;

/**
 *
 * @author Ivan Zgoniaiko <zgoniaiko [at] gmail.com>
 */
public class HandPanel extends JPanel {
  private Hand hand;
  private CardButton[] buttons;
  
  public HandPanel(Hand hand) {
    this.hand = hand;
    Card[] cards = this.hand.getCards();
    buttons = new CardButton[cards.length];
    
    for (int i=0; i<cards.length; i++) {
      buttons[i] = new CardLargeButton(cards[i]);
      buttons[i].updateIcon();
      buttons[i].addActionListener(new LargeCardActionListener());
              
      add(buttons[i]);
    }
  }

  public CardButton[] getButtons() {
    return buttons;
  }
}
