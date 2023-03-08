import java.awt.*;
import java.awt.event.*;

public class HandleMouseEvent extends Frame implements MouseListener {
    
    Label l;

    HandleMouseEvent(){
        // create component
        l = new Label("Click Here");
        l.setBounds(100,120,80,30);

        // register
        l.addMouseListener(this); // passing current instance
        
        add(l);
        setSize(300,300);
        setLayout(null);
        setVisible(true);
    }

    public void mouseClicked(MouseEvent e) {
        l.setText("Mouse Clicked");
    }

    public void mouseEntered(MouseEvent e) {
        l.setText("Mouse Entered");
    }

    public void mouseExited(MouseEvent e) {
        l.setText("Mouse Exited");
    }

    public void mousePressed(MouseEvent e) {
        l.setText("Mouse Pressed");
    }

    public void mouseReleased(MouseEvent e) {
        l.setText("Mouse Released");
    }

    public static void main(String[] args){
        new HandleMouseEvent();
    }
}
