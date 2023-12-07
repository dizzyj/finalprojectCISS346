import javax.swing.JFrame;
import javax.swing.JLabel;

public class Sub extends Page{
    int daysRemainging;
    float costPerDay;
    String username;
    JLabel daysCounter;

    Sub(JFrame f){
        super(f);
        title.setText("Subscription Services");
        panel.add(title);
        getInfo();
        daysCounter = new JLabel("Subscription time remaining: "+ String.valueOf(daysRemainging));
        panel.add(daysCounter);
        
    }
    void getInfo(){
        //this gets relevant info from backend DB
        //for now everthing is hard coded.
        daysRemainging = 0;
        username = "username";
        costPerDay = 0.50f;

    }
}
