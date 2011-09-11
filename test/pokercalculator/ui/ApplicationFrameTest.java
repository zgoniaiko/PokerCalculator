package pokercalculator.ui;

import java.awt.Component;
import javax.swing.JMenu;
import java.awt.BorderLayout;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JMenuBar;
import org.junit.Ignore;
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
public class ApplicationFrameTest {
  private ApplicationFrame frame;
  
  public ApplicationFrameTest() {
  }

  @BeforeClass
  public static void setUpClass() throws Exception {
  }

  @AfterClass
  public static void tearDownClass() throws Exception {
  }
  
  @Before
  public void setUp() {
    frame = new ApplicationFrame();
  }
  
  @After
  public void tearDown() {
  }

  @Test
  public void testTitleSpecified() {
    assertEquals("title specified", ApplicationFrame.TITLE, frame.getTitle());
  }
  
  @Test
  public void testFrameUseBorderLayout() {
    assertEquals("layout specified", BorderLayout.class, frame.getContentPane().getLayout().getClass());
  }
  
  @Test
  public void testMenuAdded() {
    JMenuBar menu = frame.getJMenuBar();
    
    assertNotNull("menu created", menu);
 
    Component[] topMenus = menu.getComponents();
    assertEquals("menu have 1 top menu element", 1, topMenus.length);
    
    JMenu menuFile = (JMenu) topMenus[0];
    assertEquals("1-st menu name is File", "File", menuFile.getText());
    
    Component[] menuFileItems = menuFile.getMenuComponents();
    assertEquals("menu file have 3 menu items", 3, menuFileItems.length);    
  }
  
  @Test
  public void testDeckPanelPlacedOnFrame() {
    assertEquals("only 1 box placed on frame", 1, (frame.getContentPane().getComponents()).length);
    
    Box vBox = (Box) frame.getContentPane().getComponent(0);
    assertEquals("box placed on frame", Box.class, vBox.getClass());
    assertEquals("vertical box placed on frame", BoxLayout.Y_AXIS, ((BoxLayout) vBox.getLayout()).getAxis());
    assertEquals("only 2 boxes placed on vertical box", 2, vBox.getComponents().length);

    Box handBox = (Box) vBox.getComponent(0);
    assertEquals("1-st horizontal box on vertical box", BoxLayout.X_AXIS, ((BoxLayout) handBox.getLayout()).getAxis());
    assertEquals("hand panel placed on box", HandPanel.class, handBox.getComponent(0).getClass());
    assertEquals("table panel placed on box", TablePanel.class, handBox.getComponent(1).getClass());
    
    Box deckBox = (Box) vBox.getComponent(1);
    assertEquals("2-nd horizontal box on vertical box", BoxLayout.X_AXIS, ((BoxLayout) deckBox.getLayout()).getAxis());
    assertEquals("deck panel placed on frame", DeckPanel.class, deckBox.getComponent(0).getClass());
  }
}
