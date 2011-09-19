package pokercalculator.ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Ivan Zgoniaiko <zgoniaiko [at] gmail.com>
 */
class LargeCardActionListener implements ActionListener {

  @Override
  public void actionPerformed(ActionEvent e) {
    CardButton btn = (CardButton) e.getSource();
    btn.removeCard();
    btn.updateIcon();
  }
  
}