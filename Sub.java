import java.awt.GridBagConstraints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Sub extends Page{
    int daysRemaining;
    float costPerDay;
    String username;
    JLabel daysCounter;
    String [] combo = {"1 month","3 months","6 months", "1 year"};
    JComboBox amountSelect = new JComboBox<>(combo);
    JLabel creditCardlabel = new JLabel("Credit Card:");
    JTextField creditField = new JTextField(10);
    JButton purchase = new JButton("Purchase");
    JLabel firstName = new JLabel("First Name:");
    JTextField fName = new JTextField(10);
    JLabel lastName = new JLabel("Last Name:");
    JTextField lName = new JTextField(10);
    JLabel add1 = new JLabel("Address Line 1:");
    JTextField address1 = new JTextField(10);
    JLabel add2 = new JLabel("Address Line 2:");
    JTextField address2 = new JTextField(10);
    JLabel secNum = new JLabel("Security Number:");
    JTextField securityNum = new JTextField(5);
    JLabel exp = new JLabel("Expiration:");
    JTextField expiration = new JTextField(5);
    Sub(JFrame f){
        super(f);
        title.setText("Subscription Services");
        c.gridy = 0;
        c.gridx =2;
        c.ipadx = 4;
        c.ipady = 4;
        panel.add(title,c);
        getInfo();
        daysCounter = new JLabel("Subscription time remaining: "+String.valueOf(daysRemaining));
        c.gridy = 1;
        c.gridx = 2;
        panel.add(daysCounter,c);
        c.gridy = 2;
        c.gridx = 2;
        panel.add(amountSelect,c);
        c.gridy = 3;
        c.gridx = 0;
        panel.add(firstName,c);
        c.gridy = 3;
        c.gridx = 1;
        c.fill = GridBagConstraints.HORIZONTAL;
        panel.add(fName,c);
        c.gridy = 3;
        c.gridx = 3;
        c.fill = GridBagConstraints.NONE;
        panel.add(creditCardlabel,c);
        c.gridy = 3;
        c.gridx = 4;
        c.fill = GridBagConstraints.HORIZONTAL;
        panel.add(creditField,c);
        c.gridy = 4;
        c.gridx = 0;
        panel.add(lastName,c);
        c.gridy = 4;
        c.gridx = 1;
        c.fill = GridBagConstraints.HORIZONTAL;
        panel.add(lName,c);
        c.gridy = 4;
        c.gridx = 3;
        panel.add(secNum,c);
        c.gridy = 4;
        c.gridx = 4;
        panel.add(securityNum,c);
        c.gridy = 5;
        c.gridx = 0;
        panel.add(add1,c);
        c.gridy = 5;
        c.gridx = 1;
        panel.add(address1,c);
        c.gridy = 5;
        c.gridx = 3;
        panel.add(exp,c);
        c.gridy = 5;
        c.gridx = 4;
        panel.add(expiration,c);
        c.gridy = 6;
        c.gridx = 0;
        panel.add(add2,c);
        c.gridy = 6;
        c.gridx = 1;
        panel.add(address2,c);
        c.gridy = 7;
        c.gridx = 2;
        panel.add(purchase,c);
        purchase.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                //this should send cc information to backend for now it just goes back to login screen.
                if(sendInfo()){
                    f.add(new Browser(f).panel);
                    f.remove(panel);
                    f.revalidate();
                }
            }
        });

    }
    private void getInfo(){
        //this gets relevant info from backend DB
        //for now everthing is hard coded.
        daysRemaining = 0;
        username = "username";
        costPerDay = 0.50f;

    }
    //this should send the purchase request to the back end and wait for response. Returns true of purchase was
    //success
    private boolean sendInfo(){
        return true;
    }
}
