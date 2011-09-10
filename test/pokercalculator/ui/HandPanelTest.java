package pokercalculator.ui;

import java.awt.Component;
import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author Ivan Zgoniaiko <zgoniaiko [at] gmail.com>
 */
public class HandPanelTest {

  private HandPanel handPanel;
  
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
    handPanel = new HandPanel();
  }
  
  @After
  public void tearDown() {
  }

  @Test
  public void testButtonsPlacedOnPanel() {
    Component[] buttons = handPanel.getComponents();

    assertEquals("hand panel contain 2 components", 2, buttons.length);
    assertEquals("1-st component on hand panel is card button", CardButton.class, buttons[0].getClass());
    assertEquals("last component on hand panel is card button", CardButton.class, buttons[buttons.length-1].getClass());
  }
}
