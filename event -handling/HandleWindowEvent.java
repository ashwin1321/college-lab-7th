import java.awt.*;
import java.awt.event.*;

public class HandleWindowEvent extends Frame implements WindowListener {
    HandleWindowEvent(){
        // register
        addWindowListener(this); // passing current instance
        setSize(300,300);
        setLayout(null);
        setVisible(true);
    }

    public void windowActivated(WindowEvent e) {
        System.out.println("Window Activated");
    }

    public void windowClosed(WindowEvent e) {
        System.out.println("Window Closed");
    }

    public void windowClosing(WindowEvent e) {
        System.out.println("Window Closing");
        dispose();
    }

    public void windowDeactivated(WindowEvent e) {
        System.out.println("Window Deactivated");
    }

    public void windowOpened(WindowEvent e) {
        System.out.println("Window Opened");
    }

    public static void main(String[] args){
        new HandleWindowEvent();
    }

    @Override
    public void windowDeiconified(WindowEvent arg0) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'windowDeiconified'");
    }

    @Override
    public void windowIconified(WindowEvent arg0) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'windowIconified'");
    }
}