package pokercalculator;

import javax.swing.ImageIcon;
import pokercalculator.lib.Card;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Ivan Zgoniaiko <zgoniaiko [at] gmail.com>
 */
public class CardButtonTest {
  
  public CardButtonTest() {
  }

  @BeforeClass
  public static void setUpClass() throws Exception {
  }

  @AfterClass
  public static void tearDownClass() throws Exception {
  }
  
  @Before
  public void setUp() {
  }
  
  @After
  public void tearDown() {
  }

  @Test
  public void testButtonCardContainSameCard() {
    Card card = new Card("As");
    CardButton cardButton = new CardButton(card);
    assertTrue("button contain same card", cardButton.getCard().equals(card));
    assertEquals("button label match is empty", "", cardButton.getText());
  }
  
  @Test
  public void testButtonCardContainIconOfCard() {
    Card card = new Card("As");
    CardButton cardButton = new CardButton(card);
    
    String path = CardButton.ICON_PATH + (card.getRevertedName() + ".gif");
    java.net.URL imgURL = getClass().getResource(path);
    ImageIcon icon = new ImageIcon(imgURL, card.toString());
    
    assertTrue("button have image icon by default", ((ImageIcon) cardButton.getIcon()).getImage().equals(icon.getImage()));
    assertEquals("button's image description match card name", card.toString(), ((ImageIcon) cardButton.getIcon()).getDescription());
  }
}
