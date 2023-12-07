/**
 * landingPage
 */ 
import javax.swing.JButton;  
import javax.swing.JFrame;  
import javax.swing.JLabel;  
import javax.swing.JTextField;
import java.awt.event.*;


public class LoginPage extends Page{
    
    JTextField username = new JTextField(10);
    JTextField password = new JTextField(10);
    JLabel labelUsername = new JLabel("Username:");  
    JLabel labelPassword = new JLabel("Password:"); 
    JLabel output = new JLabel(); 
    JButton button = new JButton();
    boolean subscription;
    public LoginPage(JFrame f){
        super(f);
        panel.add(labelUsername);  
        panel.add(username);
        panel.add(labelPassword);
        panel.add(password); 
        panel.add(button); 
        panel.add(output);
        button.setText("Submit"); 
        button.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){ 
                //this is hard coded for testing. Real code should sanitize input and send to backend
                if(validate(username.getText(), password.getText(), backend)){
                    output.setText("Login Success");
                    if(subscription){
                        panel.setVisible(false);
                        f.add(new Browser(f).panel);
                    }else{
                        panel.setVisible(false);
                        f.add(new Sub(f).panel);
                    }
                }
            }  
        });
    }
    boolean validate(String username, String Password, int backend){
        // this should send sanitized username and password to backend for validation
        //returns true for now.
        long startTime = System.currentTimeMillis(); //fetch starting time
        while(false||(System.currentTimeMillis()-startTime)<5000)
        {
            //here we would wait for the backend to respond and return response with some function
            //if that function 
            return backendGet();
        }
        output.setText("Login Failed");
        return false;
    }
    boolean backendGet(){
        //this is a mockup function that gets data from the backend
        //this will also check if the account has an active subscription
        subscription = false;
        return true;
    }
}