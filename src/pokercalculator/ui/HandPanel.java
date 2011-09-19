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
  
  public HandPanel(Hand hand) {
    this.hand = hand;
    Card[] cards = this.hand.getCards();
    
    for (int i=0; i<cards.length; i++) {
      CardButton cardButton = new CardLargeButton(cards[0]);
      cardButton.updateIcon();
      cardButton.addActionListener(new LargeCardActionListener());
              
      add(cardButton);
    }
  }
}
