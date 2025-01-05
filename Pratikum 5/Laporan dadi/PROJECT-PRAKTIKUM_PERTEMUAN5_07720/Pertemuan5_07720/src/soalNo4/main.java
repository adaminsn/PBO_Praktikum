package soalNo4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("PRAKTIKUM 5");

        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setSize(400, 300);

        JLabel username = new JLabel("Username");
        JLabel password = new JLabel("Password");

        username.setBounds(50, 50, 100, 30);
        frame.add(username);

        password.setBounds(50, 100, 100, 30);
        frame.add(password);

        JTextField usernameField = new JTextField();
        usernameField.setBounds(150, 55, 165, 20);
        frame.add(usernameField);

        JPasswordField passwordField = new JPasswordField();
        passwordField.setBounds(150, 105, 165, 20);
        frame.add(passwordField);

        JButton loginButton = new JButton("LOGIN");
        loginButton.setBounds(150, 150, 100, 30);
        frame.add(loginButton);

        JLabel validationMessage = new JLabel();
        validationMessage.setBounds(50, 200, 300, 30);
        frame.add(validationMessage);

        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String password = new String(passwordField.getPassword());
                try {
                    validatePassword(password);
                    validationMessage.setText("Login Berhasil");
                    validationMessage.setForeground(Color.GREEN);
                } catch (Exception ex) {
                    validationMessage.setText("Password tidak valid. " + ex.getMessage());
                    validationMessage.setForeground(Color.RED);
                }
            }
        });

        frame.setVisible(true);
    }

    private static void validatePassword(String password) throws Exception {
        if (password.length() < 8) {
            throw new Exception("Panjang password minimal 8 karakter.");
        }
        if (!password.matches(".*[A-Z].*")) {
            throw new Exception("Password harus mengandung huruf besar.");
        }
        if (!password.matches(".*[a-z].*")) {
            throw new Exception("Password harus mengandung huruf kecil.");
        }
        if (!password.matches(".*\\d.*")) {
            throw new Exception("Password harus mengandung angka.");
        }
    }
}
