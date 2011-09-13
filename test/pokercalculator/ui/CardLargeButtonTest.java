/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
package pokercalculator.ui;

import javax.swing.ImageIcon;
import org.junit.*;
import static org.junit.Assert.*;
import pokercalculator.lib.Card;

/**
 *
 * @author Ivan Zgoniaiko <zgoniaiko [at] gmail.com>
 */
public class CardLargeButtonTest {
  
  public CardLargeButtonTest() {
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
  public void testButtonCardContainLargeIconOfCard() {
    Card card = new Card("As");
    CardButton cardButton = new CardLargeButton(card);
    cardButton.updateIcon();
    
    java.net.URL imgURL = getClass().getResource(cardButton.getIconFilename());
    ImageIcon icon = new ImageIcon(imgURL, card.toString());
    
    assertTrue("button have image icon by default", ((ImageIcon) cardButton.getIcon()).getImage().equals(icon.getImage()));
    assertEquals("button's image description match card name", card.toString(), ((ImageIcon) cardButton.getIcon()).getDescription());
  }
}
