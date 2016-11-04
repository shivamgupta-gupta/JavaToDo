
import java.applet.Applet;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.List;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class javatodo extends Applet{
    List li = new List();
    Button b = new Button("ADD");
    TextField t = new TextField();
    public void init(){
        setLayout(new FlowLayout());
        add(li);
        add(b);
        add(t);
        event e = new event();
        b.addActionListener(e);
    }
    public class event implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            li.add(t.getText());
        }
    }
}
