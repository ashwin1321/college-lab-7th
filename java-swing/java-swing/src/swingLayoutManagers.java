    // some layout managers in my syllabus

    import javax.swing.*;
    import java.awt.*;

    // BORDER LAYOUT
     class Borders
    {
        JFrame f;
        Borders()
        {
            f = new JFrame();

            // creating buttons
            JButton b1 = new JButton("NORTH");; // the button will be labeled as NORTH
            JButton b2 = new JButton("SOUTH");; // the button will be labeled as SOUTH
            JButton b3 = new JButton("EAST");; // the button will be labeled as EAST
            JButton b4 = new JButton("WEST");; // the button will be labeled as WEST
            JButton b5 = new JButton("CENTER");; // the button will be labeled as CENTER

            f.add(b1, BorderLayout.NORTH); // b1 will be placed in the North Direction
            f.add(b2, BorderLayout.SOUTH);  // b2 will be placed in the South Direction
            f.add(b3, BorderLayout.EAST);  // b2 will be placed in the East Direction
            f.add(b4, BorderLayout.WEST);  // b2 will be placed in the West Direction
            f.add(b5, BorderLayout.CENTER);  // b2 will be placed in the Center

            f.setSize(300, 300);
            f.setVisible(true);
        }
}


// GRID LAYOUT
 class GridLayoutExample {
    JFrame frameObj;

    // constructor
    GridLayoutExample() {
        frameObj = new JFrame();

// creating 9 buttons
        JButton btn1 = new JButton("1");
        JButton btn2 = new JButton("2");
        JButton btn3 = new JButton("3");
        JButton btn4 = new JButton("4");
        JButton btn5 = new JButton("5");
        JButton btn6 = new JButton("6");
        JButton btn7 = new JButton("7");
        JButton btn8 = new JButton("8");
        JButton btn9 = new JButton("9");

// adding buttons to the frame
// since, we are using the parameterless constructor, therfore;
// the number of columns is equal to the number of buttons we
// are adding to the frame. The row count remains one.
        frameObj.add(btn1);
        frameObj.add(btn2);
        frameObj.add(btn3);
        frameObj.add(btn4);
        frameObj.add(btn5);
        frameObj.add(btn6);
        frameObj.add(btn7);
        frameObj.add(btn8);
        frameObj.add(btn9);

// setting the grid layout using the parameterless constructor
        frameObj.setLayout(new GridLayout());


        frameObj.setSize(300, 300);
        frameObj.setVisible(true);
    }
}

// FLOW LAYOUT
class FlowLayoutExample
{

    JFrame frameObj;

    // constructor
    FlowLayoutExample()
    {
        // creating a frame object
        frameObj = new JFrame();

        // creating the buttons
        JButton b1 = new JButton("1");
        JButton b2 = new JButton("2");
        JButton b3 = new JButton("3");
        JButton b4 = new JButton("4");
        JButton b5 = new JButton("5");
        JButton b6 = new JButton("6");
        JButton b7 = new JButton("7");
        JButton b8 = new JButton("8");
        JButton b9 = new JButton("9");
        JButton b10 = new JButton("10");


        // adding the buttons to frame
        frameObj.add(b1); frameObj.add(b2); frameObj.add(b3); frameObj.add(b4);
        frameObj.add(b5); frameObj.add(b6);  frameObj.add(b7);  frameObj.add(b8);
        frameObj.add(b9);  frameObj.add(b10);

        // parameter less constructor is used
        // therefore, alignment is center
        // horizontal as well as the vertical gap is 5 units.
        frameObj.setLayout(new FlowLayout());

        frameObj.setSize(300, 300);
        frameObj.setVisible(true);
    }
}

    // GRIDBAG LAYOUT

    // GROUP LAYOUT
    class GroupLayoutExample{

         GroupLayoutExample(){
             JFrame frame = new JFrame("GroupLayoutExample");
             frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
             Container contentPanel = frame.getContentPane();
             GroupLayout groupLayout = new GroupLayout(contentPanel);

             contentPanel.setLayout(groupLayout);

             JLabel clickMe = new JLabel("Click Here");
             JButton button = new JButton("This Button");

             groupLayout.setHorizontalGroup(
                     groupLayout.createSequentialGroup()
                             .addComponent(clickMe)
                             .addGap(10, 20, 100)
                             .addComponent(button));
             groupLayout.setVerticalGroup(
                     groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                             .addComponent(clickMe)
                             .addComponent(button));
             frame.pack();
             frame.setVisible(true);
         }

    }
    public  class swingLayoutManagers  {
        public static void main(String[]args){
//            new Borders();
//            new GridLayoutExample();
//              new FlowLayoutExample();
            new GroupLayoutExample();
        }

    }