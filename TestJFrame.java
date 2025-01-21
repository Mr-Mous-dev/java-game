import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import java.net.URL;

public class TestJFrame {
    public static void main(String[] args) {
        JFrame fenster = new JFrame(); 
        fenster.setSize(1920, 1080);
        fenster.setVisible(true);
        fenster.setTitle("Videospiel");
        fenster.toFront();
        URL iconURL = TestJFrame.class.getResource("./auto_brum_brum_videospiel_3D_i.jpeg");
        ImageIcon icon = new ImageIcon(iconURL);
        fenster.setIconImage(icon.getImage());  
    }
}
