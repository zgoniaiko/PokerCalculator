package pokercalculator.ui;

import pokercalculator.lib.Card;

/**
 *
 * @author Ivan Zgoniaiko <zgoniaiko [at] gmail.com>
 */
public class BoardPanel extends LargeCardButtonPanel {

  public BoardPanel() {
    buttons = new CardButton[5];

    LargeCardActionListener largeCardActionListener = new LargeCardActionListener();
    for (int i=0; i<5; i++) {
      buttons[i] = new CardLargeButton(new Card("Qs"));
      buttons[i].updateIcon();
      buttons[i].addActionListener(largeCardActionListener);

      add(buttons[i]);
    }
  }
}
