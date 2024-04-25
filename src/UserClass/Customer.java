package UserClass;

import BookClass.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.InputMismatchException;

import java.io.Serializable;
public class Customer extends User implements Serializable {
    private static final long serialVersionUID = 2032929425418533475L;
    private ArrayList<Borrow> borrowedBooks;
    private LocalDate registrationDate;
    private Double totalFine;


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

    public void setBorrowedBooks(ArrayList<Borrow> borrowedBooks) {
        this.borrowedBooks = borrowedBooks;
    }

    public void setRegistrationDate(LocalDate registrationDate) {
        this.registrationDate = registrationDate;
    }


    public void setTotalFine(Double totalFine) {
        this.totalFine = totalFine;
    }

    public Customer() {
        super();
    }
    public Customer(String username, String email, String password
            ,String gender, String phone, String address, LocalDate dateOfBirth) {

        super(username,email,password,phone,address,dateOfBirth,gender);
    }
}