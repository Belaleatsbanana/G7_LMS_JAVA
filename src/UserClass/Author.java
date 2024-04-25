package UserClass;

import java.time.LocalDate;
import java.util.ArrayList;
import BookClass.*;
public class Author extends User {
    private LocalDate dateOfDeath;
    private String biography;
    private String nationality;
    private Genre genre;
    private ArrayList<Book> books;

    // Default constructor
    public Author(String username, String gender,LocalDate dateOfBirth,String nationality,Genre genre) {

        super(username,dateOfBirth ,gender);
        this.nationality=nationality;
    }
    public Author(String username, String gender,LocalDate dateOfBirth,LocalDate dateOfDeath,String biography,String nationality,Genre genre) {

        this(username,gender,dateOfBirth,nationality,genre);
        this.dateOfBirth=dateOfBirth;
        this.biography=biography;
    }

    // Parameterized constructor with full details


    // Getters and Setters
    public LocalDate getDateOfDeath() {
        return dateOfDeath;
    }

    public void setDateOfDeath(LocalDate dateOfDeath) {
        this.dateOfDeath = dateOfDeath;
    }

    public String getBiography() {
        return biography;
    }

    public void setBiography(String biography) {
        this.biography = biography;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }

    // Method to add a book to the author's list of books
    public void addBook(Book book) {
        books.add(book);
    }

    // Method to remove a book from the author's list of books
    public void removeBook(Book book) {
        books.remove(book);
    }

    @Override
    public String toString() {
        return this.username;
    }
}
