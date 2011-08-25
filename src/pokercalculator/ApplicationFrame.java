package pokercalculator;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.*;
import java.io.*;
import java.util.prefs.*;
import javax.swing.*;

/**
 *
 * @author Ivan Zgoniaiko <zgoniaiko [at] gmail.com>
 */
class ApplicationFrame extends JFrame {
  private JFileChooser chooser;
  public static final String TITLE = "Poker Chances Calculator";
  
  ApplicationFrame()
  {
    setTitle(TITLE);

    setupFileChooser();
    createMenu();
    createPanels();
    
    addWindowListener(new WindowAdapter() {
      @Override
        public void windowClosing(WindowEvent ev) {
          ApplicationPreferences preferences = new ApplicationPreferences();
          preferences.setPosition(getBounds());
          preferences.setAlwaysOnTop(isAlwaysOnTop());

          System.exit(0);
        }
    });

    
    ApplicationPreferences preferences = new ApplicationPreferences();
    
    setBounds(preferences.getPosition());
    setAlwaysOnTop(preferences.isAlwaysOnTop());
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
    Container contentPane = getContentPane();
    contentPane.setLayout(new BorderLayout());

    contentPane.add(new DeckPanel());
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
          ApplicationPreferences preferences = new ApplicationPreferences();
          preferences.setPosition(getBounds());
          preferences.setAlwaysOnTop(isAlwaysOnTop());
          preferences.getPreferences().exportSubtree(out);
          out.close();
        }
        catch (Exception e) {}
      }
    }
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
      ApplicationPreferences preferences = new ApplicationPreferences();
      preferences.setPosition(getBounds());
      preferences.setAlwaysOnTop(isAlwaysOnTop());
      System.exit(0);
    }
  }
}
