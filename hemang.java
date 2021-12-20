import java.applet.*;  
import java.awt.*;
import java.awt.event.*; 

public class hemang extends Applet implements ActionListener {
    Button r = new Button("Red");
    Button b = new Button("Blue");
    Button g = new Button("Green");
    Button p = new Button("+");
    Button m = new Button("-");
    Label l = new Label("Hemang Verma");
    
    public void init(){
        add(r);
        add(b);
        add(g);
        add(p);
        add(m);
        add(l);
        r.addActionListener(this);
        b.addActionListener(this);
        g.addActionListener(this);
        p.addActionListener(this);
        m.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        l.setSize(300,300);
        if (e.getSource() == r) {
            l.setForeground(Color.red);
        }
        else if (e.getSource() == b) {
            l.setForeground(Color.blue);
        }
        else if (e.getSource() == g) {
            l.setForeground(Color.green);
        }
        else if (e.getSource() == p) {
            l.setFont(new Font("TimesRoman", Font.PLAIN, l.getFont().getSize()+1));
        }
        else if (e.getSource() == m) {
            l.setFont(new Font("TimesRoman", Font.PLAIN, l.getFont().getSize()-1));
        }
    }
}  
/* 
<applet code="hemang.class" width="1000" height="1000"> 
</applet> 
*/