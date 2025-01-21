import javax.swing.ImageIcon;
import javax.swing.JFrame;
import java.net.URL;

public class TestJFrame {
    public static void main(String[] args) {
        JFrame fenster = new JFrame(); 
        fenster.setSize(1920, 1080);
        fenster.setVisible(true);
        fenster.setTitle("Videospiel");
        fenster.toFront();
        
        // Icon laden
        URL iconURL = TestJFrame.class.getResource("auto_brum_brum_videospiel_3D_i.jpeg");
        ImageIcon icon = new ImageIcon(iconURL);
        fenster.setIconImage(icon.getImage());  // Icon setzen

        fenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Fenster schließen richtig handhaben
    }
}
