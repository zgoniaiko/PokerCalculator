package pokercalculator.ui;

import pokercalculator.lib.Card;
import pokercalculator.lib.Player;

/**
 *
 * @author Ivan Zgoniaiko <zgoniaiko [at] gmail.com>
 */
public class PlayerPanel extends LargeCardButtonPanel {
  private Player hand;

  public PlayerPanel(Player hand) {
    this.hand = hand;
    Card[] cards = this.hand.getCards();
    buttons = new CardButton[cards.length];

    LargeCardActionListener largeCardAction = new LargeCardActionListener();
    for (int i=0; i<cards.length; i++) {
      buttons[i] = new CardLargeButton(cards[i]);
      buttons[i].updateIcon();
      buttons[i].addActionListener(largeCardAction);

      add(buttons[i]);
    }
  }
}