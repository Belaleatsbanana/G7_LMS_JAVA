package Screens;

import BookClass.Inventory;
import UserClass.Customer;

import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.ArrayList;

/**
 *
 * @author belal
 */
public class LoginScreen extends javax.swing.JFrame {

    /**
     * Creates new form LoginScreen
     */
    public LoginScreen() {
        initComponents();
    }

    private void initComponents() {

        loginPanel = new javax.swing.JPanel();
        loginHeader = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        loginEmailField = new javax.swing.JTextField();
        passwordLabel = new javax.swing.JLabel();
        loginPasswordField = new javax.swing.JPasswordField();
        signupButton = new javax.swing.JButton();
        loginButton = new javax.swing.JButton();
        signupLabel = new javax.swing.JLabel();
        forgetButton = new javax.swing.JButton();
        loginErrorMessage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        loginPanel.setBackground(new java.awt.Color(255, 255, 255));
        loginPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        loginPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        loginHeader.setFont(new java.awt.Font("Segue UI", Font.BOLD, 18)); // NOI18N
        loginHeader.setText("Login");

        emailLabel.setText("Email  : ");

        loginEmailField.setFont(new java.awt.Font("Segue UI", Font.ITALIC, 10)); // NOI18N
        loginEmailField.addActionListener(this::loginEmailFieldActionPerformed);

        passwordLabel.setText("Password :");

        signupButton.setText("Signup");
        signupButton.addActionListener(this::signupButtonActionPerformed);

        loginButton.setBackground(new java.awt.Color(204, 204, 204));
        loginButton.setFont(new java.awt.Font("Segue UI", Font.BOLD, 14)); // NOI18N
        loginButton.setText("Login");
        loginButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        loginButton.addActionListener(this::loginButtonActionPerformed);

        signupLabel.setText("Dont have an account?");

        forgetButton.setFont(new java.awt.Font("Segue UI", Font.ITALIC, 10)); // NOI18N
        forgetButton.setForeground(new java.awt.Color(51, 51, 255));
        forgetButton.setText("forget password?");
        forgetButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 0));
        forgetButton.addActionListener(this::forgetButtonActionPerformed);

        javax.swing.GroupLayout loginPanelLayout = new javax.swing.GroupLayout(loginPanel);
        loginPanel.setLayout(loginPanelLayout);
        loginPanelLayout.setHorizontalGroup(
                loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(loginPanelLayout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(loginPanelLayout.createSequentialGroup()
                                                .addComponent(signupLabel)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(signupButton))
                                        .addGroup(loginPanelLayout.createSequentialGroup()
                                                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(emailLabel)
                                                        .addComponent(passwordLabel))
                                                .addGap(38, 38, 38)
                                                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(loginHeader)
                                                        .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                .addComponent(loginPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(loginEmailField, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(loginPanelLayout.createSequentialGroup()
                                                                .addGap(6, 6, 6)
                                                                .addComponent(loginErrorMessage)))
                                                .addGap(0, 20, Short.MAX_VALUE)))
                                .addGap(48, 48, 48))
                        .addGroup(loginPanelLayout.createSequentialGroup()
                                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(loginPanelLayout.createSequentialGroup()
                                                .addGap(94, 94, 94)
                                                .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(loginPanelLayout.createSequentialGroup()
                                                .addGap(127, 127, 127)
                                                .addComponent(forgetButton, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        loginPanelLayout.setVerticalGroup(
                loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(loginPanelLayout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(loginHeader)
                                .addGap(32, 32, 32)
                                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(loginEmailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(emailLabel))
                                .addGap(18, 18, 18)
                                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(loginPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(passwordLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(loginErrorMessage)
                                .addGap(4, 4, 4)
                                .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(forgetButton, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(signupLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(signupButton))
                                .addGap(44, 44, 44))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(45, Short.MAX_VALUE)
                                .addComponent(loginPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(45, 45, 45))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(57, Short.MAX_VALUE)
                                .addComponent(loginPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(57, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:

        try {
            FileInputStream librarianFileReader = new FileInputStream("librarians.txt");
            DataInputStream librarianFile = new DataInputStream(librarianFileReader);
            while (true) {

                String email = librarianFile.readUTF();
                String password = librarianFile.readUTF();
                if(email.equals(loginEmailField.getText()) && password.equals(String.valueOf(loginPasswordField.getPassword()))) {

                    LibrarianScreen librarianScreen = new LibrarianScreen();
                    librarianScreen.setVisible(true);
                    this.setVisible(false);
                    this.dispose();
                    return;
                }
            }
        } catch (IOException ignored) {}

        if (isLoginSuccessful()) {
            String email = loginEmailField.getText();
            for (Customer customer : Inventory.getCustomers()) {
                if (customer.getEmail().equals(email)) {
                    HomeScreen home = new HomeScreen(customer);
                    home.setVisible(true);
                    this.setVisible(false);
                    this.dispose();
                    return;
                }
            }
        } else
            JOptionPane.showMessageDialog(null, "email or password is not correct", "Input Error", JOptionPane.ERROR_MESSAGE);
    }

    private boolean isLoginSuccessful() {
        ArrayList<Customer> customers = Inventory.getCustomers();
        System.out.println(customers.size());
        String email = loginEmailField.getText();
        String password = String.valueOf(loginPasswordField.getPassword());
        for (Customer customer : customers) {
            if (customer.getEmail().equals(email) && customer.getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }

    private void signupButtonActionPerformed(java.awt.event.ActionEvent evt) {

        SignupScreen signupS = new SignupScreen();
        signupS.setVisible(true);
        this.setVisible(false);
        this.dispose();
    }

    private void loginEmailFieldActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void forgetButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException |
                 UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new LoginScreen().setVisible(true));
    }

    // Variables declaration - do not modify

    // End of variables declaration

    javax.swing.JPanel loginPanel = new javax.swing.JPanel();
    javax.swing.JLabel loginHeader = new javax.swing.JLabel();
    javax.swing.JLabel emailLabel = new javax.swing.JLabel();
    javax.swing.JTextField loginEmailField = new javax.swing.JTextField();
    javax.swing.JLabel passwordLabel = new javax.swing.JLabel();
    javax.swing.JPasswordField loginPasswordField = new javax.swing.JPasswordField();
    javax.swing.JButton signupButton = new javax.swing.JButton();
    javax.swing.JButton loginButton = new javax.swing.JButton();
    javax.swing.JLabel signupLabel = new javax.swing.JLabel();
    javax.swing.JButton forgetButton = new javax.swing.JButton();

    javax.swing.JLabel loginErrorMessage = new JLabel();
}

