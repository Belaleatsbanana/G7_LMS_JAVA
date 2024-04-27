package UserClass;

import BookClass.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.InputMismatchException;

import java.io.Serializable;
public class Customer extends User implements Serializable {
    private static final long serialVersionUID = 2032929425418533475L;
    private ArrayList<Borrow> borrowedBooks;
    private ArrayList<Book> wishList;
    private LocalDate registrationDate;
    private Double totalFine;
    private String profileimage;


    // Getters and Setters
    public ArrayList<Borrow> getBorrowedBooks() {
        return borrowedBooks;
    }

    public LocalDate getRegistrationDate() {
        return registrationDate;
    }

    public Double getTotalFine() {
        return totalFine;
    }

    public String getProfileimage(){return profileimage;}
    public void setBorrowedBooks(ArrayList<Borrow> borrowedBooks) {
        this.borrowedBooks = borrowedBooks;
    }

    public void setRegistrationDate(LocalDate registrationDate) {
        this.registrationDate = registrationDate;
    }

    public void setTotalFine(Double totalFine) {
        this.totalFine = totalFine;
    }

    public void setProfileimage(String profileimage){this.profileimage=profileimage;}
    public Customer() {
        super();
    }
    public Customer(String username, String email, String password
            ,String gender, String phone, String address, LocalDate dateOfBirth,String profileimage) {

        this( username,  email,  password, gender,  phone,  address,  dateOfBirth);
        this.profileimage = profileimage;
    }
    public Customer(String username, String email, String password
            ,String gender, String phone, String address, LocalDate dateOfBirth) {

        super(username,email,password,phone,address,dateOfBirth,gender);
        this.registrationDate = LocalDate.now();
        this.totalFine = 0.0;
        this.borrowedBooks = new ArrayList<Borrow>();
        this.profileimage = "./assets/default.png";
    }

    public ArrayList<Book> getWishList() {
        return wishList;
    }

    public void setWishList(ArrayList<Book> wishList) {
        this.wishList = wishList;
    }
}