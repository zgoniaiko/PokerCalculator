package pokercalculator.ui;

import javax.swing.JPanel;
import pokercalculator.lib.Card;

/**
 *
 * @author Ivan Zgoniaiko <zgoniaiko [at] gmail.com>
 */
public class TablePanel extends JPanel {
  private CardButton[] buttons;
  
  public TablePanel() {
      buttons = new CardButton[5];
      
      buttons[0] = new CardLargeButton(new Card("Qs"));
      buttons[0].updateIcon();
      buttons[0].addActionListener(new LargeCardActionListener());
      
      buttons[1] = new CardLargeButton(new Card("Js"));
      buttons[1].updateIcon();
      buttons[1].addActionListener(new LargeCardActionListener());

      buttons[2] = new CardLargeButton(new Card("Ts"));
      buttons[2].updateIcon();
      buttons[2].addActionListener(new LargeCardActionListener());
      
      buttons[3] = new CardLargeButton(new Card("9s"));
      buttons[3].updateIcon();
      buttons[3].addActionListener(new LargeCardActionListener());
      
      buttons[4] = new CardLargeButton(new Card("8s"));
      buttons[4].updateIcon();
      buttons[4].addActionListener(new LargeCardActionListener());
            
      add(buttons[0]);
      add(buttons[1]);
      add(buttons[2]);
      add(buttons[3]);
      add(buttons[4]);
  }

  public CardButton[] getButtons() {
    return buttons;
  }
}
