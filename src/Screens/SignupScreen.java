package Screens;
import BookClass.Inventory;
import UserClass.Customer;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 *v
 * @author belal
 */
public class SignupScreen extends javax.swing.JFrame {

    /**
     * Creates new form SignupScreen
     */
    public SignupScreen() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */

    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        signupPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        signupPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        signupHeader.setFont(new java.awt.Font("Segue UI", Font.BOLD, 18)); // NOI18N
        signupHeader.setText("Sign up");

        emailLabel.setText("Email  : ");

        signupEmailField.setFont(new java.awt.Font("Segue UI", Font.ITALIC, 10)); // NOI18N
        signupEmailField.addActionListener(this::signupEmailFieldActionPerformed);

        passwordLabel.setText("Password :");

        signupPasswordField.addActionListener(this::signupPasswordFieldActionPerformed);

        loginButton.setText("Login");
        loginButton.addActionListener(this::loginButtonActionPerformed);

        signupButton.setBackground(new java.awt.Color(204, 204, 204));
        signupButton.setFont(new java.awt.Font("Segue UI", Font.BOLD, 14)); // NOI18N
        signupButton.setText("Sign up");
        signupButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        signupButton.addActionListener(this::signupButtonActionPerformed);

        loginLabel.setText("Already have an account?");

        usernameLabel.setText("Username :");

        signupUsernameField.setFont(new java.awt.Font("Segue UI", Font.ITALIC, 10)); // NOI18N
        signupUsernameField.addActionListener(this::signupUsernameFieldActionPerformed);

        genderLabel.setText("Gender :");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Prefer not to say", "Helicopter" }));
        jComboBox1.addActionListener(this::jComboBox1ActionPerformed);

        phoneLabel.setText("Phone :");

        phoneTextField.addActionListener(this::phoneTextFieldActionPerformed);

        addressLabel.setText("Address :");

        addressTextField.addActionListener(this::addressTextFieldActionPerformed);

        dobLabel.setText("DateOfBirth :");

        dayTextField.setText("Day");
        dayTextField.addActionListener(this::dayTextFieldActionPerformed);

        monthTextField.setText("Month");
        monthTextField.addActionListener(this::monthTextFieldActionPerformed);

        yearTextField.setText("Year");

        usernameMessageLabel.setFont(new java.awt.Font("Segue UI", Font.BOLD | Font.ITALIC, 10)); // NOI18N

        emailMessageLabel.setFont(new java.awt.Font("Segue UI", Font.BOLD | Font.ITALIC, 10)); // NOI18N

        passwordMessageLabel.setFont(new java.awt.Font("Segue UI", Font.BOLD | Font.ITALIC, 8)); // NOI18N

        phoneMessageLabel.setFont(new java.awt.Font("Segue UI", Font.BOLD | Font.ITALIC, 10)); // NOI18N

        addressMessageLabel.setFont(new java.awt.Font("Segue UI", Font.BOLD | Font.ITALIC, 10)); // NOI18N

        dobMessageLabel.setFont(new java.awt.Font("Segue UI", Font.BOLD | Font.ITALIC, 10)); // NOI18N

        signupEmailField.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                validateEmail();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                validateEmail();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {}
        });

        signupUsernameField.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                validateUsername();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                validateUsername();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {}
        });

        signupPasswordField.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                ValidatePassword();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                ValidatePassword();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {}
        });

        phoneTextField.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                ValidatePhoneNo();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                ValidatePhoneNo();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {}
        });

        addressTextField.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                ValidateAddress();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                ValidateAddress();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {}
        });

        dayTextField.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                ValidateDOB();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                ValidateDOB();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {}
        });

        dayTextField.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                dayTextField.setText("");
            }

            @Override
            public void focusLost(FocusEvent e) {

            }
        });
        monthTextField.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                monthTextField.setText("");
            }

            @Override
            public void focusLost(FocusEvent e) {

            }
        });
        yearTextField.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                yearTextField.setText("");
            }

            @Override
            public void focusLost(FocusEvent e) {

            }
        });
        monthTextField.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                ValidateDOB();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                ValidateDOB();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {}
        });
        yearTextField.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                ValidateDOB();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                ValidateDOB();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {}
        });
        javax.swing.GroupLayout SignupPanelLayout = new javax.swing.GroupLayout(signupPanel);
        signupPanel.setLayout(SignupPanelLayout);
        SignupPanelLayout.setHorizontalGroup(
                SignupPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SignupPanelLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(signupButton, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(106, 106, 106))
                        .addGroup(SignupPanelLayout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addGroup(SignupPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(SignupPanelLayout.createSequentialGroup()
                                                .addComponent(loginLabel)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                                                .addComponent(loginButton)
                                                .addGap(49, 49, 49))
                                        .addGroup(SignupPanelLayout.createSequentialGroup()
                                                .addGap(2, 2, 2)
                                                .addGroup(SignupPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addGroup(SignupPanelLayout.createSequentialGroup()
                                                                .addGroup(SignupPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addComponent(usernameLabel)
                                                                        .addComponent(emailLabel)
                                                                        .addComponent(passwordLabel)
                                                                        .addComponent(genderLabel)
                                                                        .addComponent(phoneLabel)
                                                                        .addComponent(addressLabel))
                                                                .addGap(18, 18, 18)
                                                                .addGroup(SignupPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(signupHeader)
                                                                        .addGroup(SignupPanelLayout.createSequentialGroup()
                                                                                .addGap(42, 42, 42)
                                                                                .addGroup(SignupPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                        .addComponent(phoneTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addGroup(SignupPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                                                .addComponent(signupPasswordField)
                                                                                                .addComponent(emailMessageLabel)
                                                                                                .addComponent(signupUsernameField)
                                                                                                .addComponent(jComboBox1, 0, 134, Short.MAX_VALUE)
                                                                                                .addComponent(signupEmailField))
                                                                                        .addComponent(usernameMessageLabel, javax.swing.GroupLayout.Alignment.LEADING)
                                                                                        .addComponent(passwordMessageLabel, javax.swing.GroupLayout.Alignment.LEADING)
                                                                                        .addComponent(phoneMessageLabel, javax.swing.GroupLayout.Alignment.LEADING)
                                                                                        .addComponent(addressMessageLabel, javax.swing.GroupLayout.Alignment.LEADING)
                                                                                        .addComponent(addressTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addComponent(dobMessageLabel, javax.swing.GroupLayout.Alignment.LEADING)))))
                                                        .addGroup(SignupPanelLayout.createSequentialGroup()
                                                                .addComponent(dobLabel)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(dayTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(monthTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(yearTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(0, 0, Short.MAX_VALUE))))
        );
        SignupPanelLayout.setVerticalGroup(
                SignupPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(SignupPanelLayout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(signupHeader)
                                .addGap(21, 21, 21)
                                .addComponent(usernameMessageLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(SignupPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(usernameLabel)
                                        .addComponent(signupUsernameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(emailMessageLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(SignupPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(signupEmailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(emailLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(passwordMessageLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(SignupPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(signupPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(passwordLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(SignupPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(genderLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(phoneMessageLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(SignupPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(phoneTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(phoneLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(addressMessageLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(SignupPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(addressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(addressLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(dobMessageLabel)
                                .addGap(5, 5, 5)
                                .addGroup(SignupPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(monthTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(dayTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(yearTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(dobLabel))
                                .addGap(13, 13, 13)
                                .addComponent(signupButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(SignupPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(loginLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(loginButton))
                                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(30, Short.MAX_VALUE)
                                .addComponent(signupPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(signupPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(116, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>
    private void signupEmailFieldActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void signupButtonActionPerformed(java.awt.event.ActionEvent evt) {
        if (!(validUsername&&validEmail&&validPassword&&validPhone&&validAddress&&validDOB)){
            JOptionPane.showMessageDialog(null, "Please input valid information", "Input Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        LocalDate BD=LocalDate.of(Integer.parseInt(yearTextField.getText()),Integer.parseInt(monthTextField.getText()),Integer.parseInt(dayTextField.getText()));
        Customer customer= new Customer
                (signupUsernameField.getText(),
                        signupEmailField.getText(),
                        signupPasswordField.getText(),
                        phoneTextField.getText(),
                        addressTextField.getText(),
                        (String)jComboBox1.getSelectedItem(),BD);
        ArrayList<Customer> customers = Inventory.getCustomers();

        customers.add(customer);
        try {
            FileOutputStream fos = new FileOutputStream("customers.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(customers);
            System.out.println("Fuck no babyb");
            oos.close();
            fos.close();
        }catch (IOException e) {
            System.out.println(e.getMessage());
        }
        HomeScreen home=new HomeScreen(customer);
        home.setVisible(true);
        this.setVisible(false);
        this.dispose();

    }

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {
        LoginScreen login=new LoginScreen();
        login.setVisible(true);
        this.setVisible(false);
        this.dispose();
    }


    private void signupPasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void signupUsernameFieldActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void phoneTextFieldActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void addressTextFieldActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void monthTextFieldActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void dayTextFieldActionPerformed(java.awt.event.ActionEvent evt) {
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
            java.util.logging.Logger.getLogger(SignupScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new SignupScreen().setVisible(true));
    }
    private void validateUsername() {
        String username=signupUsernameField.getText();
        if(!isValidUsername(username)){
            usernameMessageLabel.setText("Username too short");
            usernameMessageLabel.setForeground(new Color(255,0,0));
            validUsername = false;
        }
        else
        {
            usernameMessageLabel.setText("valid");
            usernameMessageLabel.setForeground(new Color(0,255,0));
            validUsername = true;
        }
    }
    private boolean isValidUsername(String username){
        return username.length()>=6;
    }//requestFocus()---- emailMes.setText("")
    private void validateEmail() {
        String email = signupEmailField.getText();
        if (!isValidEmail(email)) {
            emailMessageLabel.setText("Invalid email");
            emailMessageLabel.setForeground(new Color(255,0,0));
            validEmail = false;
        } else {
            emailMessageLabel.setText("Valid email");
            emailMessageLabel.setForeground(new Color(0,255,0));
            validEmail = true;
        }
    }

    private boolean isValidEmail(String email) {
        int atIndex = email.indexOf('@');
        if (atIndex == -1) {
            return false;
        }

        String domain = email.substring(atIndex + 1); // Get the part after "@" symbol
        // Check if the domain contains a valid extension
        return domain.contains(".com") || domain.contains(".net") || domain.contains(".org");
    }
    private void ValidatePassword(){
        String password = signupPasswordField.getText();
        if(isValidPassword(password)){
            passwordMessageLabel.setForeground(new Color(0,255,0));
            passwordMessageLabel.setText("valid");
            validPassword = true;
        }
        else {
            passwordMessageLabel.setForeground(new Color(255,0,0));
            passwordMessageLabel.setText("Password too short");
            validPassword = false;
        }


    }
    private boolean isValidPassword(String password){
            return password.length() >= 8;
    }
    private void ValidatePhoneNo(){
        String phoneNumber=phoneTextField.getText();
        if(!isValidPhoneNumber(phoneNumber)){
            phoneMessageLabel.setText("invalid phone number");
            phoneMessageLabel.setForeground(new Color(255,0,0));
            validPhone = false;
        }
        else
        {
            phoneMessageLabel.setText("valid");
            phoneMessageLabel.setForeground(new Color(0,255,0));
            validPhone = true;
        }
    }
    private boolean isValidPhoneNumber(String phoneNo){
        if(phoneNo.length()==11){
            try{
                Integer.parseInt(phoneNo);
                return true;
            }
            catch(NumberFormatException e){
                return false;
            }
        }
        return false;
    }

    private void ValidateAddress(){
        String address=addressTextField.getText();
        if(!isValidAddress(address)){
            addressMessageLabel.setText("invalid address");
            addressMessageLabel.setForeground(new Color(255,0,0));
            validAddress = false;
        }
        else
        {
            addressMessageLabel.setText("valid");
            addressMessageLabel.setForeground(new Color(0,255,0));
            validAddress = true;
        }
    }
    private boolean isValidAddress(String address){
        return address.length()>=10;
    }
    private void ValidateDOB(){
        String day=dayTextField.getText();
        String month=monthTextField.getText();
        String year=yearTextField.getText();

        if(isValidDay(day)&&isValidMonth(month)&&isValidYear(year)){
            dobMessageLabel.setText("valid");
            dobMessageLabel.setForeground(new Color(0, 255, 0));
            validDOB = true;
        }
        else {
            dobMessageLabel.setText("date is invalid");
            dobMessageLabel.setForeground(new Color(255,0,0));
            validDOB = false;
        }
    }

   private boolean isValidDay (String day){
        try{
        if(Integer.parseInt(day)>=1&&Integer.parseInt(day)<=31){
            return true;
            }
        }
        catch(Exception e)
        {
            return false;
        }
        return false;
   }
   private boolean isValidMonth(String month){
       try {
           if (Integer.parseInt(month) >= 1 && Integer.parseInt(month) <= 12) {
               return true;
           }
       }catch(Exception e){
           return false;
       }
        return false;
   }
   private boolean isValidYear(String year) {
       try {
           if (Integer.parseInt(year) >= 1950 && Integer.parseInt(year) <= 2020) {
               return true;
           }
       } catch (Exception e) {
           return false;
       }
       return false;
   }

    JPanel signupPanel = new JPanel();
    JLabel signupHeader = new JLabel();
    JLabel emailLabel = new JLabel();
    JTextField signupEmailField = new JTextField();
    JLabel passwordLabel = new JLabel();
    JPasswordField signupPasswordField = new JPasswordField();
    JButton loginButton = new JButton();
    JButton signupButton = new JButton();
    JLabel loginLabel = new JLabel();
    JLabel usernameLabel = new JLabel();
    JTextField signupUsernameField = new JTextField();
    JLabel genderLabel = new JLabel();
    JComboBox<String> jComboBox1 = new JComboBox<>();
    JLabel phoneLabel = new JLabel();
    JTextField phoneTextField = new JTextField();
    JLabel addressLabel = new JLabel();
    JTextField addressTextField = new JTextField();
    JLabel dobLabel = new JLabel();
    JTextField dayTextField = new JTextField();
    JTextField monthTextField = new JTextField();
    JTextField yearTextField = new JTextField();
    JLabel usernameMessageLabel = new JLabel();
    JLabel emailMessageLabel = new JLabel();
    JLabel passwordMessageLabel = new JLabel();
    JLabel phoneMessageLabel = new JLabel();
    JLabel addressMessageLabel = new JLabel();
    JLabel dobMessageLabel = new JLabel();

    boolean validUsername = false;
    boolean validEmail = false;
    boolean validPassword = false;
    boolean validPhone = false;
    boolean validAddress = false;
    boolean validDOB = false;

}
