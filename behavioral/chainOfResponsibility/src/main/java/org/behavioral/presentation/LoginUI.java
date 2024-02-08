package org.behavioral.presentation;

import lombok.extern.java.Log;
import org.behavioral.controller.LoginController;

import javax.swing.*;
import java.awt.*;


@Log
public class LoginUI extends JFrame {
    private JTextField emailField;
    private JPasswordField passwordField;
private LoginController controller;

    public LoginUI() {
        super("Login Form");
        controller = new LoginController();

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 2));

        JLabel emailLabel = new JLabel("Email/Codice Fiscale:");
        JLabel passwordLabel = new JLabel("Password:");

        emailField = new JTextField();
        passwordField = new JPasswordField();

        panel.add(emailLabel);
        panel.add(emailField);
        panel.add(passwordLabel);
        panel.add(passwordField);

        JButton loginButton = createLoginButton();
        panel.add(loginButton);
        setLayout(new BorderLayout());
        add(panel, BorderLayout.CENTER);
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private JButton createLoginButton() {
        JButton loginButton = new JButton("Login");
        loginButton.addActionListener(e -> {
            String email = emailField.getText();
            char[] passwordChars = passwordField.getPassword();
            String password = new String(passwordChars);

            controller.login(password, email);

        });
        return loginButton;
    }
}