package Screens;

import BookClass.Book;
import BookClass.Genre;
import BookClass.Status;
import UserClass.Customer;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

/**
 *
 * @author belal
 */
public class BookScreen extends javax.swing.JFrame {

    /**
     * Creates new form BookScreen
     */
    public BookScreen(Book book, Customer customer) {
        this.book = book;
        this.customer = customer;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    private void initComponents() {



        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bookImageLabel.setText("jLabel1");
        bookImageLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        bookDescTextArea.setColumns(20);
        bookDescTextArea.setRows(5);
        bookDescTextArea.setText("book description");
        bookDescScrollPanel.setViewportView(bookDescTextArea);

        bookName.setText("Book name");

        isbnLabel.setText("ISBN :");

        bookTitleLabel.setText("Title :");

        bookAuthorLabel.setText("Author :");

        bookGenreLabel.setText("Genre :");

        bookAvailabilityLabel.setText("Availability :");

        borrowButton.setFont(new java.awt.Font("Segue UI", Font.BOLD, 18)); // NOI18N
        borrowButton.setText("Borrow");
        borrowButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        searchComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Title", "ISBN", "Keyword", "Author", "Genre" }));
        searchComboBox.addActionListener(this::searchComboBoxActionPerformed);

        loginButton.setText("Login");

        searchTextField.setText("Searching in titles");
        searchTextField.addActionListener(this::searchTextFieldActionPerformed);

        profileButton.setText("Profile");

        searchButton.setText("Search!");
        searchButton.addActionListener(this::searchButtonActionPerformed);

        signupButton.setText("Sign up");

        cartButton.setText("Cart");
        cartButton.addActionListener(this::addToCartActionPerformed);
        //  we will make youssef host!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
        logoButton.setText("logo");

        bookISBNTextField.setText(book.getISBN());
        bookTitleTextField.setText(book.getTitle());
        bookAuthorTextField.setText(book.getAuthor());
        bookGenreTextField.setText(String.valueOf(book.getGenreType()));
        bookAvailabilityTextField.setText(String.valueOf(book.getAvailability()));
        bookDescTextArea.setText(book.getDescription());
        ImageIcon image = new ImageIcon(book.getImagePath());
        bookImageLabel.setIcon(image);
        bookImageLabel.setText(null);


        addCartButton.setFont(new java.awt.Font("Segue UI", Font.BOLD, 14)); // NOI18N
        addCartButton.setText("Add to Cart");
        addCartButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(36, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(logoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(searchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(3, 3, 3)
                                                                .addComponent(searchButton))
                                                        .addComponent(searchComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(signupButton)
                                                        .addComponent(cartButton))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(loginButton)
                                                        .addComponent(profileButton)))
                                        .addComponent(bookName, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(bookImageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(bookDescScrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(25, 25, 25)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(isbnLabel)
                                                        .addComponent(bookTitleLabel)
                                                        .addComponent(bookAuthorLabel)
                                                        .addComponent(bookAvailabilityLabel)
                                                        .addComponent(bookGenreLabel)
                                                        .addComponent(borrowButton, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(bookISBNTextField)
                                                        .addComponent(bookTitleTextField)
                                                        .addComponent(bookAuthorTextField)
                                                        .addComponent(bookGenreTextField)
                                                        .addComponent(bookAvailabilityTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                                                        .addComponent(addCartButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(signupButton)
                                                                        .addComponent(loginButton))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                        .addComponent(cartButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(profileButton)))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(3, 3, 3)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                                .addGap(2, 2, 2)
                                                                                .addComponent(searchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(searchComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(19, 19, 19)
                                                .addComponent(logoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bookName)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(bookISBNTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(bookTitleTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(bookTitleLabel))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(bookAuthorTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(bookAuthorLabel))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(bookGenreTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(bookGenreLabel)))
                                                        .addComponent(isbnLabel))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(bookAvailabilityLabel)
                                                        .addComponent(bookAvailabilityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(44, 44, 44)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(borrowButton, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                                                        .addComponent(addCartButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(bookImageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                                                .addComponent(bookDescScrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(67, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:


    }

    private void searchTextFieldActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void searchComboBoxActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void addToCartActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        if(customer == null){
            int choice;
            choice = JOptionPane.showConfirmDialog(null,
                   "You are not logged in! \nWould you like to log in?","Error",JOptionPane.YES_NO_OPTION);

            if(choice == 1){
                new LoginScreen();
            }
            else{
                return;
            }
        }

        if(customer.getWishList().size() > 5){
            JOptionPane.showMessageDialog(null,
                    "You added too many books to the wishlist", "Book Limit Exceded", JOptionPane.ERROR_MESSAGE);
            return;
        }

        customer.getWishList().add(book);

        JOptionPane.showMessageDialog(null,
                "You successfully add a book to your wishlist", "Success", JOptionPane.INFORMATION_MESSAGE);
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
            java.util.logging.Logger.getLogger(BookScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new BookScreen(new Book("ratat"
                ,"nigga", "1234", Genre.FICTION, Status.AVAILABLE,
                "Description","./assets/default.png"),null).setVisible(true));

        // (String title, String author, String ISBN, Genre genreType, Status availability,
        //         String description,String imagePath
    }
    Book book;
    Customer customer;
    JLabel bookImageLabel = new JLabel();
    JScrollPane bookDescScrollPanel = new JScrollPane();
    JTextArea bookDescTextArea = new JTextArea();
    JLabel bookName = new JLabel();
    JLabel isbnLabel = new JLabel();
    JTextField bookISBNTextField = new JTextField();
    JLabel bookTitleLabel = new JLabel();
    JTextField bookTitleTextField = new JTextField();
    JLabel bookAuthorLabel = new JLabel();
    JTextField bookAuthorTextField = new JTextField();
    JLabel bookGenreLabel = new JLabel();
    JTextField bookGenreTextField = new JTextField();
    JLabel bookAvailabilityLabel = new JLabel();
    JTextField bookAvailabilityTextField = new JTextField();
    JButton borrowButton = new JButton();
    JComboBox<String> searchComboBox = new JComboBox<>();
    JButton loginButton = new JButton();
    JTextField searchTextField = new JTextField();
    JButton profileButton = new JButton();
    JButton searchButton = new JButton();
    JButton signupButton = new JButton();
    JButton cartButton = new JButton();
    JButton logoButton = new JButton();
    // Variables declaration - do not modify
    JButton addCartButton = new JButton();
    // End of variables declaration
}

