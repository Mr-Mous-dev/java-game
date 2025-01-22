import javax.swing.*;
import java.io.IOException;
import java.net.URI;
import java.net.URL;
import java.nio.file.Paths;

public class Client {
    public static void main(String[] args) {
        String url = "client.html";

        JFrame frame = new JFrame("Clientwindow");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JEditorPane editorPane = new JEditorPane();
        editorPane.setEditable(false);

        try {
            URI uri = Paths.get(url).toUri();
            editorPane.setPage(uri.toURL());
        } catch (Exception e) {
            editorPane.setText("Error");
        }

        frame.add(new JScrollPane(editorPane));
        frame.setSize(1920, 1080);
        frame.setVisible(true);
        frame.setTitle("Brum Brum");
    }
}
