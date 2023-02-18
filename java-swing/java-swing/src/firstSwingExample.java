import javax.swing.*;

public class firstSwingExample {
    
    public static void main(String[] args){
        JFrame f = new JFrame();        // creating instance of JFrame

        JButton b  = new JButton("click");   // creating instance of JButton
        b.setBounds(130,100,100,40);     // x axis, y axis, width, height

        f.add(b);           // adding button to JFrame

        f.setSize(400, 500);    // width and height

        f.setLayout(null) ;    // using no layout manager
        f.setVisible(true);     // making frame visible
    }

}
