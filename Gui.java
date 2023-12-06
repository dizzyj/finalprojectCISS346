import javax.swing.JFrame;
import javax.swing.JPanel;


public class Gui {
    public static void main(String[] args) {
    JFrame frame = new JFrame("Vulnerabilities Thing");  
    JPanel browser = new JPanel(); 
    LoginPage p = new LoginPage(frame, browser);
    frame.add(p.panel);  
    frame.setSize(800, 600);  
    frame.setLocationRelativeTo(null);  
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
    frame.setVisible(true);  
   }
}
