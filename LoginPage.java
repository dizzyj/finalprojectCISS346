/**
 * landingPage
 */ 
import javax.swing.JButton;  
import javax.swing.JFrame;  
import javax.swing.JLabel;  
import javax.swing.JTextField;

import java.awt.GridBagConstraints;
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
        GridBagConstraints c = new GridBagConstraints();
        title.setText("Login/Register");
        c.gridy = 0;
        c.gridx = 0;
        c.ipadx = 4;
        c.ipady = 4;
        c.gridwidth = 3;
        panel.add(title,c);
        c.gridy = 3;
        c.gridx = 0;
        c.gridwidth = 1;
        panel.add(labelUsername,c); 
        c.gridy = 3; 
        c.gridx = 1;
        c.gridwidth = 1;
        panel.add(username,c);
        c.gridy = 4;
        c.gridx = 0;
        c.gridwidth = 1;
        panel.add(labelPassword,c);
        c.gridy = 4;
        c.gridx = 1;
        c.gridwidth = 1;
        panel.add(password,c); 
        c.gridy = 5;
        c.gridx = 0; 
        c.gridwidth = 1;
        panel.add(button,c); 
        JButton registration = new JButton("Register");
        c.gridy = 5;
        c.gridx = 1;
        panel.add(registration,c);
        c.gridy = 6;
        c.gridx = 1;
        panel.add(output,c);
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