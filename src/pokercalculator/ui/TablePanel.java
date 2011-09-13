package pokercalculator.ui;

import javax.swing.JPanel;
import pokercalculator.lib.Card;

/**
 *
 * @author Ivan Zgoniaiko <zgoniaiko [at] gmail.com>
 */
public class TablePanel extends JPanel {
  public TablePanel() {
      CardLargeButton card1 = new CardLargeButton(new Card("Qs"));
      card1.updateIcon();
      
      CardLargeButton card2 = new CardLargeButton(new Card("Js"));
      card2.updateIcon();

      CardLargeButton card3 = new CardLargeButton(new Card("Ts"));
      card3.updateIcon();
      
      CardLargeButton card4 = new CardLargeButton(new Card("9s"));
      card4.updateIcon();
      
      CardLargeButton card5 = new CardLargeButton(new Card("8s"));
      card5.updateIcon();
            
      add(card1);
      add(card2);
      add(card3);
      add(card4);
      add(card5);
  }  
}
