/**
 * landingPage
 */
import java.awt.FlowLayout;  
import javax.swing.JButton;  
import javax.swing.JFrame;  
import javax.swing.JLabel;  
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.event.*;   
public class landingPage {

   public static void main(String[] args) {
    JTextField username = new JTextField(10);
    JTextField password = new JTextField(10);
    JFrame frame = new JFrame("Vulnerabilities Thing");  
    JPanel panel = new JPanel(); 
    JPanel browser = new JPanel(); 
    panel.setLayout(new FlowLayout());  
    JLabel labelUsername = new JLabel("Username:");  
    JLabel labelPassword = new JLabel("Password:"); 
    JLabel output = new JLabel(); 
    JButton button = new JButton();  
    button.setText("Submit"); 
    button.addActionListener(new ActionListener(){  
        public void actionPerformed(ActionEvent e){ 
                    //this is hard coded for texting.

                    if(username.getText().equals("admin")&&
                        password.getText().equals("password")){
                            output.setText("Login Success");
                            //clear panel and go to next panel
                            frame.remove(panel);
                            frame.add(browser);
                        }else{
                            output.setText("Login Failed");
                        } 
                }  
    });  
    panel.add(labelUsername);  
    panel.add(username);
    panel.add(labelPassword);
    panel.add(password); 
    panel.add(button); 
    panel.add(output); 
    frame.add(panel);  
    frame.setSize(800, 600);  
    frame.setLocationRelativeTo(null);  
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
    frame.setVisible(true);  
   }


}