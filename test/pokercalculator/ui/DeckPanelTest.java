package pokercalculator.ui;

import java.awt.GridLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.LayoutManager;
import javax.swing.JButton;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import pokercalculator.lib.Deck;

/**
 *
 * @author Ivan Zgoniaiko <zgoniaiko [at] gmail.com>
 */
public class DeckPanelTest {
  
  private DeckPanel deckPanel;
  
  public DeckPanelTest() {
  }

  @BeforeClass
  public static void setUpClass() throws Exception {
  }

  @AfterClass
  public static void tearDownClass() throws Exception {
  }
  
  @Before
  public void setUp() {
    deckPanel = new DeckPanel(new Deck(52));
  }
  
  @After
  public void tearDown() {
  }

  @Test
  public void testButtonsPlacedOnPanel() {
    CardButton[] buttons = deckPanel.getButtons();
    
    assertEquals("deck panel contain 52 components", 52, buttons.length);
    assertEquals("1-st component on deck panel is card button", CardButton.class, buttons[0].getClass());
    assertEquals("last component on deck panel is card button", CardButton.class, buttons[buttons.length-1].getClass());
//    assertEquals("buttons have preferred size", new Dimension(26, 35), buttons[0].getSize());
  }
  
  @Test
  public void testLayout() {
    LayoutManager layout = deckPanel.getLayout();
    
    assertEquals("deck panel use GridLayout layout", GridLayout.class, layout.getClass());
    assertEquals("layout have 4 rows", 4, ((GridLayout) layout).getRows());
    assertEquals("layout have gap between columns", 2, ((GridLayout) layout).getHgap());
    assertEquals("layout have gap between rows", 2, ((GridLayout) layout).getVgap());
  }
  
  @Test
  public void testDeckCardDisabledAfterClick() {
    CardButton[] buttons = deckPanel.getButtons();
    CardButton cardButton = buttons[0];
            
    assertTrue("deck button enabled", cardButton.isEnabled());
    cardButton.doClick();
    assertFalse("deck button disabled after click", cardButton.isEnabled());
  }
}
