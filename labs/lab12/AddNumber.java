import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Swing_Gui extends JFrame implements ActionListener {

  JButton button;
  JLabel label1, label2, label3;
  JTextField text1, text2, text3;

  Swing_Gui() {
    label1 = new JLabel("First Number");
    label1.setBounds(50, 50, 100, 20);
    add(label1);
    text1 = new JTextField();
    text1.setBounds(150, 50, 100, 20);
    add(text1);
    label2 = new JLabel("Second Number");
    label2.setBounds(50, 100, 100, 20);
    add(label2);
    text2 = new JTextField();
    text2.setBounds(150, 100, 100, 20);
    add(text2);
    label3 = new JLabel("Result");
    label3.setBounds(50, 150, 100, 20);
    add(label3);
    text3 = new JTextField();
    text3.setBounds(150, 150, 100, 20);
    text3.setEditable(false);
    add(text3);
    button = new JButton("Add");
    button.setBounds(50, 200, 100, 20);
    add(button);
    button.addActionListener(this);
    setLayout(null);
    setSize(400, 400);
    setVisible(true);
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    int a = Integer.parseInt(text1.getText());
    int b = Integer.parseInt(text2.getText());
    int c = a + b;
    text3.setText(String.valueOf(c));
  }

  public static void main(String[] args) {
    new Swing_Gui();
  }
}
