package pokercalculator.ui;

import javax.swing.JPanel;
import pokercalculator.lib.Card;

/**
 *
 * @author Ivan Zgoniaiko <zgoniaiko [at] gmail.com>
 */
public class TablePanel extends JPanel {
  public TablePanel() {
      add(new CardButton(new Card("Qs")));
      add(new CardButton(new Card("Js")));
      add(new CardButton(new Card("Ts")));
      add(new CardButton(new Card("9s")));
      add(new CardButton(new Card("8s")));
  }  
}
