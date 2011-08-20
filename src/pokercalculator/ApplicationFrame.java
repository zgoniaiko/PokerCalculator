package pokercalculator;

import java.awt.event.*;
import java.io.*;
import java.util.prefs.*;
import javax.swing.*;

/**
 *
 * @author Ivan Zgoniaiko <zgoniaiko [at] gmail.com>
 */
class ApplicationFrame extends JFrame {
  private Preferences node;
  private JFileChooser chooser;
  public static final int DEFAULT_WIDTH = 840;
  public static final int DEFAULT_HEIGHT = 600;
  
  ApplicationFrame()
  {
    setTitle("Chances calculator");

    loadPreferences();
    setupFileChooser();
    createMenu();
    createPanels();
  }

  private void loadPreferences() {
    // get position, size from preferences
    Preferences root = Preferences.userRoot();
    node = root.node("/poker_calculator");
    int left = node.getInt("left", 0);
    int top = node.getInt("top", 0);
    int width = node.getInt("width", DEFAULT_WIDTH);
    int height = node.getInt("height", DEFAULT_HEIGHT);

    setBounds(left, top, width, height);
  }

  private void setupFileChooser() {
    // set up file chooser that shows XML files
    chooser = new JFileChooser();
    chooser.setCurrentDirectory(new File("."));

    // accept all files ending with .xml
    chooser.setFileFilter(new XmlFileFilter());
  }

  private void createMenu() {
    JMenuBar menuBar = new JMenuBar();
    setJMenuBar(menuBar);
    JMenu menu = new JMenu("File");
    menuBar.add(menu);

    JMenuItem exportItem = new JMenuItem("Export preferences");
    menu.add(exportItem);
    exportItem.addActionListener(new MenuPreferencesExportActionListener());

    JMenuItem importItem = new JMenuItem("Import preferences");
    menu.add(importItem);
    importItem.addActionListener(new MenuPreferencesImportActionListener());

    JMenuItem exitItem = new JMenuItem("Exit");
    menu.add(exitItem);
    exitItem.addActionListener(new MenuExitActionListener());
  }

  private void createPanels() {
    Box hbox1 = Box.createHorizontalBox();
    hbox1.add(new DeckPanel());
  }

  private class MenuPreferencesImportActionListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent event)
    {
      if(chooser.showOpenDialog(ApplicationFrame.this) == JFileChooser.APPROVE_OPTION)
      {
        try
        {
          InputStream in = new FileInputStream(chooser.getSelectedFile());
          Preferences.importPreferences(in);
          in.close();
        }
        catch (Exception e) {}
      }
    }
  }

  private class MenuExitActionListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent event)
    {
      node.putInt("left", getX());
      node.putInt("top", getY());
      node.putInt("width", getWidth());
      node.putInt("height", getHeight());
      System.exit(0);
    }
  }

  private class MenuPreferencesExportActionListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent event)
    {
      if(chooser.showSaveDialog(ApplicationFrame.this) == JFileChooser.APPROVE_OPTION)
      {
        try
        {
          OutputStream out = new FileOutputStream(chooser.getSelectedFile());
          node.exportSubtree(out);
          out.close();
        }
        catch (Exception e) {}
      }
    }
  }
}
