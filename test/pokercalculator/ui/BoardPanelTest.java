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
public class BoardPanelTest {
  private CardButton cardButton;
  private BoardPanel boardPanel;

  public BoardPanelTest() {
  }

  @BeforeClass
  public static void setUpClass() throws Exception {
  }

  @AfterClass
  public static void tearDownClass() throws Exception {
  }

  @Before
  public void setUp() {
    boardPanel = new BoardPanel();
  }

  @After
  public void tearDown() {
  }

  @Test
  public void testButtonsPlacedOnPanel() {
    CardButton[] buttons = boardPanel.getButtons();

    assertEquals("board panel contain 5 components", 5, buttons.length);
    assertEquals("1-st component on hand panel is card button", CardLargeButton.class, buttons[0].getClass());
    assertEquals("last component on hand panel is card button", CardLargeButton.class, buttons[buttons.length-1].getClass());
  }

  @Test
  public void testBoardCardContainLargeIconOfCard() {
    CardButton[] buttons = boardPanel.getButtons();
    cardButton = buttons[0];

    Card card = cardButton.getCard();

    String path = cardButton.getIconPath() + (card.getRevertedName() + ".gif");
    java.net.URL imgURL = getClass().getResource(path);
    ImageIcon icon = new ImageIcon(imgURL, card.toString());

    assertTrue("button have large image icon", ((ImageIcon) cardButton.getIcon()).getImage().equals(icon.getImage()));
  }

  @Test
  public void testBoardCardContainLargeIconOfEmptyCard() {
    CardButton[] buttons = boardPanel.getButtons();
    cardButton = buttons[0];

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
}