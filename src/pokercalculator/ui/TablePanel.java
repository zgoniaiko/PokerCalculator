package pokercalculator.ui;

import javax.swing.JPanel;
import pokercalculator.lib.Card;

/**
 *
 * @author Ivan Zgoniaiko <zgoniaiko [at] gmail.com>
 */
public class TablePanel extends JPanel {
  public TablePanel() {
      CardButton card1 = new CardLargeButton(new Card("Qs"));
      card1.updateIcon();
      
      CardButton card2 = new CardLargeButton(new Card("Js"));
      card2.updateIcon();

      CardButton card3 = new CardLargeButton(new Card("Ts"));
      card3.updateIcon();
      
      CardButton card4 = new CardLargeButton(new Card("9s"));
      card4.updateIcon();
      
      CardButton card5 = new CardLargeButton(new Card("8s"));
      card5.updateIcon();
            
      add(card1);
      add(card2);
      add(card3);
      add(card4);
      add(card5);
  }  
}
