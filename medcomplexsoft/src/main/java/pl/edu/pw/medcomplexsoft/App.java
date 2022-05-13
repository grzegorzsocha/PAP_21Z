package pl.edu.pw.medcomplexsoft;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import pl.edu.pw.medcomplexsoft.database.Database;
import pl.edu.pw.medcomplexsoft.gui.LoginWindow;

public class App
{
    public static void main( String[] args ) {
        Database.initialize();
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {

                JFrame loginWindow = new LoginWindow();
                loginWindow.setVisible(true);
            }
        });
        Runtime.getRuntime().addShutdownHook(new Thread() {
            @Override
            public void run() {
                Database.close();
            }
        });
    }
}
