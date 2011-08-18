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
  private String[] pipsNames = {"a", "2", "3", "4", "5", "6", "7", "8", "9", "10", "j", "q", "k"};
  
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
    for (int i = 0; i<12; i++) {
      assertEquals(pipsNames[i], new Pips(i+1).toString());
    }
  }
  
  @Test
  public void testPipsCreatedFromString() {
    for (int i = 0; i<12; i++) {
      assertEquals(new Pips(i+1).toString(), new Pips(pipsNames[i]).toString());
    }
  }
  
  @Test(expected=NullPointerException.class)
  public void checkExpectedException()
  {
    Pips pips = new Pips(100);
  }
}
