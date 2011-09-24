/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
package pokercalculator.ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import pokercalculator.lib.Card;

/**
 *
 * @author Ivan Zgoniaiko <zgoniaiko [at] gmail.com>
 */
public class LargeCardButtonPanel extends JPanel {
  protected CardButton[] buttons;

  public LargeCardButtonPanel() {
  }

  public CardButton[] getButtons() {
    return buttons;
  }

  public void returnCard(Card card) {
  }

  class LargeCardActionListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
      CardButton btn = (CardButton) e.getSource();
      returnCard(btn.getCard());
      btn.removeCard();
      btn.updateIcon();
    }
  }

}
