package employee.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main_class extends JFrame {

    Main_class() {

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/home.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1120, 630, Image.SCALE_SMOOTH);
        ImageIcon i3 = new ImageIcon(i2);

        JLabel img = new JLabel(i3);
        img.setBounds(0, 0, 1120, 630);
        add(img);

        JLabel heading = new JLabel("Employee Management System");
        heading.setBounds(340, 155, 450, 40);
        heading.setFont(new Font("Raleway", Font.BOLD, 25));
        img.add(heading);

        JButton addBtn = new JButton("Add Employee");
        addBtn.setBounds(335, 270, 150, 40);
        addBtn.setForeground(Color.WHITE);
        addBtn.setBackground(Color.BLACK);
        addBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new AddEmployee();
                dispose();
            }
        });
        img.add(addBtn);

        JButton viewBtn = new JButton("View Employee");
        viewBtn.setBounds(565, 270, 150, 40);
        viewBtn.setForeground(Color.WHITE);
        viewBtn.setBackground(Color.BLACK);
        viewBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new View_Employee();
                dispose();
            }
        });
        img.add(viewBtn);

        JButton remBtn = new JButton("Remove Employee");
        remBtn.setBounds(440, 370, 150, 40);
        remBtn.setForeground(Color.WHITE);
        remBtn.setBackground(Color.BLACK);
        remBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new RemoveEmployee();
            }
        });
        img.add(remBtn);

        setTitle("Employee Management System");
        setSize(1120, 630);
        setLocationRelativeTo(null); // center screen
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Main_class();
    }
}