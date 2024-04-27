/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Screens;

import BookClass.*;
import UserClass.Customer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

/**
 *
 * @author belal
 */
class BookPanel extends JPanel {
    JLabel titleLabel;
    JLabel genreLabel;
    JLabel authorLabel;
    JLabel imageLabel; // Add image label

    public BookPanel(String title, String author, String genre, ImageIcon imageIcon) {
        setLayout(new BorderLayout());
        JPanel infoPanel = new JPanel(new GridLayout(3, 1, 0, 5)); // Adjust vertical gap to 5
        titleLabel = new JLabel("Title: " + title, SwingConstants.CENTER);
        genreLabel = new JLabel("Genre: " + genre, SwingConstants.CENTER);
        authorLabel = new JLabel("Author: " + author, SwingConstants.CENTER);
        imageLabel = new JLabel(imageIcon); // Set image icon
        infoPanel.add(titleLabel);
        infoPanel.add(genreLabel);
        infoPanel.add(authorLabel);

        // Set font size for labels under the image
        titleLabel.setFont(new Font(titleLabel.getFont().getName(), Font.PLAIN, 12));
        genreLabel.setFont(new Font(genreLabel.getFont().getName(), Font.PLAIN, 12));
        authorLabel.setFont(new Font(authorLabel.getFont().getName(), Font.PLAIN, 12));

        // Add mouse listener to make the panel clickable
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // Handle click event, e.g., open book details, etc.
                System.out.println("Clicked on: " + title);
            }
        });

        add(imageLabel, BorderLayout.CENTER);
        add(infoPanel, BorderLayout.SOUTH);
    }


}
public class HomeScreen extends javax.swing.JFrame {

    /**
     * Creates new form HomeScreen
     */
    public HomeScreen(Customer customer) {
        initComponents();
        this.customer = customer;
        populateBookList();
        displayBooks();
    }
    private void populateBookList() {

        bookList.add(new Book("Book 1", "John Doe", Genre.FICTION,"./assets/default.png"));
        bookList.add(new Book("Book 2", "Jane Doe", Genre.MYSTERY,"./assets/default.png"));
        bookList.add(new Book("Book 3", "Alice", Genre.FICTION,"./assets/default.png"));
        bookList.add(new Book("Book 4", "Bob", Genre.MYSTERY,"./assets/default.png"));
        bookList.add(new Book("Book 5", "Charlie", Genre.FICTION,"./assets/default.png"));
        bookList.add(new Book("Book 6", "David", Genre.MYSTERY,"./assets/default.png"));

        bookList.add(new Book("Book 7", "John Doe", Genre.FICTION,"./assets/default.png"));
        bookList.add(new Book("Book 8", "Jane Doe", Genre.MYSTERY,"./assets/default.png"));
        bookList.add(new Book("Book 9", "Alice", Genre.FICTION,"./assets/default.png"));
        bookList.add(new Book("Book 10", "Bob", Genre.MYSTERY,"./assets/default.png"));
        // Add more books as needed
    }

    private void displayBooks() {
        // Clear existing books from the panel
        bookPanel.removeAll();

        // Calculate the start and end index for the current page
        int startIndex = (currentPage - 1) * booksPerPage;
        int endIndex = Math.min(startIndex + booksPerPage, bookList.size());

        // Set the layout for bookPanel
        bookPanel.setLayout(new GridLayout(0, 2, 10, 10)); // 2 columns with 10px horizontal and vertical gap

        // Add new book panels to the grid layout
        for (int i = startIndex; i < endIndex; i++) {
            Book book = bookList.get(i);
            // Assuming you have image icons stored in book object
            ImageIcon imageIcon = new ImageIcon(book.getImagePath()); // Replace this with actual path
            BookPanel panel = new BookPanel(book.getTitle(), book.getAuthor(), book.getGenreType().toString(), imageIcon);
            panel.setBorder(BorderFactory.createLineBorder(Color.BLACK)); // Optional: Add borders to each book panel
            bookPanel.add(panel);
        }

        // Fill remaining slots with empty panels
        int emptySlots = booksPerPage - (endIndex - startIndex);
        for (int i = 0; i < emptySlots; i++) {
            JPanel emptyPanel = new JPanel();
            emptyPanel.setBorder(BorderFactory.createLineBorder(Color.WHITE)); // Optional: Add borders to empty panels
            bookPanel.add(emptyPanel);
        }

        // Refresh the layout
        bookPanel.revalidate();
        bookPanel.repaint();
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        searchTextField = new javax.swing.JTextField();
        bookPanel = new javax.swing.JPanel();
        bookScrollPanel = new javax.swing.JScrollPane();
        signupButton = new javax.swing.JButton();
        cartButton = new javax.swing.JButton();
        searchComboBox = new javax.swing.JComboBox<>();
        loginButton = new javax.swing.JButton();
        profileButton = new javax.swing.JButton();
        searchButton = new javax.swing.JButton();
        logoButton = new javax.swing.JButton();
        prevPageButton = new javax.swing.JButton();
        nextPageButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        nextPageButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if ((currentPage * booksPerPage) < bookList.size()) {
                    currentPage++;
                    displayBooks();
                }
            }
        });

        prevPageButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (currentPage > 1) {
                    currentPage--;
                    displayBooks();
                }
            }
        });

        searchTextField.setText("Searching in titles");
        searchTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchTextFieldActionPerformed(evt);
            }
        });

        bookPanel.setLayout(new java.awt.GridLayout(1, 3));
        bookPanel.add(bookScrollPanel);

        signupButton.setText("Sign up");

        cartButton.setText("Cart");

        searchComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Title", "ISBN", "Keyword", "Author", "Genre" }));
        searchComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchComboBoxActionPerformed(evt);
            }
        });

        loginButton.setText("Login");

        profileButton.setText("Profile");

        searchButton.setText("Search!");
        searchButton.addActionListener(this::searchButtonActionPerformed);
        profileButton.addActionListener(this::profileButtonActionPerformed);
        cartButton.addActionListener(this::cartButtonActionPerformed);
        loginButton.addActionListener(this::loginButtonActionPerformed);
        signupButton.addActionListener(this::signupButtonActionPerformed);

        logoButton.setText("logo");

        prevPageButton.setText("Prev Page");

        nextPageButton.setText("Next Page");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(logoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                                        .addComponent(profileButton))
                                .addGap(0, 37, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bookPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                                .addGap(100, 100, 100)
                                .addComponent(prevPageButton, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(nextPageButton, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(90, 90, 90))
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
                                                                        .addComponent(profileButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(5, 5, 5)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(searchTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(searchComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(19, 19, 19)
                                                .addComponent(logoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(28, 28, 28)
                                .addComponent(bookPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(prevPageButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(nextPageButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>

    private void searchTextFieldActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void searchComboBoxActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }
    private void profileButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        ProfileScreen profile =new ProfileScreen(customer);
        profile.setVisible(true);
        this.setVisible(false);
        this.dispose();

    }

    private void cartButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void signupButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
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
            java.util.logging.Logger.getLogger(HomeScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeScreen(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private ArrayList<Book> bookList = new ArrayList<>();
    private Customer customer;
    private javax.swing.JPanel bookPanel;
    private javax.swing.JScrollPane bookScrollPanel;
    private javax.swing.JButton cartButton;
    private javax.swing.JButton loginButton;
    private javax.swing.JButton logoButton;
    private javax.swing.JButton nextPageButton;
    private javax.swing.JButton prevPageButton;
    private javax.swing.JButton profileButton;
    private javax.swing.JButton searchButton;
    private javax.swing.JComboBox<String> searchComboBox;
    private javax.swing.JTextField searchTextField;
    private javax.swing.JButton signupButton;

    private int currentPage = 1;
    private int booksPerPage = 6;
    // End of variables declaration
}
