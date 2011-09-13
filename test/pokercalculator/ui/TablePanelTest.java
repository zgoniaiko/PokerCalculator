package pokercalculator.ui;

import java.awt.Component;
import javax.swing.ImageIcon;
import org.junit.*;
import static org.junit.Assert.*;
import pokercalculator.lib.Card;

/**
 *
 * @author Ivan Zgoniaiko <zgoniaiko [at] gmail.com>
 */
public class TablePanelTest {
  private CardLargeButton cardButton;
  private TablePanel tablePanel;
  
  public TablePanelTest() {
  }

  @BeforeClass
  public static void setUpClass() throws Exception {
  }

  @AfterClass
  public static void tearDownClass() throws Exception {
  }
  
  @Before
  public void setUp() {
    tablePanel = new TablePanel();
  }
  
  @After
  public void tearDown() {
  }

  @Test
  public void testButtonsPlacedOnPanel() {
    Component[] buttons = tablePanel.getComponents();

    assertEquals("table panel contain 5 components", 5, buttons.length);
    assertEquals("1-st component on hand panel is card button", CardLargeButton.class, buttons[0].getClass());
    assertEquals("last component on hand panel is card button", CardLargeButton.class, buttons[buttons.length-1].getClass());
  }
  
  @Test
  public void testHandCardContainLargeIconOfCard() {
    Component[] buttons = tablePanel.getComponents();
    cardButton = (CardLargeButton) buttons[0];
    
    Card card = cardButton.getCard();
    
    String path = cardButton.getIconPath() + (card.getRevertedName() + ".gif");
    java.net.URL imgURL = getClass().getResource(path);
    ImageIcon icon = new ImageIcon(imgURL, card.toString());
    
    assertTrue("button have large image icon", ((ImageIcon) cardButton.getIcon()).getImage().equals(icon.getImage()));
  }
  
}
