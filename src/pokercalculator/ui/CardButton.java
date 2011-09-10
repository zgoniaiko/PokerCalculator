package pokercalculator.ui;

import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import pokercalculator.lib.Card;

/**
 *
 * @author Ivan Zgoniaiko <zgoniaiko [at] gmail.com>
 */
class CardButton extends JButton{

  private Card card;
  public static final String ICON_PATH = "images/small/"; 
  
  public CardButton(Card card) {
    this.card = card;
    
    String path = ICON_PATH + (card.getRevertedName() + ".gif");
    setIcon(createImageIcon(path, card.toString()));
  }
  
  public Card getCard() {
    return card;
  }
  
  private ImageIcon createImageIcon(String path, String description) {
    URL imgURL = getClass().getResource(path);
    if (imgURL != null) {
        return new ImageIcon(imgURL, description);
    } else {
        System.err.println("Couldn't find file: " + path);
        return null;
    }
  }
}
