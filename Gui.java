import javax.swing.JFrame;



public class Gui {
    public static void main(String[] args) {
    JFrame frame = new JFrame("Vulnerabilities Thing");   
    LoginPage login = new LoginPage(frame);
    frame.add(login.panel);  
    frame.setSize(800, 600);  
    frame.setLocationRelativeTo(null);  
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
    frame.setVisible(true);  
   }
}
