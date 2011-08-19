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
public class PipsTest {
  private String[] pipsNames = {"2", "3", "4", "5", "6", "7", "8", "9", "T", "J", "Q", "K", "A"};

  public PipsTest() {
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
  public void testPipsCreatedFromInt() {
    for (int i = 0; i<13; i++) {
      assertEquals(pipsNames[i], new Pips(i+2).toString());
    }
  }

  @Test
  public void testPipsCreatedFromString() {
    for (int i = 0; i<13; i++) {
      assertTrue("pips created from int matches pips created from string", (new Pips(i+2)).equals(new Pips(pipsNames[i])));
    }
  }


  @Test(expected=NullPointerException.class)
  public void checkExpectedExceptionFromString()
  {
    Pips pips = new Pips("Foo");
  }

  @Test(expected=NullPointerException.class)
  public void checkExpectedExceptionFromInt()
  {
    Pips pips = new Pips(100);
  }

  @Test
  public void testSamePipsEquals() {
    Pips ace1 = new Pips(14);
    Pips ace2 = new Pips(14);
    Pips king = new Pips(13);

		assertEquals("A", ace1.toString());
    assertTrue("same pips should be equal", ace1.equals(ace2));
    assertFalse("different pips should not be equal", ace1.equals(king));
    assertTrue("equal pips should should have same hash code", ace1.hashCode() == ace2.hashCode());
		assertFalse("shouldn't blow up when comparing to null", ace1.equals(null));
  }

  @Test
  public void testAceIsHigherThenKing() {
    Pips ace = new Pips(14);
    Pips king = new Pips(13);

    assertTrue("ace higher then king", ace.getValue() > king.getValue());
  }
}
