package pokercalculator;

import java.awt.Component;
import javax.swing.JMenu;
import java.awt.BorderLayout;
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
    assertEquals("only 1 panel placed on frame", 1, (frame.getContentPane().getComponents()).length);
    assertEquals("deck panel placed on frame", DeckPanel.class, frame.getContentPane().getComponent(0).getClass());
  }
}
