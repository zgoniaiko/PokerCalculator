package pokercalculator;

import pokercalculator.lib.Card;
import pokercalculator.lib.Deck;
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
    assertEquals("button label match card's name", card.toString(), cardButton.getText());
  }
}
