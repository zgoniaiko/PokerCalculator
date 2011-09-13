package pokercalculator.ui;

import javax.swing.JPanel;
import pokercalculator.lib.Card;

/**
 *
 * @author Ivan Zgoniaiko <zgoniaiko [at] gmail.com>
 */
public class TablePanel extends JPanel {
  public TablePanel() {
      add(new CardLargeButton(new Card("Qs")));
      add(new CardLargeButton(new Card("Js")));
      add(new CardLargeButton(new Card("Ts")));
      add(new CardLargeButton(new Card("9s")));
      add(new CardLargeButton(new Card("8s")));
  }  
}
