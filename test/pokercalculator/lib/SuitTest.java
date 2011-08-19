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
public class SuitTest {
  private String[] suitNames = {"s", "c", "d", "h"};

  public SuitTest() {
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
  public void testSuitCreatedFromInt() {
    for (int i = 0; i<4; i++) {
      assertEquals(suitNames[i], new Suit(i+1).toString());
    }
  }

  @Test(expected=NullPointerException.class)
  public void checkExpectedExceptionFromInt()
  {
    Suit suit = new Suit(5);
  }

  @Test
  public void testSuitCreatedFromString() {
    for (int i = 0; i<4; i++) {
      assertTrue("suits created from int matches suits created from string", new Suit(i+1).equals(new Suit(suitNames[i])));
    }
  }

  @Test(expected=NullPointerException.class)
  public void checkExpectedExceptionFromString()
  {
    Suit suit = new Suit("W");
  }

  @Test
  public void testSameSuitsEquals() {
    Suit spades1 = new Suit(1);
    Suit spades2 = new Suit(1);
    Suit clubs = new Suit(2);

		assertEquals("s", spades1.toString());
    assertTrue("same suits should be equal", spades1.equals(spades2));
    assertFalse("different suits should not be equal", spades1.equals(clubs));
    assertTrue("equal suits should should have same hash code", spades1.hashCode() == spades2.hashCode());
		assertFalse("shouldn't blow up when comparing to null", spades1.equals(null));
  }
}
