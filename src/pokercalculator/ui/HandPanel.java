package pokercalculator.ui;

import javax.swing.JPanel;
import pokercalculator.lib.Card;

/**
 *
 * @author Ivan Zgoniaiko <zgoniaiko [at] gmail.com>
 */
public class HandPanel extends JPanel {
  
  public HandPanel() {
      CardLargeButton card1 = new CardLargeButton(new Card("As"));
      card1.updateIcon();
      
      CardLargeButton card2 = new CardLargeButton(new Card("Ks"));
      card2.updateIcon();
      
      add(card1);
      add(card2);
  }
  
}
