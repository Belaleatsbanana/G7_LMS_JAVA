package Screens;
import UserClass.Customer;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.time.LocalDate;

/**
 *
 * @author belal
 */
public class ProfileScreen extends javax.swing.JFrame {

    /**
     * Creates new form ProfileScreen
     */
    public ProfileScreen(Customer customer) {
        this.customer = customer;
        initComponents();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */

    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {
        profilePictureLabel = new javax.swing.JLabel();
        usernameLabel = new javax.swing.JLabel();
        usernameTextField = new javax.swing.JTextField();
        emailLabel = new javax.swing.JLabel();
        emailTextField = new javax.swing.JTextField();
        phoneLabel = new javax.swing.JLabel();
        phoneTextField = new javax.swing.JTextField();
        genderLabel = new javax.swing.JLabel();
        addressTextField = new javax.swing.JTextField();
        addressLabel = new javax.swing.JLabel();
        genderTextField = new javax.swing.JTextField();
        dobLabel = new javax.swing.JLabel();
        dobTextField = new javax.swing.JTextField();
        changePFPButton = new javax.swing.JButton();
        changePhoneButton = new javax.swing.JButton();
        changeAddressButton = new javax.swing.JButton();
        changeGenderButton = new javax.swing.JButton();
        changeDOBButton = new javax.swing.JButton();
        changePasswordLabel = new javax.swing.JLabel();
        changePasswordButton = new javax.swing.JButton();
        cartButton = new javax.swing.JButton();
        logoutButton = new javax.swing.JButton();
        logoButton = new javax.swing.JButton();
        cancelLabel = new javax.swing.JLabel();
        borrowedBookPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        profilePictureLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        usernameLabel.setText("Username :");

        emailLabel.setText("Email :");

        phoneLabel.setText("Phone :");

        genderLabel.setText("Gender :");

        addressLabel.setText("Address :");

        dobLabel.setText("Date of Birth :");

        changePFPButton.setText("Change Picture");

        changePFPButton.addActionListener(this::changePFPButtonActionPerformed);

        changePhoneButton.setText("Change");

        changePhoneButton.addActionListener(this::changePhoneButtonActionPerformed);

        changeAddressButton.setText("Change");

        changeAddressButton.addActionListener(this::changeAddressButtonActionPerformed);

        changeGenderButton.setText("Change");

        changeGenderButton.addActionListener(this::changeGenderButtonActionPerformed);

        changeDOBButton.setText("Change");

        changeDOBButton.addActionListener(this::changeDOBButtonActionPerformed);

        changePasswordLabel.setText("Change Password?");

        changePasswordButton.setText("Change Password");

        changePasswordButton.addActionListener(this::changePasswordButtonActionPerformed);

        cartButton.setText("Cart");

        cartButton.setVisible(false);

        logoutButton.setText("Logout");

        logoutButton.addActionListener(this::logoutButtonActionPerformed);

        logoButton.setText("logo");

        cancelLabel.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        cancelLabel.setText("Cancel Borrowing?");

        borrowedBookPanel.setLayout(new java.awt.GridLayout());

        logoButton.addActionListener(this::logoButtonActionPerformed);

        usernameTextField.setText(customer.getUsername());

        emailTextField.setText(customer.getEmail());

        phoneTextField.setText(customer.getPhone());

        addressTextField.setText(customer.getAddress());

        genderTextField.setText(customer.getGender());

        dobTextField.setText(customer.getDateOfBirth().toString());
        ImageIcon profilepicture= new ImageIcon(customer.getProfileimage());
        profilePictureLabel.setIcon(profilepicture);


        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(addressLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(profilePictureLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(phoneLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(emailLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(usernameLabel, javax.swing.GroupLayout.Alignment.TRAILING)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(16, 16, 16)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addGap(78, 78, 78)
                                                                                .addComponent(cancelLabel))
                                                                        .addComponent(borrowedBookPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(26, 26, 26)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addComponent(dobLabel)
                                                                        .addComponent(changePasswordLabel)))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(changePFPButton)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(genderLabel)))))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(usernameTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                                                        .addComponent(emailTextField)
                                                        .addComponent(phoneTextField)
                                                        .addComponent(addressTextField)
                                                        .addComponent(genderTextField)
                                                        .addComponent(dobTextField))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(changeAddressButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(changePhoneButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(changeDOBButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(changeGenderButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addComponent(changePasswordButton))
                                .addContainerGap())
                        .addGroup(layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(logoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(245, 245, 245)
                                .addComponent(cartButton)
                                .addGap(18, 18, 18)
                                .addComponent(logoutButton)
                                .addContainerGap(37, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(logoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cartButton)
                                        .addComponent(logoutButton))
                                .addGap(22, 22, 22)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(usernameLabel)
                                                        .addComponent(usernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(emailLabel)
                                                        .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(phoneTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(phoneLabel)
                                                        .addComponent(changePhoneButton))
                                                .addGap(8, 8, 8)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(addressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(addressLabel)
                                                        .addComponent(changeAddressButton))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(genderLabel)
                                                        .addComponent(genderTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(changeGenderButton)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(profilePictureLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(changePFPButton)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(cancelLabel)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(dobLabel)
                                                        .addComponent(dobTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(changeDOBButton))
                                                .addGap(28, 28, 28)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(changePasswordLabel)
                                                        .addComponent(changePasswordButton)))
                                        .addComponent(borrowedBookPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(50, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>

    private void logoButtonActionPerformed(java.awt.event.ActionEvent evt){
        HomeScreen home = new HomeScreen(customer);
        home.setVisible(true);
        this.setVisible(false);
        this.dispose();
    }
    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt){
        HomeScreen homeScreen= new HomeScreen(null);
        homeScreen.setVisible(true);
        this.setVisible(false);
        this.dispose();
    }
    private void changePhoneButtonActionPerformed(java.awt.event.ActionEvent evt){
        String phoneNo = JOptionPane.showInputDialog("enter your phone number");
        if (isValidPhoneNumber(phoneNo)) {
            phoneTextField.setText(phoneNo);
        }
        else{
            JOptionPane.showMessageDialog(null,"enter a phone number consisting of 11 digits");
        }

    }
    private void changePFPButtonActionPerformed(java.awt.event.ActionEvent evt){
        String image = JOptionPane.showInputDialog("enter Profile picture address on your pc");
        if (image.contains(".png")) {
            ImageIcon newpfp = new ImageIcon(image);
            profilePictureLabel.setIcon(newpfp);
            customer.setProfileimage(image);
        }
        else{
            JOptionPane.showMessageDialog(null,"enter correct PNG Profile picture address on your pc");
        }
    }
    private void changeAddressButtonActionPerformed(java.awt.event.ActionEvent evt){
        customer.setAddress(JOptionPane.showInputDialog("enter your address"));
        addressTextField.setText(customer.getAddress());
    }

    private void changeGenderButtonActionPerformed(java.awt.event.ActionEvent evt){
        String newgender = JOptionPane.showInputDialog("enter your new gender you gay fuck");
        if(newgender.equalsIgnoreCase("male")||newgender.equalsIgnoreCase("female")){
            genderTextField.setText(newgender);
            customer.setGender(newgender);
        }
        else{
            JOptionPane.showMessageDialog(null,"are you a male or a female");
        }
    }
    private void changeDOBButtonActionPerformed(java.awt.event.ActionEvent evt){

            String day=JOptionPane.showInputDialog("enter your day of birth");
            String month=JOptionPane.showInputDialog("enter your month of birth");
            String year=JOptionPane.showInputDialog("enter your year of birth");

            if(isValidDay(day)&&isValidMonth(month)&&isValidYear(year)){
            LocalDate newDOB= LocalDate.of(Integer.parseInt(year),Integer.parseInt(month),Integer.parseInt(day));
                customer.setDateOfBirth(newDOB);
                dobTextField.setText(customer.getDateOfBirth().toString());
            }
            else {
                JOptionPane.showMessageDialog(null,"invalid date");
            }
    }

    private void changePasswordButtonActionPerformed(java.awt.event.ActionEvent evt){

    }

    //verifications
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
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ProfileScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProfileScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProfileScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProfileScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                LocalDate date = LocalDate.of(2004,2,3);
                new ProfileScreen(new Customer("Slave",
                        "email@gmail.com",
                        "password",
                        "Male",
                        "0",
                        "nasr city" ,
                        date)).setVisible(true);
            }// String username, String email, String password
            //,String gender, String phone, String address, LocalDate dateOfBirth
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JLabel addressLabel;
    private javax.swing.JTextField addressTextField;
    private javax.swing.JPanel borrowedBookPanel;
    private javax.swing.JLabel cancelLabel;
    private javax.swing.JButton cartButton;
    private javax.swing.JButton changeAddressButton;
    private javax.swing.JButton changeDOBButton;
    private javax.swing.JButton changeGenderButton;
    private javax.swing.JButton changePFPButton;
    private javax.swing.JButton changePasswordButton;
    private javax.swing.JLabel changePasswordLabel;
    private javax.swing.JButton changePhoneButton;
    private javax.swing.JLabel dobLabel;
    private javax.swing.JTextField dobTextField;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JLabel genderLabel;
    private javax.swing.JTextField genderTextField;
    private javax.swing.JButton logoButton;
    private javax.swing.JButton logoutButton;
    private javax.swing.JLabel phoneLabel;
    private javax.swing.JTextField phoneTextField;
    private javax.swing.JLabel profilePictureLabel;
    private javax.swing.JLabel usernameLabel;
    private javax.swing.JTextField usernameTextField;
    private Customer customer;
    // End of variables declaration

}
