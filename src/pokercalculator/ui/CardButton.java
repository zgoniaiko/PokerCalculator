package pokercalculator.ui;

import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import pokercalculator.lib.Card;

/**
 *
 * @author Ivan Zgoniaiko <zgoniaiko [at] gmail.com>
 */
public class CardButton extends JButton {

  private Card card;
  
  public CardButton(Card card) {
    this.card = card;
  }
  
  public Card getCard() {
    return card;
  }

  public void removeCard() {
    this.card = null;
  }
  
  public void updateIcon() {
    setIcon(createImageIcon(getIconFilename(), getCardName()));
  }

  public String getIconFilename() {
    return getIconPath() + getRevertedCardName() + ".gif";
  }
  
  public String getIconPath() {
    return "images/small/";
  }
  
  protected String getCardName() {
    return (!(card == null)) ? card.toString() : "ec";
  }
  
  protected String getRevertedCardName() {
    return (!(card == null)) ? card.getRevertedName() : "ec";
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
