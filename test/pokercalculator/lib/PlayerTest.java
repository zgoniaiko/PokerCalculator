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
public class PlayerTest {
  private Card ace = new Card("As");
  private Card king = new Card("Ks");
  private Card queen = new Card("Qs");
  private Player hand;

  public PlayerTest() {
  }

  @BeforeClass
  public static void setUpClass() throws Exception {
  }

  @AfterClass
  public static void tearDownClass() throws Exception {
  }

  @Before
  public void setUp() {
    hand = new Player();
    hand.add(ace);
    hand.add(king);
  }

  @After
  public void tearDown() {
  }

  @Test
  public void testCardsAddedOnHand() {
    hand = new Player();

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

  @Test
  public void testReplaceCard() {
    hand.replace(1, queen);
    assertTrue("1-st card is As", ((Card) hand.getCards()[0]).equals(ace));
    assertTrue("2-nd card is Qs", ((Card) hand.getCards()[1]).equals(queen));
  }

  @Test
  public void testRemoveLastCard() {
    hand.remove();
    assertTrue("1-st card is As", ((Card) hand.getCards()[0]).equals(ace));
    assertNull("2-nd card is null", (Card) hand.getCards()[1]);

    hand.remove();
    assertNull("1-st card is null", (Card) hand.getCards()[0]);
    assertNull("2-nd card is null", (Card) hand.getCards()[1]);
  }

  @Test
  public void testRemoveCardByIndex() {
    hand.remove(1);
    assertTrue("1-st card is As", ((Card) hand.getCards()[0]).equals(ace));
    assertNull("2-nd card is null", (Card) hand.getCards()[1]);
  }
}
