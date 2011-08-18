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
          
  @Test
  public void testSuitCreatedFromString() {            
    for (int i = 0; i<4; i++) {
      assertEquals(new Suit(i+1).toString(), new Suit(suitNames[i]).toString());
    }
  }
  
  @Test(expected=NullPointerException.class)
  public void checkExpectedException()
  {
    Suit suit = new Suit(5);
  }
}
