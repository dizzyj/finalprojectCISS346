import javax.swing.JFrame;

public class Browser extends Page{
    Browser(JFrame f){
        super(f);
        title.setText("Browser");
        panel.add(title);
    }
}
