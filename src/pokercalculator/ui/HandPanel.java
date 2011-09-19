package pokercalculator.ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import pokercalculator.lib.Card;

/**
 *
 * @author Ivan Zgoniaiko <zgoniaiko [at] gmail.com>
 */
public class HandPanel extends JPanel {
  
  public HandPanel() {
      CardButton card1 = new CardLargeButton(new Card("As"));
      card1.updateIcon();
      card1.addActionListener(new LargeCardActionListener());
      
      CardButton card2 = new CardLargeButton(new Card("Ks"));
      card2.updateIcon();
      card2.addActionListener(new LargeCardActionListener());
      
      add(card1);
      add(card2);
  }
  
}
