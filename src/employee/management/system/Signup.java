package employee.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Signup extends JFrame implements ActionListener {

    JTextField tfusername, tfanswer;
    JPasswordField tfpassword;
    JComboBox<String> securityQuestion;
    JButton create, back;

    Signup() {

        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JLabel heading = new JLabel("SIGNUP");
        heading.setBounds(180, 20, 200, 40);
        heading.setFont(new Font("Tahoma", Font.BOLD, 25));
        add(heading);

        JLabel username = new JLabel("Username");
        username.setBounds(50, 100, 100, 30);
        add(username);

        tfusername = new JTextField();
        tfusername.setBounds(180, 100, 180, 30);
        add(tfusername);

        JLabel password = new JLabel("Password");
        password.setBounds(50, 150, 100, 30);
        add(password);

        tfpassword = new JPasswordField();
        tfpassword.setBounds(180, 150, 180, 30);
        add(tfpassword);

        JLabel question = new JLabel("Security Question");
        question.setBounds(50, 200, 120, 30);
        add(question);

        String questions[] = {
                "Your Nick Name?",
                "Your Birth Place?",
                "Your Favourite Food?",
                "Your Pet Name?"
        };

        securityQuestion = new JComboBox<>(questions);
        securityQuestion.setBounds(180, 200, 180, 30);
        add(securityQuestion);

        JLabel answer = new JLabel("Answer");
        answer.setBounds(50, 250, 100, 30);
        add(answer);

        tfanswer = new JTextField();
        tfanswer.setBounds(180, 250, 180, 30);
        add(tfanswer);

        create = new JButton("Create");
        create.setBounds(80, 320, 100, 30);
        create.addActionListener(this);
        add(create);

        back = new JButton("Back");
        back.setBounds(220, 320, 100, 30);
        back.addActionListener(this);
        add(back);

        setSize(450, 450);
        setLocation(500, 200);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == create) {

            String username = tfusername.getText();
            String password = String.valueOf(tfpassword.getPassword());
            String question = (String) securityQuestion.getSelectedItem();
            String answer = tfanswer.getText();

            try {

                conn c = new conn();

                String query = "insert into login values('" +
                        username + "','" +
                        password + "','" +
                        question + "','" +
                        answer + "')";

                c.statement.executeUpdate(query);

                JOptionPane.showMessageDialog(null,
                        "Account Created Successfully");

                setVisible(false);
                new Login();

            } catch (Exception ex) {
                ex.printStackTrace();
            }

        } else {

            setVisible(false);
            new Login();
        }
    }

    public static void main(String[] args) {
        new Signup();
    }
}