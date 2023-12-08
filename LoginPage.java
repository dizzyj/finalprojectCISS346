/**
 * landingPage
 */ 
import javax.swing.JButton;  
import javax.swing.JFrame;  
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.event.*;

public class LoginPage extends Page{
    
    JTextField username = new JTextField(10);
    JPasswordField password = new JPasswordField(10);
    JLabel labelUsername = new JLabel("Username:");  
    JLabel labelPassword = new JLabel("Password:"); 
    JLabel output = new JLabel(); 
    JButton button = new JButton();
    boolean subscription;
    public LoginPage(JFrame f){
        super(f);
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
        registration.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(register(username.getText(),password.getPassword())){
                    output.setText("Registration Success!");
                }
            }
        });
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
                if(validate(username.getText(), password.getPassword(), backend)){
                    output.setText("Login Success");
                    if(subscription){
                        f.add(new Browser(f).panel);
                        f.remove(panel);
                        f.revalidate();
                    }else{
                        f.add(new Sub(f).panel);
                        f.remove(panel);
                        f.revalidate();
                    }
                }
            }  
        });
    }
    private boolean validate(String username, char[]  Password, int backend){
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
    private boolean backendGet(){
        //this is a mockup function that gets data from the backend
        //this will also check if the account has an active subscription
        subscription = false;
        return true;
    }
    private boolean register(String username, char[] password){
        //this takes the username and password and sends it to the backend
        //hard coded for now.
        return true;
    }
}