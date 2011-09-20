package pokercalculator.ui;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import pokercalculator.lib.Deck;

/**
 *
 * @author Ivan Zgoniaiko <zgoniaiko [at] gmail.com>
 */
class DeckPanel extends JPanel {
  private Deck deck;
  private CardButton[] buttons;

  public DeckPanel(Deck deck) {
    this.deck = deck;
    buttons = new CardButton[this.deck.countCards()];
    
    setLayout(new GridLayout(4, 0, 2, 2));
    
    for (int i=0; i<this.deck.countCards(); i++) {
      buttons[i] = new CardButton(deck.getCardByIndex(i));
      buttons[i].updateIcon();
      buttons[i].addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
          CardButton btn = (CardButton) e.getSource();
          btn.setEnabled(false);
        }
      });
              
      add(buttons[i]);
    }
  }

  public CardButton[] getButtons() {
    return buttons;
  }
}
