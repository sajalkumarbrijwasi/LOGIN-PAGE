package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.*;
import java.util.Arrays;
import java.util.EventListener;

public class SWINGER extends JFrame{
    SWINGER() {
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
         JTextField t,t1;
        JFrame f;
        JLabel l,l1,l2,l3,l4;
        JButton b;Font g;

        t=new JTextField();
        t.setBounds(200,200,400,50);
        t.setBackground(Color.green);
        t1=new JTextField();
        t1.setBounds(200,300,400,50);
        t1.setBackground(Color.cyan);
        JPasswordField v=new JPasswordField();
        v.setBounds(200,400,400,50);
        v.setBackground(Color.pink);
        f = new JFrame("welcome");
        setSize(800, 800);
        f.setLayout(new GridLayout(3, 1));
        l = new JLabel("ENTER USERNAME AND PASSWORD");

        b=new JButton("LOGIN");

         g= new Font("Algerian",Font.PLAIN,35);
        l1=new JLabel();
        l1.setBounds(350,300,700,600);
        l1.setBackground(Color.cyan);
        l1.setFont(g);

        l2=new JLabel("Username");
        l2.setBounds(120,200,400,50);
        l2.setBackground(Color.cyan);


        l3=new JLabel("UserId");
        l3.setBounds(130,300,400,50);
        l3.setBackground(Color.red);

        l4=new JLabel("Password");
        l4.setBounds(120,400,400,50);
        l4.setBackground(Color.red);


        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String p = t.getText();
                String n = t1.getText();
                String password = Arrays.toString(v.getPassword()).replaceAll("\\[|\\]|,|\\s", "");
                if (n.equals("sajal") && p.equals("qwerty") && password.equals("admin")) {
                    JOptionPane.showMessageDialog(f, "Accepted!");
                    l1.setText("welcome");
                } else
                    l1.setText("invalid");

            }
         });
        t.setFont(g);
        t1.setFont(g);
        add(l);
        add(b);add(t);add(t1);add(v);add(l1);add(l2);add(l3);add(l4);
b.setBounds(350,500,100,50);
b.setBackground(Color.orange);
l.setBounds(300,40,900,200);
l.setBackground(Color.red);
setLayout(null);
setVisible(true);
    }

    public static void main(String args[])
{
new SWINGER();}
}
