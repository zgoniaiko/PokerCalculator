package pokercalculator.ui;

import javax.swing.JPanel;
import pokercalculator.lib.Card;

/**
 *
 * @author Ivan Zgoniaiko <zgoniaiko [at] gmail.com>
 */
public class HandPanel extends JPanel {
  
  public HandPanel() {
      add(new CardButton(new Card("As"), true));
      add(new CardButton(new Card("Ks"), true));
  }
  
}
