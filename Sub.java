import java.awt.GridBagConstraints;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Sub extends Page{
    int daysRemainging;
    float costPerDay;
    String username;
    JLabel daysCounter;
    String [] combo = {"1 month","3 months","6 months", "1 year"};
    JComboBox amountSelect = new JComboBox<>(combo);
    JLabel creditCardlabel = new JLabel("Credit Card:");
    JTextField creditField = new JTextField(16);
    JButton purchase = new JButton("Purchase");
    Sub(JFrame f){
        super(f);
        GridBagConstraints c = new GridBagConstraints();
        title.setText("Subscription Services");
        c.gridy = 0;
        c.gridx =1;
        panel.add(title,c);
        getInfo();
        daysCounter = new JLabel("Subscription time remaining: "+String.valueOf(daysRemainging));
        c.gridy = 1;
        c.gridx = 1;
        panel.add(daysCounter,c);
        c.gridy = 2;
        c.gridx = 0;
        panel.add(amountSelect,c);
        c.gridy = 2;
        c.gridx = 1;
        panel.add(creditCardlabel,c);
        c.gridy = 2;
        c.gridx = 2;
        panel.add(creditField,c);
        c.gridy = 3;
        c.gridx = 1;
        panel.add(purchase,c);

    }
    void getInfo(){
        //this gets relevant info from backend DB
        //for now everthing is hard coded.
        daysRemainging = 0;
        username = "username";
        costPerDay = 0.50f;

    }
}
