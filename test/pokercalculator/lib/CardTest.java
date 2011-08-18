package pokercalculator.lib;

import java.util.Arrays;
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
public class CardTest {
  
  public CardTest() {
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
  public void testAceIsLargerThenTwo()
  {
    Card ace = new Card(new Suit(1), new Pips(1));
    Card two = new Card(new Suit(1), new Pips(2));

    Card[] cards = new Card[2];
    cards[0] = ace;
    cards[1] = two;

    Arrays.sort(cards);
    assertEquals("Ace is 1-st in array", ace, cards[0]);
    assertEquals("2 is 2-nd in array", two, cards[1]);
  }

  @Test
  public void testAceIsLargerThenTwoReverse()
  {
    Card ace = new Card(new Suit(1), new Pips(1));
    Card two = new Card(new Suit(1), new Pips(2));
    
    Card[] reverseCards = new Card[2];
    reverseCards[0] = two;
    reverseCards[1] = ace;

    Arrays.sort(reverseCards);
    assertEquals("Ace is 1-st in array", ace, reverseCards[0]);
    assertEquals("2 is 2-nd in array", two, reverseCards[1]);
  }
}
