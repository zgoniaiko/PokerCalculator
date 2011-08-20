package pokercalculator;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.prefs.Preferences;

/**
 *
 * @author Ivan Zgoniaiko <zgoniaiko [at] gmail.com>
 */
public class PokerCalculator {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    final ApplicationFrame frame = new ApplicationFrame();
    frame.addWindowListener(new WindowAdapter() {
      @Override
        public void windowClosing(WindowEvent ev) {
          Preferences root = Preferences.userRoot();
          Preferences node = root.node("/poker_calculator");

          node.putInt("left", frame.getX());
          node.putInt("top", frame.getY());
          node.putInt("width", frame.getWidth());
          node.putInt("height", frame.getHeight());

          System.exit(0);
        }
    });
    frame.setAlwaysOnTop(true);
    frame.setVisible(true);
  }
}
