/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
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
public class HandTest {
  
  public HandTest() {
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
  public void testHandHaveTwoCards() {
    Card ace = new Card("As");
    Card king = new Card("Ks");
    Card queen = new Card("Qs");
    
    Hand hand = new Hand();
    hand.add(ace);
    assertTrue("1-st card is As", ((Card) hand.getCards()[0]).equals(ace));
    assertNull("2-nd card is null", (Card) hand.getCards()[1]);
    
    hand.add(king);
    assertTrue("1-st card is As", ((Card) hand.getCards()[0]).equals(ace));
    assertTrue("2-nd card is Ks", ((Card) hand.getCards()[1]).equals(king));
    
    hand.add(queen);
    assertTrue("1-st card is As", ((Card) hand.getCards()[0]).equals(ace));
    assertTrue("2-nd card is Ks", ((Card) hand.getCards()[1]).equals(king));
  }
}
