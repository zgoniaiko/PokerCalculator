package pokercalculator.ui;

import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JPanel;
import pokercalculator.lib.Deck;

/**
 *
 * @author Ivan Zgoniaiko <zgoniaiko [at] gmail.com>
 */
class DeckPanel extends JPanel {

  public DeckPanel() {
    Deck deck = new Deck(52);
    
    setLayout(new GridLayout(4, 0, 2, 2));
    
    for (int i=0; i<deck.countCards(); i++) {
      CardButton cardButton = new CardButton(deck.getCardByIndex(i));
      
      add(cardButton);
    }
  }
  
}
