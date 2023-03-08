import java.awt.*;
import java.awt.event.*;

public class HandleKeyEvent extends Frame implements KeyListener {
     TextField tf;
        Label l;

        HandleKeyEvent(){
            // create component
            tf = new TextField();
            tf.setBounds(60,50,170,20);
            l= new Label("Click Here");
            l.setBounds(100,120,80,30);

            // register
            tf.addKeyListener(this); // passing current instance
            
            add(l);add(tf);
            setSize(300,300);
            setLayout(null);
            setVisible(true);
        }
    
        public void keyPressed(KeyEvent e) {
            l.setText("Key Pressed");
        }

        public void keyReleased(KeyEvent e) {
            l.setText("Key Released");
        }
       
        
        @Override
        public void keyTyped(KeyEvent arg0) {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'keyTyped'");
        }
        public static void main(String[] args){
            new HandleKeyEvent();
        }
}
