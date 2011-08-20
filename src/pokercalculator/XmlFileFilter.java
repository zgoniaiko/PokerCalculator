package pokercalculator;

import java.io.File;
import javax.swing.filechooser.FileFilter;

/**
 *
 * @author Ivan Zgoniaiko <zgoniaiko [at] gmail.com>
 */
public class XmlFileFilter extends FileFilter {

  @Override
  public boolean accept(File f)
  {
      return f.getName().toLowerCase().endsWith(".xml") || f.isDirectory();
  }

  @Override
  public String getDescription()
  {
      return "XML files";
  }
}