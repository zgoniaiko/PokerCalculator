package pokercalculator.ui;

import java.awt.Component;
import javax.swing.ImageIcon;
import org.junit.*;
import static org.junit.Assert.*;
import pokercalculator.lib.Card;
import pokercalculator.lib.Hand;

/**
 *
 * @author Ivan Zgoniaiko <zgoniaiko [at] gmail.com>
 */
public class HandPanelTest {

  private HandPanel handPanel;
  private Hand hand;
  private Hand emptyHand;
  
  public HandPanelTest() {
  }

  @BeforeClass
  public static void setUpClass() throws Exception {
  }

  @AfterClass
  public static void tearDownClass() throws Exception {
  }
  
  @Before
  public void setUp() {
    hand = new Hand();
    hand.add(new Card("As"));
    hand.add(new Card("Ks"));
    
    emptyHand = new Hand();
    handPanel = new HandPanel(hand);
  }
  
  @After
  public void tearDown() {
  }

  @Test
  public void testButtonsPlacedOnPanel() {
    Component[] buttons = handPanel.getComponents();

    assertEquals("hand panel contain 2 components", 2, buttons.length);
    assertEquals("1-st component on hand panel is card button", CardLargeButton.class, buttons[0].getClass());
    assertEquals("last component on hand panel is card button", CardLargeButton.class, buttons[buttons.length-1].getClass());
  }
  
  @Test
  public void testHandCardContainLargeIconOfCard() {
    Component[] buttons = handPanel.getComponents();

    CardButton cardButton = (CardButton) buttons[0];
    Card card = cardButton.getCard();
    
    String path = cardButton.getIconPath() + (card.getRevertedName() + ".gif");
    java.net.URL imgURL = getClass().getResource(path);
    ImageIcon icon = new ImageIcon(imgURL, card.toString());
    
    assertTrue("button have large image icon", ((ImageIcon) cardButton.getIcon()).getImage().equals(icon.getImage()));
  }
  
  @Test
  public void testHandCardContainLargeIconOfEmptyCard() {
    Component[] buttons = handPanel.getComponents();

    CardButton cardButton = (CardButton) buttons[0];
    Card card = cardButton.getCard();
    
    String oldPath = cardButton.getIconPath() + (card.getRevertedName() + ".gif");
    java.net.URL oldImgURL = getClass().getResource(oldPath);
    ImageIcon oldIcon = new ImageIcon(oldImgURL, card.toString());
    
    String path = cardButton.getIconPath() + "ec.gif";
    java.net.URL imgURL = getClass().getResource(path);
    ImageIcon icon = new ImageIcon(imgURL, card.toString());
        
    assertTrue("button have large image icon", ((ImageIcon) cardButton.getIcon()).getImage().equals(oldIcon.getImage()));
    cardButton.doClick();
    assertNull("button have don't have card", cardButton.getCard());
    assertTrue("button have large empty card icon", ((ImageIcon) cardButton.getIcon()).getImage().equals(icon.getImage()));
  }
  
  @Test
  public void testHandCardsEmptyByDefault() {
    handPanel = new HandPanel(emptyHand);
    Component[] buttons = handPanel.getComponents();

    CardButton cardButton = (CardButton) buttons[0];
    Card card = cardButton.getCard();
    
    String path = cardButton.getIconPath() + "ec.gif";
    java.net.URL imgURL = getClass().getResource(path);
    ImageIcon icon = new ImageIcon(imgURL, null);
        
    assertNull("button don't have card", cardButton.getCard());
    assertTrue("button have large empty card icon", ((ImageIcon) cardButton.getIcon()).getImage().equals(icon.getImage()));
  }

  @Test
  @Ignore
  public void testRemoveOfCardFromHandShouldRemoveCardFromPanel() {
    hand.remove();
    Component[] buttons = handPanel.getComponents();
    CardButton cardButton = (CardButton) buttons[1];
    
    assertNull("button don't have card", cardButton.getCard());
  }
}
