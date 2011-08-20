package pokercalculator;

import java.awt.*;
import java.util.prefs.Preferences;
import javax.swing.JFrame;

/**
 *
 * @author Ivan Zgoniaiko <zgoniaiko [at] gmail.com>
 */
public class ApplicationPreferences {
  public static final int DEFAULT_WIDTH = 840;
  public static final int DEFAULT_HEIGHT = 600;
  public static final boolean DEFAULT_ALWAYS_ON_TOP = false;
  
 // private Preferences preferences;

  public void ApplicationPreferences() {
//    Preferences root = Preferences.userRoot();
//    preferences = root.node("/poker-calculator");
  }
  
  public void save(JFrame frame) {
//    preferences.putInt("left", frame.getX());
//    preferences.putInt("top", frame.getY());
//    preferences.putInt("width", frame.getWidth());
//    preferences.putInt("height", frame.getHeight());
  }

  public Preferences getPreferences() {
    Preferences root = Preferences.userRoot();
    Preferences preferences = root.node("/poker-calculator");
    
    return preferences;
  }
  
  public Rectangle getPosition() {
    Preferences preferences = getPreferences();
    
    int left = preferences.getInt("left", 0);
    int top = preferences.getInt("top", 0);
    int width = preferences.getInt("width", DEFAULT_WIDTH);
    int height = preferences.getInt("height", DEFAULT_HEIGHT);
    
    return new Rectangle(new Point(left, top), new Dimension(width, height));
  }

  public void setPosition(Rectangle rect) {
    Preferences preferences = getPreferences();
    preferences.putInt("left", (int)rect.getX());
    preferences.putInt("top", (int)rect.getY());
    preferences.putInt("width", (int)rect.getWidth());
    preferences.putInt("height", (int)rect.getHeight());
  }
  
  public boolean isAlwaysOnTop() {
    Preferences preferences = getPreferences();
    return preferences.getBoolean("always-on-top", DEFAULT_ALWAYS_ON_TOP);
  }
  
  public void setAlwaysOnTop(boolean isAlwaysOnTop) {
    Preferences preferences = getPreferences();
    preferences.putBoolean("always-on-top", isAlwaysOnTop);
  }
}
