package pokercalculator.ui;

import javax.swing.JPanel;
import pokercalculator.lib.Card;

/**
 *
 * @author Ivan Zgoniaiko <zgoniaiko [at] gmail.com>
 */
public class TablePanel extends JPanel {
  public TablePanel() {
      add(new CardButton(new Card("Qs"), true));
      add(new CardButton(new Card("Js"), true));
      add(new CardButton(new Card("Ts"), true));
      add(new CardButton(new Card("9s"), true));
      add(new CardButton(new Card("8s"), true));
  }  
}
