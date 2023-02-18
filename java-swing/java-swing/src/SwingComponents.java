import javax.swing.*;

public class SwingComponents {

    public static void main(String[] args){
    JFrame f = new JFrame("Java Swing Components");

    // some few components in my college syllabus xD
    // manage x and y coordinate accordingly

    // labels
//        JLabel l1 = new JLabel("First label");
//         l1.setBounds(50,50, 100,30);
//        f.add(l1);
//
//    // textfields
//        JTextField t1,t2;
//        t1=new JTextField("TextField 1");
//        t1.setBounds(50,100, 200,30);
//        t2=new JTextField("TextField2");
//        t2.setBounds(50,150, 200,30);
//        f.add(t1); f.add(t2);
//
//    // texArea
//        JTextArea area=new JTextArea("Welcome to javatpoint");
//        area.setBounds(10,30, 200,200);
//        f.add(area);

      // password field
//        JPasswordField value = new JPasswordField();
//        JLabel l1=new JLabel("Password:");
//        l1.setBounds(20,100, 80,30);
//        value.setBounds(100,100,100,30);
//        f.add(value);  f.add(l1);

     //    checkBox
//        JCheckBox checkBox2 = new JCheckBox("Java", true);
//        checkBox2.setBounds(100,150, 50,50);
//        f.add(checkBox2);

     //    radioButton
//        JRadioButton r1=new JRadioButton("A) Male");
//        JRadioButton r2=new JRadioButton("B) Female");
//        r1.setBounds(75,50,100,30);
//        r2.setBounds(75,100,100,30);
//        ButtonGroup bg=new ButtonGroup();
//        bg.add(r1);bg.add(r2);
//        f.add(r1);f.add(r2);

      // ComboBox
//        String[] country ={"India","Aus","U.S.A","England","Newsdealer"};
//        JComboBox cb=new JComboBox(country);
//        cb.setBounds(50, 50,90,20);
//        f.add(cb);

     //    table
//        String data[][]={ {"101","A","670000"},
//                {"102","B","780000"},
//                {"101","C","700000"}};
//        String column[]={"ID","NAME","SALARY"};
//        JTable jt=new JTable(data,column);
//        jt.setBounds(30,40,200,300);
//        JScrollPane sp=new JScrollPane(jt);
//        f.add(sp);

     //    JList
//        DefaultListModel<String> l1 = new DefaultListModel<>();
//        l1.addElement("Item1");
//        l1.addElement("Item2");
//        l1.addElement("Item3");
//        l1.addElement("Item4");
//        JList<String> list = new JList<>(l1);
//        list.setBounds(100,100, 75,75);
//        f.add(list);

      //   slider
//        JSlider slider = new JSlider(JSlider.HORIZONTAL, 0, 50, 25);
//        JPanel panel=new JPanel();
//        panel.add(slider);
//        f.add(panel);

        f.setSize(400,400);
//       f.setLayout(null);
       f.setVisible(true);

    }
}
