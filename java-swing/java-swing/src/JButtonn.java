import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JButtonn {
    public static void main(String[] args){
//        JFrame f = new JFrame("Button Example");
//        JButton b = new JButton("Click Here");  // empty creates button w/o text or icon
//        b.setBounds(50,100,95,30);
//        f.add(b);
//        f.setSize(400,500);
//        f.setLayout(null);
//        f.setVisible(true);


        // ------------ JButton with Event Listener ----------------

        JFrame f  = new JFrame("Button Example");
        final JTextField tf = new JTextField();
        tf.setBounds(50,50,150,20);
        JButton b  = new JButton("Click here");
        b.setBounds(50, 100, 95,30);
        b.addActionListener(new ActionListener() {                // adding event listener
            @Override
            public void actionPerformed(ActionEvent e) {
                tf.setText("Hello!! Was-sap");
            }
        });

        f.add(b); f.add(tf);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }

}
