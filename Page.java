import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Page {
    protected int backend; //this is the reference to the backend. It is just an int for now.
    protected JPanel panel;
    protected JFrame f;
    protected JLabel title;
    GridBagConstraints c;
    Page(JFrame f){
        this.f = f;
        panel = new JPanel(); 
        panel.setLayout(new GridBagLayout());
        title = new JLabel();
        c = new GridBagConstraints();
    }
}
