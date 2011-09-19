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
      card1.addActionListener(new LargeCardActionListener());
      
      CardButton card2 = new CardLargeButton(new Card("Js"));
      card2.updateIcon();
      card2.addActionListener(new LargeCardActionListener());

      CardButton card3 = new CardLargeButton(new Card("Ts"));
      card3.updateIcon();
      card3.addActionListener(new LargeCardActionListener());
      
      CardButton card4 = new CardLargeButton(new Card("9s"));
      card4.updateIcon();
      card4.addActionListener(new LargeCardActionListener());
      
      CardButton card5 = new CardLargeButton(new Card("8s"));
      card5.updateIcon();
      card5.addActionListener(new LargeCardActionListener());
            
      add(card1);
      add(card2);
      add(card3);
      add(card4);
      add(card5);
  }  
}
