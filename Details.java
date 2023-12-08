import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Details extends Page{
    Vulnerability vulnerabiltiy;
    JLabel vTitle;
    JTextArea details;
    JButton back;
    Details(JFrame f, Vulnerability v){
        super(f);
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        vulnerabiltiy = v;
        Insets inset = new Insets(10,10,10,10);
        title.setText("Details");
        c.gridy = 0;
        c.gridx = 0;
        c.gridwidth = GridBagConstraints.REMAINDER;
        c.gridheight = 2;
        c.insets = inset;
        panel.add(title);
        vTitle = new JLabel(vulnerabiltiy.getTitle());
        details = new JTextArea(vulnerabiltiy.getDetails());
        JScrollPane scrollPane = new JScrollPane(details);
            scrollPane.setSize(720, 400);
            Dimension d = new Dimension(500,400);
            scrollPane.setPreferredSize(d);
            details.setLineWrap(true);
        back = new JButton("Back");
        back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                f.remove(panel);
                f.add(new Browser(f).panel);
                f.revalidate();
            }
        });
        c.gridy = 1;
        c.gridx = 0;
        c.gridwidth = 1;
        c.gridheight = 1;
        panel.add(vTitle,c);
        c.gridy = 2;
        c.gridx = 0;
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridwidth = 4;
        panel.add(scrollPane,c);
        c.gridy = 3;
        c.gridx = 0;
        panel.add(back,c);
    }
}
