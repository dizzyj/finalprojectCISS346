import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Browser extends Page{
    ArrayList<Vulnerability> vlist;
    JLabel title1;
    JLabel title2;
    JLabel title3;
    JLabel info1;
    JLabel info2;
    JLabel info3;
    JButton button0;
    JButton button1;
    JButton button2;
    Browser(JFrame f){
        super(f);
        title.setText("Browser");
        c.gridy = 0;
        c.gridx = 1;
        panel.add(title,c);
        vlist = new ArrayList<Vulnerability>();
        if (getList()) {
            int i = 1;
            for (Vulnerability v : vlist) {
                v.setTitle("Title "+ String.valueOf(i));
                i++;
            }
            title1 = new JLabel(vlist.get(0).getTitle());
            c.gridy = 1;
            c.gridx = 0;
            panel.add(title1,c);
            info1 = new JLabel(vlist.get(0).getInfo());
            c.gridy = 1;
            c.gridx = 1;
            panel.add(info1, c);
            button0 = new JButton("Details");
            button0.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e){
                    f.remove(panel);
                    f.add(new Details(f, vlist.get(0)).panel);
                    f.revalidate();
                }
            });
            c.gridy = 1;
            c.gridx = 2;
            panel.add(button0,c);
            title2 = new JLabel(vlist.get(1).getTitle());
            c.gridy = 2;
            c.gridx = 0;
            panel.add(title2,c);
            info2 = new JLabel(vlist.get(1).getInfo());
            c.gridy = 2;
            c.gridx = 1;
            panel.add(info2, c);
            button1 = new JButton("Details");
            button1.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e){
                    f.remove(panel);
                    f.add(new Details(f, vlist.get(1)).panel);
                    f.revalidate();
                }
            });
            c.gridy = 2;
            c.gridx = 2;
            panel.add(button1,c);
            title3 = new JLabel(vlist.get(2).getTitle());
            c.gridy = 3;
            c.gridx = 0;
            panel.add(title3,c);
            info3 = new JLabel(vlist.get(0).getInfo());
            c.gridy = 3;
            c.gridx = 1;
            panel.add(info3, c);
            button2 = new JButton("Details");
            button2.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e){
                    f.remove(panel);
                    f.add(new Details(f, vlist.get(2)).panel);
                    f.revalidate();
                }
            });
            c.gridy = 3;
            c.gridx = 2;
            panel.add(button2,c);
            
        }else{
            //error
        }
    }
    private boolean getList(){
        //this gets data from the back end and puts them in a vulnerability object and makes a list
        //this list is used to display all the vulnerabilities on the page.

        vlist.add(new Vulnerability());
        vlist.add(new Vulnerability());
        vlist.add(new Vulnerability());
        return true;
    }
}
