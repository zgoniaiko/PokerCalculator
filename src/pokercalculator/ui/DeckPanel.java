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

  public DeckPanel(Deck deck) {
    this.deck = deck;
    
    setLayout(new GridLayout(4, 0, 2, 2));
    
    for (int i=0; i<this.deck.countCards(); i++) {
      CardButton cardButton = new CardButton(deck.getCardByIndex(i));
      cardButton.updateIcon();
      cardButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
          CardButton btn = (CardButton) e.getSource();
          btn.setEnabled(false);
        }
      });
              
      add(cardButton);
    }
  }
  
}
