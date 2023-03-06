import javax.swing.*;
import java.awt.event.*;

// MENU and MENUITEMS
//class MenuItems{
//    JMenu menu, submenu;
//    JMenuItem i1, i2, i3, i4, i5;
//
//    MenuItems(){
//        JFrame f= new JFrame("Menu and MenuItem Example");
//        JMenuBar mb=new JMenuBar();
//        menu=new JMenu("Menu");
//        submenu=new JMenu("Sub Menu");
//        i1=new JMenuItem("Item 1");
//        i2=new JMenuItem("Item 2");
//        i3=new JMenuItem("Item 3");
//        i4=new JMenuItem("Item 4");
//        i5=new JMenuItem("Item 5");
//        menu.add(i1); menu.add(i2); menu.add(i3);
//        submenu.add(i4); submenu.add(i5);
//        menu.add(submenu);
//        mb.add(menu);
//        f.setJMenuBar(mb);
//        f.setSize(400,400);
//        f.setLayout(null);
//        f.setVisible(true);
//    }
//}

// JCHECKBOX MENUITEM
//class CheckboxMenuITem{
//
//    CheckboxMenuITem() {
//        JFrame frame = new JFrame("Jmenu Example");
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        JMenuBar menuBar = new JMenuBar();
//        // File Menu, F - Mnemonic
//        JMenu fileMenu = new JMenu("File");
//        fileMenu.setMnemonic(KeyEvent.VK_F);
//        menuBar.add(fileMenu);
//        // File->New, N - Mnemonic
//        JMenuItem menuItem1 = new JMenuItem("Open", KeyEvent.VK_N);
//        fileMenu.add(menuItem1);
//
//        JCheckBoxMenuItem caseMenuItem = new JCheckBoxMenuItem("Option_1");
//        caseMenuItem.setMnemonic(KeyEvent.VK_C);
//        fileMenu.add(caseMenuItem);
//
//        ActionListener aListener = new ActionListener() {
//            public void actionPerformed(ActionEvent event) {
//                AbstractButton aButton = (AbstractButton) event.getSource();
//                boolean selected = aButton.getModel().isSelected();
//                String newLabel;
//                Icon newIcon;
//                if (selected) {
//                    newLabel = "Value-1";
//                } else {
//                    newLabel = "Value-2";
//                }
//                aButton.setText(newLabel);
//            }
//        };
//
//        caseMenuItem.addActionListener(aListener);
//        frame.setJMenuBar(menuBar);
//        frame.setSize(350, 250);
//        frame.setVisible(true);
//    }
//}


// POPUPMENUS
//
//class PopupMenuSwing{
//    PopupMenuSwing(){
//        final JFrame f= new JFrame("PopupMenu Example");
//        final JPopupMenu popupmenu = new JPopupMenu("Edit");
//        JMenuItem cut = new JMenuItem("Cut");
//        JMenuItem copy = new JMenuItem("Copy");
//        JMenuItem paste = new JMenuItem("Paste");
//        popupmenu.add(cut); popupmenu.add(copy); popupmenu.add(paste);
//        f.addMouseListener(new MouseAdapter() {
//            public void mouseClicked(MouseEvent e) {
//                popupmenu.show(f , e.getX(), e.getY());
//            }
//        });
//        f.add(popupmenu);
//        f.setSize(300,300);
//        f.setLayout(null);
//        f.setVisible(true);
//    }
//}

// ADD ICON TO MENU ITEM

//

public class MenusSwing {

    public static void main(String[] args)
    {
//        new MenuItems();
//        new CheckboxMenuITem();

//        new PopupMenuSwing();
    }
}
