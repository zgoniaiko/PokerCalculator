package pokercalculator.lib;

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
public class DeckTest {
  
  public DeckTest() {
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
  public void testEmptyDeckHaveNoCards() {
    assertEquals("empty deck have no cards", 0, new Deck(0).countCards());
  }
  
  @Test
  public void testDeckHaveCards() {
    final Deck deck = new Deck(52);
    
    assertEquals("deck have cards", 52, deck.countCards());
    assertEquals("1-st card is 2s", new Card("2s"), deck.getCardByIndex(0));
    assertEquals("2-nd card is 3s", new Card("3s"), deck.getCardByIndex(1));
    assertEquals("last card in suit is As", new Card("As"), deck.getCardByIndex(12));
    assertEquals("next suit is clubs", new Card("2c"), deck.getCardByIndex(13));
    assertEquals("last card in clubs is Ac", new Card("Ac"), deck.getCardByIndex(25));
    assertEquals("next suit is diamonds", new Card("2d"), deck.getCardByIndex(26));
    assertEquals("last card in diamonds is Ad", new Card("Ad"), deck.getCardByIndex(38));
    assertEquals("next suit is hearts", new Card("2h"), deck.getCardByIndex(39));
    assertEquals("last card is Kh", new Card("Kh"), deck.getCardByIndex(50));
    assertEquals("last card is Ah", new Card("Ah"), deck.getCardByIndex(51));
  }
}
