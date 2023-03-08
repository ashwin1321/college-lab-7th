import java.awt.*;
import java.awt.event.*;

public class HandleActionEvent extends Frame implements ActionListener {

    TextField tf;

    HandleActionEvent(){
        // create component
        tf = new TextField();
        tf.setBounds(60,50,170,20);
        Button b = new Button("Click Here");
        b.setBounds(100,120,80,30);

        // register listener
        b.addActionListener(this); // passing current instance

        // add components and set size, layout and visibility
        add(b);add(tf);
        setSize(300,300);
        setLayout(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e){
        tf.setText("Welcome");
    }

    public static void main(String[] args){
        new HandleActionEvent();
    }
}
