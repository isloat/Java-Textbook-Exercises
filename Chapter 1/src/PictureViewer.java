import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class PictureViewer {
	public static void main(String[] args) throws Exception {
		URL imageLocation = new URL("http://upload.wikimedia.org/wikipedia/commons/thumb/2/28/ErnestHemingway.jpg/480px-ErnestHemingway.jpg");
		JOptionPane.showMessageDialog(null, "Hello", "Title",
				JOptionPane.PLAIN_MESSAGE, new ImageIcon(imageLocation));
	}
}
