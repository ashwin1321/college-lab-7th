
// import java.io.*;
import javax.swing.*;

class GUITest {
    public static void main(String[] args) {
        // System.out.println("thik xa ya samma");
        JFrame frame = new JFrame();// creating instance of JFrame

        JButton button = new JButton("A Button");// creating instance of JButton
        button.setBounds(0, 0, 220, 50);// x axis, y axis, width, height

        frame.add(button);// adding button in JFrame

        frame.setSize(500, 600);// 400 width and 500 height
        frame.setLayout(null);// using no layout managers
        frame.setVisible(true);// making the frame visible
    }
}