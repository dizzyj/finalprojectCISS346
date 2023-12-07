import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.FlowLayout; 

public class Page {
    protected int backend; //this is the reference to the backend. It is just an int for now.
    protected JPanel panel;
    protected JFrame f;
    protected JLabel title;
    Page(JFrame f){
        this.f = f;
        panel = new JPanel(); 
        panel.setLayout(new FlowLayout());
        title = new JLabel();
    }
}
