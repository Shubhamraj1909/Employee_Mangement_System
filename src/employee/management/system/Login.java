package employee.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Login extends JFrame implements ActionListener {

    JTextField tusername;
    JPasswordField tpassword;
    JButton login, signup, back;

    Login() {

        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JLabel heading = new JLabel("Employee Management System");
        heading.setBounds(150, 10, 350, 30);
        heading.setFont(new Font("Tahoma", Font.BOLD, 20));
        add(heading);

        JLabel username = new JLabel("Username");
        username.setBounds(40, 70, 100, 30);
        username.setFont(new Font("Tahoma", Font.BOLD, 14));
        add(username);

        tusername = new JTextField();
        tusername.setBounds(150, 70, 180, 30);
        add(tusername);

        JLabel password = new JLabel("Password");
        password.setBounds(40, 120, 100, 30);
        password.setFont(new Font("Tahoma", Font.BOLD, 14));
        add(password);

        tpassword = new JPasswordField();
        tpassword.setBounds(150, 120, 180, 30);
        add(tpassword);

        login = new JButton("LOGIN");
        login.setBounds(90, 190, 120, 35);
        login.setBackground(Color.BLACK);
        login.setForeground(Color.WHITE);
        login.addActionListener(this);
        add(login);

        signup = new JButton("SIGNUP");
        signup.setBounds(220, 190, 120, 35);
        signup.setBackground(Color.BLACK);
        signup.setForeground(Color.WHITE);
        signup.addActionListener(this);
        add(signup);

        back = new JButton("BACK");
        back.setBounds(155, 240, 120, 35);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/second.jpg"));
        Image i2 = i1.getImage().getScaledInstance(220, 220, Image.SCALE_SMOOTH);
        ImageIcon i3 = new ImageIcon(i2);

        JLabel image = new JLabel(i3);
        image.setBounds(380, 60, 220, 220);
        add(image);

        setSize(650, 380);
        setLocationRelativeTo(null); // center screen
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == login) {

            try {
                String username = tusername.getText();
                String password = String.valueOf(tpassword.getPassword());

                conn c = new conn();

                String query = "SELECT * FROM login WHERE username='" +
                        username + "' AND password='" + password + "'";

                ResultSet rs = c.statement.executeQuery(query);

                if (rs.next()) {
                    setVisible(false);
                    new Main_class();
                } else {
                    JOptionPane.showMessageDialog(
                            null,
                            "Invalid Username or Password"
                    );
                }

            } catch (Exception ex) {
                ex.printStackTrace();
            }

        } else if (e.getSource() == signup) {

            setVisible(false);
            new Signup();

        } else if (e.getSource() == back) {

            System.exit(0);
        }
    }

    public static void main(String[] args) {
        new Login();
    }
}