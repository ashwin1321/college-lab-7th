import javax.swing.*;

public class FormGui {
    public static void main(String[] args) {
        JFrame frame = new JFrame("java swing gui");// creating instance of JFrame

        JLabel name, gender, address, tempAddress, perAddress, phone;

        // NAME
        name = new JLabel("Name:");
        name.setBounds(50, 50, 100, 30);
        frame.add(name);

        JTextField tf = new JTextField(" Enter your name");
        tf.setBounds(100, 50, 200, 30);

        // GENDER CHECKBOX
        gender = new JLabel("Gender:");
        gender.setBounds(50, 90, 100, 30);
        frame.add(gender);

        JCheckBox male = new JCheckBox("male");
        male.setBounds(110, 80, 80, 50);
        JCheckBox female = new JCheckBox("female");
        female.setBounds(200, 80, 80, 50);
        JCheckBox others = new JCheckBox("others");
        others.setBounds(290, 80, 80, 50);
        ButtonGroup bg = new ButtonGroup();
        bg.add(male);
        bg.add(female);
        bg.add(others);
        frame.add(male);
        frame.add(female);
        frame.add(others);

        // ADDRESS
        address = new JLabel("Address: ");
        address.setBounds(50, 130, 100, 30);
        frame.add(address);

        // temporary address
        tempAddress = new JLabel("Temporary Address: ");
        tempAddress.setBounds(50, 150, 150, 30);
        frame.add(tempAddress);
        JTextField ta = new JTextField(" Enter temporary address");
        ta.setBounds(190, 150, 200, 25);
        frame.add(ta);

        // permanent address
        perAddress = new JLabel("Permanent Address: ");
        perAddress.setBounds(50, 175, 150, 30);
        frame.add(perAddress);
        JTextField pa = new JTextField(" Enter permanent address");
        pa.setBounds(190, 180, 200, 25);
        frame.add(pa);

        // PHONE
        phone = new JLabel("Phone: ");
        phone.setBounds(50, 210, 100, 30);
        frame.add(phone);
        JTextField ph = new JTextField(" Enter phone number");
        ph.setBounds(100, 210, 200, 27);
        frame.add(ph);

        // Email
        JLabel email = new JLabel("Email: ");
        email.setBounds(50, 240, 100, 30);
        frame.add(email);
        JTextField em = new JTextField(" Enter email");
        em.setBounds(100, 240, 200, 27);
        frame.add(em);

        // password
        JLabel password = new JLabel("Password: ");
        password.setBounds(50, 270, 100, 30);
        frame.add(password);
        JPasswordField pass = new JPasswordField();
        pass.setBounds(120, 270, 200, 27);
        frame.add(pass);

        // confirm password
        JLabel cpassword = new JLabel("Confirm Password: ");
        cpassword.setBounds(50, 300, 150, 30);
        frame.add(cpassword);
        JPasswordField cpass = new JPasswordField();
        cpass.setBounds(180, 300, 200, 27);
        frame.add(cpass);

        // qualification
        JLabel qualification = new JLabel("Qualification: ");
        qualification.setBounds(50, 330, 100, 30);
        frame.add(qualification);

        JRadioButton SLC = new JRadioButton("SLC");
        SLC.setBounds(150, 330, 80, 30);
        JRadioButton highSchool = new JRadioButton("+2");
        highSchool.setBounds(150, 350, 80, 30);
        JRadioButton bachelor = new JRadioButton("Bachelor");
        bachelor.setBounds(150, 370, 80, 30);
        JRadioButton master = new JRadioButton("Masters");
        master.setBounds(150, 390, 80, 30);

        ButtonGroup bgg = new ButtonGroup();
        bgg.add(SLC);
        bgg.add(bachelor);
        bgg.add(highSchool);
        bgg.add(master);
        frame.add(SLC);
        frame.add(highSchool);
        frame.add(bachelor);
        frame.add(master);

        // Programming language
        JLabel programming = new JLabel("Programming Language: ");
        programming.setBounds(50, 420, 200, 30);
        frame.add(programming);

        String languages[] = { "C", "C++", "Java", "Python", "PHP", "JavaScript" };
        JComboBox cb = new JComboBox(languages);
        cb.setBounds(210, 420, 100, 30);
        frame.add(cb);

        // work experience
        JLabel work = new JLabel("Describe your Work Experience: ");
        work.setBounds(50, 450, 200, 30);
        frame.add(work);

        JTextArea ta1 = new JTextArea("Describe your work experience");
        ta1.setBounds(50, 480, 400, 100);
        frame.add(ta1);

        // insert Image
        JLabel image = new JLabel("Insert image: ");
        image.setBounds(50, 580, 200, 30);
        frame.add(image);
        JTextArea img = new JTextArea("Choose image");
        img.setBounds(150, 585, 120, 25);
        frame.add(img);
        JButton b = new JButton("Browse");
        b.setBounds(270, 585, 100, 25);
        frame.add(b);

        // How did you hear about us?
        JLabel hear = new JLabel("How did you hear about us?");
        hear.setBounds(50, 615, 200, 30);
        frame.add(hear);
        JRadioButton radio1 = new JRadioButton("Google");
        radio1.setBounds(250, 615, 100, 30);
        JRadioButton radio2 = new JRadioButton("Facebook");
        radio2.setBounds(250, 635, 100, 30);
        JRadioButton radio3 = new JRadioButton("Friend");
        radio3.setBounds(250, 655, 100, 30);
        JRadioButton radio4 = new JRadioButton("Other");
        radio4.setBounds(250, 675, 100, 30);
        ButtonGroup bg1 = new ButtonGroup();
        bg1.add(radio1);
        bg1.add(radio2);
        bg1.add(radio3);
        bg1.add(radio4);
        frame.add(radio1);
        frame.add(radio2);
        frame.add(radio3);
        frame.add(radio4);

        // recommend
        JLabel recommend = new JLabel("Would you recommend us?");
        recommend.setBounds(50, 705, 200, 30);
        frame.add(recommend);

        JRadioButton yes = new JRadioButton("Yes");
        yes.setBounds(250, 705, 100, 30);
        JRadioButton no = new JRadioButton("No");
        no.setBounds(250, 725, 100, 30);
        JRadioButton maybe = new JRadioButton("Maybe");
        maybe.setBounds(250, 745, 100, 30);
        ButtonGroup bg2 = new ButtonGroup();
        bg2.add(yes);
        bg2.add(no);
        bg2.add(maybe);
        frame.add(yes);
        frame.add(no);
        frame.add(maybe);

        JButton button = new JButton("submit");// creating instance of JButton
        button.setBounds(50, 800, 180, 40);// x axis, y axis, width, height
        frame.add(button);
        frame.add(tf);// adding button in JFrame

        JButton reset = new JButton("Reset");
        reset.setBounds(250, 800, 180, 40);
        frame.add(reset);

        frame.setSize(500, 900);// 400 width and 500 height
        frame.setLayout(null);// using no layout managers
        frame.setVisible(true);// making the frame visible
    }
}
