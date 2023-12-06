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
public class LoginPage {
    JPanel panel;
    JPanel loginSucess;
    JFrame f;
    JTextField username = new JTextField(10);
    JTextField password = new JTextField(10);
    JLabel labelUsername = new JLabel("Username:");  
    JLabel labelPassword = new JLabel("Password:"); 
    JLabel output = new JLabel(); 
    JButton button = new JButton();
    public LoginPage(JFrame f, JPanel p){
        this.f = f;
        this.loginSucess = p;
        panel = new JPanel(); 
        panel.setLayout(new FlowLayout());

        panel.add(labelUsername);  
        panel.add(username);
        panel.add(labelPassword);
        panel.add(password); 
        panel.add(button); 
        panel.add(output);

        button.setText("Submit"); 
        button.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){ 
                //this is hard coded for texting.

                if(username.getText().equals("admin")&&
                    password.getText().equals("password")){
                        output.setText("Login Success");
                        //clear panel and go to next panel
                        f.remove(panel);
                        f.add(loginSucess);
                    }else{
                        output.setText("Login Failed");
                    } 
            }  
        });
    }

}